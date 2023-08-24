public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal aumentado para: " + smartTv.canal);

        smartTv.mudarCanal(13);
        System.out.println("Canal aumentado para: " + smartTv.canal);

        smartTv.desligarTv();
        System.out.println("Novo status -> TV ligada? " + smartTv.ligada);

    }
}
