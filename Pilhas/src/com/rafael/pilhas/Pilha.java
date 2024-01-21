package com.rafael.pilhas;

public class Pilha 
{
    private No refEntradaPilha;

    public Pilha() 
    {
        refEntradaPilha = null;
    }

    public void push(No novoNo)  // Empilhar 
    {
        No refauxiliar = refEntradaPilha;
        refEntradaPilha = novoNo;
        refEntradaPilha.setRefno(refauxiliar);
    }

    public No pop() // Desempilhar 
    {
        if(this.IsEmpity())
        {
            return null;
        }
        
        No no_poped = refEntradaPilha;
        refEntradaPilha = refEntradaPilha.getRefno();
        return no_poped;
    }


    public No top() // Mostarr o topo da pilha 
    {
        return refEntradaPilha;
    }

    public boolean IsEmpity() // verificar se a pilja está vazia 
    {
        if(refEntradaPilha == null)
            return true;

        return false;
    }   

    public String toString() // É como a interface da pilha 
    {
        String stringRetorno = "---------------\n";
        stringRetorno += "Pilha \n";
        stringRetorno += "-----------------\n"; 

        No refauxiliar = refEntradaPilha;

        while (true) 
        {
            if(refauxiliar != null)
            {
                stringRetorno += "[Nó dado " + refauxiliar.getNum() + "] \n";
                refauxiliar = refauxiliar.getRefno();
            }    
            else 
                break;               
        }

        stringRetorno += "-----------------\n";
        return stringRetorno;
    }
    
}
