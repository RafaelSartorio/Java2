package edu.rafael.codigos;
public class BoletimEstuantil
{
    public static void main(String[] args)
    {
        int mediaFinal = 7;

        if(mediaFinal < 6)   
            System.out.println("Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Na media");
        else
            System.out.println("Aprovado");
    }
}
