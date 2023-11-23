import java.util.Scanner;
import java.util.Random;

public class adivinhaChances {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("**** ADIVINHAÇÃO ****");
        System.out.println("** Tente adivinhar o número sorteado!**");
        int iniciar;
        System.out.println("\nDigite 1 para iniciar: ");
        iniciar= teclado.nextInt();

        Random random = new Random();
        int numeroAleatorio=  random.nextInt(100) +1;
        int chances= 5;


        while(iniciar==1){
            System.out.println("\n***** ATENÇÃO *****\nVocê possui um total de "+ chances+ " chances!");
            System.out.println("\nDigite seu chute: ");
            int chute= teclado.nextInt();

            if (chute==numeroAleatorio){
                System.out.println("\nParabéns, você acertou!");
                break;
            }
            else if(chute>numeroAleatorio){
                System.out.println("\nTente Novamente!\nO número "+ chute+ " é maior que o sorteado.");
                chances--;
            }
            else{
                System.out.println("\nTente Novamente!\nO número "+ chute+ " é menor que o sorteado.");
                chances--;
            }

            if (chances==0){
                System.out.println("\nQue Pena! Suas chances acabaram!\nO número sorteado era " + numeroAleatorio);
                break;
            }
        }
    }
}
