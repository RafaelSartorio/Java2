public class SmartTv {
        boolean ligada = false;
        int canal = 1;
        int volume = 20;

        public void ligar()
        {
                ligada = true;
        }
        public void desligar()
        {
                ligada = false;
        }

        public void AumentarVolume()
        {
                volume ++;
        }
        public void DiminuirVolume()
        {
                volume --;
        }
        public void SubirCanal()
        {
                canal ++;
        }
        public void AbaixarCanal()
        {
                canal --;
        }
        public void Mudarcanal(int novoCanal)
        {
                canal = novoCanal;
        }

}

