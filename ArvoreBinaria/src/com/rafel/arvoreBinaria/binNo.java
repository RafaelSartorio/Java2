package com.rafel.arvoreBinaria;

public class binNo<T extends Comparable <T>>
{
    private T conteudo;
    private binNo<T> noEsq;
    private binNo<T> noDir;

    public binNo(T conteudo)
    {
        this.conteudo = conteudo;
        this.noDir = null;
        this.noEsq = null;       
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public binNo<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(binNo<T> noEsq) {
        this.noEsq = noEsq;
    }

    public binNo<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(binNo<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "binNo [conteudo=" + conteudo + "]";
    }

    
}
