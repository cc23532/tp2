import java.util.Scanner;
class Principal{

    public static final int MAX_LAMPADAS = 5;

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        System.out.println("====>>> Manipulando Lampadas");

        // criando e instanciando o VETOR
        Lampada lampadasDaSala[] = new Lampada[MAX_LAMPADAS];

        for (int i=0; // inicialização de variável
             i<MAX_LAMPADAS;     // condição de PERMANENCIA
             i++){    // joga contra a condição

                // instanciando uma LAMPADA
                lampadasDaSala[i] = new Lampada(); 
        }

        int qualLampada=0;
        int qualOperacao=0;
        while(true){
            System.out.println("Qual Lâmpada [0.."+(MAX_LAMPADAS-1)+"]? ");
            qualLampada = teclado.nextInt();

            System.out.println("[1]Ligar [2]Desligar ... ");
            qualOperacao= teclado.nextInt();

            if (qualOperacao==1){
               lampadasDaSala[qualLampada].ligar();
            }else {
               if (qualOperacao==2){
                   lampadasDaSala[qualLampada].desligar();
               }
            }
            mostraVetor(lampadasDaSala);
        }

    }

    private static void mostraVetor(Lampada[] L){
        System.out.print("Lampadas: ");
        for (int i=0; i<MAX_LAMPADAS; i++)
            System.out.print(L[i] + " ");

        System.out.println();

    }

}