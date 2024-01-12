public class usuario 
{
    public static void main(String[] args) 
    {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("A tv estah ligada? " + smartTv.ligada);
        System.out.println("O volume da tv: " + smartTv.volume);
        System.out.println("O canal: " + smartTv.canal);

        System.out.println("-------------------------------------------------------------------------");
 
        smartTv.ligar();
        smartTv.Mudarcanal(25);
        smartTv.AumentarVolume();

        System.out.println("A tv estah ligada? " + smartTv.ligada);
        System.out.println("O volume da tv: " + smartTv.volume);
        System.out.println("O canal: " + smartTv.canal);

    }
}
