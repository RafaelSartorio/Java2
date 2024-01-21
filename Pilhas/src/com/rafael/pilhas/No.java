package com.rafael.pilhas;

public class No 
{
    private int num;
    private No Refno = null;
    
    
    public No(int num) {
        this.num = num;
    }


    public int getNum() {
        return num;
    }


    public void setNum(int num) {
        this.num = num;
    }


    public No getRefno() {
        return Refno;
    }


    public void setRefno(No refno) {
        Refno = refno;
    }


    public String toString() {
        return "No [num=" + num + "]";
    }

    
    

}
