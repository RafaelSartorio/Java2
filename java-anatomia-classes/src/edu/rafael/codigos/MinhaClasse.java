package edu.rafael.codigos;
public class MinhaClasse 
{
    public static void main (String [] args)
    {
        String primeiro_nome = "Rafael";
        String Segundo_nome = "Sartorio";

        String completo = nomeCompleto(primeiro_nome, Segundo_nome);

        System.out.println(completo);
    }

    public static String nomeCompleto( String primeiro_nome, String Segundo_nome)
    {
        return primeiro_nome.concat(" ").concat(Segundo_nome);
    }
}