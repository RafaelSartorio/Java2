package com.rafael.estudo;

import java.io.*;
import java.util.Scanner;

public class Exerciocio3Javaaio {
    static public void CopiarArquivo() throws IOException{
        File f =  new File("C:\\Users\\user\\Desktop\\Java\\Nova pasta\\exercicio3javaio\\recomedacoes de filmes.txt");
        String nameArquivo = f.getName();

        BufferedReader br = new BufferedReader(new FileReader(nameArquivo));
        String line = br.readLine();

        String copiaNome = nameArquivo.substring(0, nameArquivo.indexOf(".")).concat("-copy.txt");
        File fCopy = new File(copiaNome);

        BufferedWriter bw = new BufferedWriter(new FileWriter(fCopy.getName()));

        do {
            bw.write(line);
            bw.newLine();
            line = br.readLine();

        } while (!(line == null));

        System.out.println("O arquivo " + fCopy.getName() + "foi criado com sucesso");

        PrintWriter pr = new PrintWriter(System.out);
        pr.println("Recomende 3 livros");
        pr.flush();

        AdicionarArquivo(fCopy.getName());

        bw.flush();
        bw.close();
    }

    public static void AdicionarArquivo(String arquivo) throws IOException{
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo));

        do {
            bw.write(line);
            bw.newLine();
            line = sc.nextLine();

        } while (!(line.equalsIgnoreCase("fim")));

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("O arquivo foi atualizado");
        pw.flush();

        bw.close();
        sc.close();

    }

    public static void main(String[] args) throws IOException {
        CopiarArquivo();
        
    }

}
