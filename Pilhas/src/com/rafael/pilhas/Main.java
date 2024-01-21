package com.rafael.pilhas;

import java.util.Scanner; 

public class Main 
{
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) 
    {
        Pilha minhaPilha = new Pilha();  

        int opcao;
        do
        {
            System.out.println("-----------Menu de opções-----------");
            System.out.println("1-> Empilhar // 2-> Desempilhar // 3 -> Mostrar a piljar // 0 -> sair");
            System.err.println(" opção: ");
            opcao = sc.nextInt();
            
            switch (opcao) {
                case 1:
                    System.out.println("Digite o numero que deseja adicionar : ");
                    int novNo = sc.nextInt();
                    minhaPilha.push(new No(novNo));
                    System.out.println("Adiciondo com sucesso....");
                    break;
                
                case 2:
                    minhaPilha.pop();
                    System.out.println("Retirado com sucesso.....");
                    break;
                
                case 3:
                    System.out.println(minhaPilha);
                    break;
                
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("opção errada");
                    break;
            }
        }
        while(opcao != 0);
        System.out.println("Obrigado e volte sempre");
        

    }    
}
