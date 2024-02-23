package com.rafel.arvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>>
{
    private binNo<T> raiz;

    public ArvoreBinaria()
    {
        this.raiz = null;
    }
    
    public void inserir(T conteudo)
    {
        binNo<T> novNo = new binNo<>(conteudo);
        raiz = inserir(raiz,novNo);
    }

    private binNo<T> inserir(binNo<T> atual , binNo<T> novNo)
    {
        if(atual == null)
            return novNo;
        else if(novNo.getConteudo().compareTo(atual.getConteudo()) < 0)
            atual.setNoEsq(inserir(atual.getNoEsq(), novNo));
        else
            atual.setNoDir(inserir(atual.getNoDir(), novNo));

        return atual;      
    }

    public void exibirInOrder()
    {
        System.out.println("\n Exibindo in order");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(binNo<T> atual)
    {
        if(atual != null)
        {
            exibirInOrder(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ",");
            exibirInOrder(atual.getNoDir());
        }
    }

    public void exibirPosOrder()
    {
        System.out.println("\n Exibindo PosOrdem");
        exibirInOrder(this.raiz);
    }

    private void exibirPosOrder(binNo<T> atual)
    {
        if(atual != null)
        {
            exibirPosOrder(atual.getNoEsq());
            exibirPosOrder(atual.getNoDir());
            System.out.println(atual.getConteudo() + ",");
            
        }
    }

    public void exibirPreOrder()
    {
        System.out.println("\n Exibindo PosOrdem");
        exibirInOrder(this.raiz);
    }

    private void exibirPreOrder(binNo<T> atual)
    {
        if(atual != null)
        {
            System.out.println(atual.getConteudo() + ",");
            exibirPreOrder(atual.getNoEsq());
            exibirPreOrder(atual.getNoDir());
    
        }
    }

    @SuppressWarnings("unused")
    public void remover(T conteudo)
    {
        try
        {
            binNo<T> atual = this.raiz;
            binNo<T> pai = null;
            binNo<T> filho = null;
            binNo<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)) 
            {
                if(conteudo.compareTo(atual.getConteudo())< 0 )
                    atual = atual.getNoEsq();
                else
                    atual = atual.getNoDir();
            }

            if(atual == null)
                System.out.println("Conteúdo não encontardo // Bloco try");

            if(pai == null)
            {
                if(atual.getNoDir() == null)
                {
                    this.raiz = atual.getNoEsq();
                }
                else if(atual.getNoEsq() == null)
                {
                    this.raiz = atual.getNoDir();
                }
                else
                {
                    for(temp = atual , filho = atual.getNoEsq();filho.getNoDir()!= null ; temp = filho , filho = filho.getNoEsq())
                    {
                        if (filho != atual.getNoEsq()) 
                        {
                            temp.setNoEsq(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());    
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz = filho;
                }
            }
            else if (atual.getNoDir() == null) 
            {
                if (pai.getNoEsq()== atual) 
                    pai.setNoEsq(atual.getNoEsq() );    
                else
                    pai.setNoDir(atual.getNoEsq());
            }
            else if(atual.getNoEsq() == null)
            {
                if (pai.getNoEsq()== atual) 
                    pai.setNoEsq(atual.getNoDir() );    
                else
                    pai.setNoDir(atual.getNoDir());           
            }
            else
            {
                
            }
                                       
        }
        catch(NullPointerException erro)
        {
            System.out.println("Conteúdo não encontardo // Bloco catch");
        }
            
    }
}
