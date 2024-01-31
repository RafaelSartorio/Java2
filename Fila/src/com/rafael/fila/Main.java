package com.rafael.fila;
import java.util.Scanner;

public class Main 
{
    static Scanner sc = new Scanner(System.in);
    private static int opcoes;
    public static void main(String[] args) 
    {
        do
        {
            Fila<String> minhaFila = new Fila<>();

            System.out.println("====== Menu de opções ======");
            System.out.println("1->Emfilerar \n2-> Desimfilerar \n3-> Mostar\n0-> Sair ");
            System.out.println("Escolja a opção: ");
            opcoes = sc.nextInt();
            sc.nextLine();

            switch (opcoes) 
            {
                case 1:
                    String obj;
                    System.out.println("Escreva o que você quer mandar: ");
                    obj = sc.nextLine();
                    minhaFila.enqueue(obj);
                    System.out.println("Adicionado com sucesso");
                    break;
            
                
                case 2:
                    minhaFila.dequeue();
                    System.out.println("Desimfilerado com sucesso");
                    break;
                
                case 3:
                    System.out.println(minhaFila.toString());

                    break;

                case 0:
                    System.out.println("Saindo ....");
            
                default:
                    System.out.println("Opção errada");
                    break;
            }
        }
        while(opcoes != 0);

        System.out.println("Obrigado e volte sempre");
        
    }    
}
