public class principal {
    public static void main(String[] args) {
        Lampada lampadaDaSala= new Lampada();
        Lampada lampadaDaCozinha= new Lampada();
        
        lampadaDaSala.ligar();
        System.out.println("Lampada da Sala...: "+ lampadaDaSala);
        System.out.println("Lampada da Cozinha: "+lampadaDaCozinha);

        lampadaDaCozinha.ligar();
        System.out.println("\nLampada da Sala...: "+ lampadaDaSala);
        System.out.println("Lampada da Cozinha: "+lampadaDaCozinha);


        lampadaDaSala.desligar();
        System.out.println("\nLampada da Sala...: "+ lampadaDaSala);
        System.out.println("Lampada da Cozinha: "+lampadaDaCozinha);

        lampadaDaCozinha.desligar();
        System.out.println("\nLampada da Sala...: "+ lampadaDaSala);
        System.out.println("Lampada da Cozinha: "+ lampadaDaCozinha);
        }
    }
