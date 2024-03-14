package com.rafael;

import java.io.*;
import java.util.*;

public class ExemploIoata {
    
    public static void IncluirProduto() throws IOException{
        File f = new File("C:\\Users\\user\\Desktop\\peca-de-roupa.bin");

        PrintStream ps = new PrintStream(System.out);
        ps.flush();

        DataOutputStream dos = new DataOutputStream(new FileOutputStream(f.getPath()));

        Scanner sc = new Scanner(System.in);

        ps.print("Digite o nome da roupa: ");
        String nome = sc.nextLine();
        dos.writeUTF(nome);
        
        ps.print("Digite o tamanho da peça(P/M/G/U)");
        char tamanho = (char) System.in.read();
        dos.writeChar(tamanho);

        ps.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();
        dos.writeInt(quantidade);

        ps.print("Digite o valor: ");
        double valor = sc.nextDouble();
        dos.writeDouble(valor);

        sc.close();
        dos.close();
         
    }

    public static void LerProduto()throws IOException {
        File f = new File("C:\\Users\\user\\Desktop\\peca-de-roupa.bin");
        

        DataInputStream dis = new DataInputStream(new FileInputStream(f));

        String nome = dis.readUTF();
        char tamanho = dis.readChar();
        int quantidade = dis.readInt();
        double valor = dis.readDouble();

        System.out.println("--------------------------------------");
        System.out.printf("Nome ----------> %s" , nome);
        System.out.printf("\ntamanho--------> %s" , tamanho);
        System.out.printf("\nQuantiade------> %d" , quantidade);
        System.out.printf("\nNome-----------> %.2f\n" , valor);
        System.out.println("-----------------------------------------");

    }

    public static void main(String[] args) throws IOException {
        LerProduto();
    }
}
