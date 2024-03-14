package com.rafael;

import java.io.*;

public class Exemplo {

    public static void CopiarArquivo() throws IOException{
        File f = new File("C:\\Users\\user\\Desktop\\Java\\Nova pasta\\bytes\\recomedacoes de filmes-copy.txt");
        String nameCopy = f.getName();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(nameCopy));

        String nomeArquivo = nameCopy.substring(0, nameCopy.indexOf("-")).concat("-copy2.txt");

        File fcopy = new File(nomeArquivo);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nomeArquivo));

        int line = 0;
        while ((line = bis.read()) != -1) {
            bos.write((char) line);
            bos.flush();        
        }
        bis.close();
        bos.close();

    }
    public static void main(String[] args) throws IOException {
        CopiarArquivo();
    }

}
