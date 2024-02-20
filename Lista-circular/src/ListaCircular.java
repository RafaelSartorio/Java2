public class ListaCircular<T>
{
    private No<T> cabeca;
    private No<T> cauda;
    private int tamanholista;


    
    public ListaCircular() 
    {
        this.cabeca = null;
        this.cauda = null;
        this.tamanholista = 0;
    }

    public boolean isEmpity()
    {
        return this.tamanholista == 0 ? true : false;
    }

    public int size()
    {
        return tamanholista;
    }

    private No<T> getNo(int index)
    {
        if(this.isEmpity())
           throw new IndexOutOfBoundsException("A fila está vazia");
        
        if(index == 0)
            return this.cauda;
            
        No<T> auxiliarNo = cauda;

        for(int i = 0 ; (i < index) && (auxiliarNo != null); i++)
        {
            auxiliarNo = auxiliarNo.getNoProximo();
        }

        return auxiliarNo;
    }

    public void remove(int index)
    {
        No<T> noAuxiliar = this.cauda;

        if(index == this.tamanholista)
            throw new IndexOutOfBoundsException("O tamanho é maior que a lista");

        if(index == 0)
        {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        }
        else if(index == 1)
        {
            this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());
        }
        else
        {
            for(int i = 0; i <index-1 ; i++)
            {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        tamanholista --;
    }

    public void add(T conteudo)
    {
        No<T> novoNo = new No<>(conteudo);

        if(tamanholista == 0)
        {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;           
            this.cabeca.setNoProximo(this.cauda);
        }
        else
        {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        tamanholista ++;
    }

    public T get(int index)
    {
        No<T> pegarNo = getNo(index);

        return pegarNo.getConteudo();
    }

    @Override
    public String toString() 
    {
        String strRetorno = "";
        No<T> noAuxiliar = this.cauda;

        for(int i =0 ; i < this.size();i++)
        {
            strRetorno += "O nó "+ noAuxiliar.getConteudo() + "--->"; 
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        
        strRetorno += this.size() != 0 ? "(Retorna ao inicio)": "{}";

        return strRetorno;
        
       
    }

    

}
