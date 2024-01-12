import java.util.Scanner;

public class ContaBancaria 
{
    Scanner scanner = new Scanner(System.in);

    int Saldo = 100;
    
    public void sacar(int valorSaque)
    {
        System.err.println("Seu saldo atual eh "+ Saldo);
    
        System.out.println("Quanto vc deseja sacar?");
        valorSaque = scanner.nextInt();

        if(Saldo < valorSaque )
            System.out.println("Saldo insuficiente");
        else
            System.out.println("saque efetuado com sucesso");
        int novoSaldo = Saldo - valorSaque;
        Saldo = novoSaldo;

    }

    public void Extrato()
    {
        System.out.println("O seu saldo atual eh "+ Saldo);
    }

    public void Depositar(int valorDeposito)
    {
        System.out.println("Quanto vc deseja epositar: ");
        valorDeposito = scanner.nextInt();

        int novoSaldo = Saldo + valorDeposito;
        Saldo = novoSaldo;
        System.out.println("Deposito efetuado com sucesso, seu novo saldo eh " + Saldo);
    }

}

