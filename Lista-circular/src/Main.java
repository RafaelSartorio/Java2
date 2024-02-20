public class Main 
{
    public static void main(String[] args) 
    {
        ListaCircular<String> minhaLista = new ListaCircular<>();    

        minhaLista.add("Gabriel");
        minhaLista.add("Ana paula");
        minhaLista.add("Paulo Cesar");
        minhaLista.add("Guilherme");
        minhaLista.add("Rafael");


        System.out.println(minhaLista);
        System.out.println(minhaLista.size());

        minhaLista.remove(4);

        System.out.println(minhaLista);
        System.out.println(minhaLista.size());
        
    }    
}
