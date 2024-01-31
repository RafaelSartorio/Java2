package com.rafael.fila;

public class Fila<T> 
{
    private No<T> refEntradaFila;
    
    public Fila()
    {
        this.refEntradaFila = null;
    }

    public boolean isEmpity()
    {

        if(refEntradaFila == null)
        {
            return true;
        }
        return false;
        
    }

    public void enqueue(T objeto) //Enfilerar
    {
        No<T> novNo = new No<>(objeto);
        novNo.setRefNo(refEntradaFila);
        refEntradaFila = novNo;
    }  

    public T first()
    {
        if(!this.isEmpity())
        {
            No<T> primeirNo = refEntradaFila;
            while (true) 
            {
                if (primeirNo.getRefNo() != null) 
                {
                    primeirNo = primeirNo.getRefNo();
                }
                else
                    break;
            }
            return (T) primeirNo.getObject();
        }

        return null;

    }

    public T dequeue()
    {
        if(!this.isEmpity())
        {
            No<T> primeirNo = refEntradaFila;
            No<T> noAuxiliar =refEntradaFila; 
            while (true) 
            {
                if (primeirNo.getRefNo() != null) 
                {
                    noAuxiliar = primeirNo;
                    primeirNo = primeirNo.getRefNo();
                }
                else
                {
                    noAuxiliar.setRefNo(null);
                    break;
                }
                    
            }
            return (T)primeirNo.getObject();
        }

        return null;

    }

    
    public String toString() 
    {
        String stringRetorno = "";
        No noAuxiliar = refEntradaFila;

        if(refEntradaFila != null)
        {
            while (true)
            {
                stringRetorno += "O nó " + noAuxiliar.getObject() + " --->";
                if(noAuxiliar.getRefNo() != null)
                {
                    noAuxiliar = noAuxiliar.getRefNo();
                }
                else
                {
                    stringRetorno += "null";
                    break;
                }
            }
        }
        else
        {
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}

    


