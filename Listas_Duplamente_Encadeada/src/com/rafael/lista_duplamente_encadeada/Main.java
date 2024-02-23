package com.rafael.lista_duplamente_encadeada;

public class Main 
{
    public static void main(String[] args) 
    {
        ListaDuplamenteEncadiada<String> minhaLista = new ListaDuplamenteEncadiada<>();
        
        minhaLista.add("gabriel");
        minhaLista.add("ana");
        minhaLista.add("paulo");
        minhaLista.add("geovanna");


        minhaLista.remover(0);

        System.out.println(minhaLista.toString());
    }    
}
