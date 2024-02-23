package com.rafael.lista_duplamente_encadeada;

public class ListaDuplamenteEncadiada<T> 
{
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNO;
    private int tamanhoLista;

    public ListaDuplamenteEncadiada()
    {
        this.primeiroNo = null;
        this.ultimoNO = null;
        this.tamanhoLista = 0;
    }

    public int size()
    {
        return tamanhoLista;
    }

    public T get(int index)
    {
        return getNo(index).getConteudo();
    }

    private NoDuplo<T> getNo(int index)
    {
        NoDuplo<T> noAuxiliar = primeiroNo;

        for(int i = 0 ; (i < index) && (noAuxiliar != null); i++)
        {
            noAuxiliar = noAuxiliar.getNoProximo();
        }

        return noAuxiliar;
    }

    public void add(T elemento)
    {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNO);

        if (primeiroNo == null) 
        {
            primeiroNo = novoNo;    
        }
        if (ultimoNO != null) 
        {
            ultimoNO.setNoProximo(novoNo);    
        }
        ultimoNO = novoNo;
        tamanhoLista++;

    }

    public void add(int index, T elemento)
    {
        NoDuplo<T> noAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<T>(elemento);
        novoNo.setNoProximo(noAuxiliar);

        if (novoNo.getNoProximo() != null) 
        {
               novoNo.setNoPrevio(noAuxiliar.getNoPrevio());
               novoNo.getNoProximo().setNoPrevio(novoNo); 
        }
        else
        {
            novoNo.setNoProximo(ultimoNO);
            ultimoNO = novoNo;
        }
        
        if(index == 0)
            primeiroNo = novoNo;
        else
            novoNo.getNoPrevio().setNoPrevio(novoNo);

        tamanhoLista ++ ; 
    }
    
    public void remover(int index)
    {
        if (index == 0 ) 
        {
            primeiroNo = primeiroNo.getNoProximo();
            if(primeiroNo != null)
                primeiroNo.setNoPrevio(null);

        }
        else
        {
            NoDuplo<T> noAuxilair = getNo(index);
            noAuxilair.getNoPrevio().setNoProximo(noAuxilair.getNoProximo());
            if (noAuxilair != ultimoNO)
            {
                noAuxilair.getNoPrevio().setNoPrevio(noAuxilair.getNoPrevio());    
            }
            else
                ultimoNO = noAuxilair;
        }
        tamanhoLista --;
    }

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxiliar = primeiroNo;
        
        for(int i = 0; i < size()-1 ; i++)
        {
            strRetorno += "O nó " + noAuxiliar.getConteudo() + " ---> ";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += null;

        return strRetorno;
    }
    
    
}
     


