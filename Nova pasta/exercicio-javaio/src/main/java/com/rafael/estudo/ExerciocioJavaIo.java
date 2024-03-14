package com.rafael.estudo;

import java.io.*;
import java.util.Scanner;

public class ExerciocioJavaIo {

    public static void InserirTxt() throws IOException{
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite o nome de 3 filmes");
        pw.flush();

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        File f = new File("recomedacoes de filmes.txt");

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        do {
            bw.write(line);
            bw.newLine();
            line = sc.nextLine();
            
        } while (!(line.equalsIgnoreCase("fim")));

        bw.flush();

        pw.close();
        sc.close();
        bw.close();

    }
    public static void main(String[] args) throws IOException {
        InserirTxt();
    }
  
}
