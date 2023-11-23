import java.util.Scanner;
import java.util.Random;

public class adivinha {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.println("**** ADIVINHAÇÃO ****");
        System.out.println("** Tente adivinhar o número sorteado!**");
        int iniciar;
        System.out.println("\nDigite 1 para iniciar: ");
        iniciar= teclado.nextInt();

        Random random = new Random();
        int numeroAleatorio=  random.nextInt(100) +1;


        while(iniciar==1){
            System.out.println("\nDigite seu chute: ");
            int chute= teclado.nextInt();

            if (chute==numeroAleatorio){
                System.out.println("Parabéns, você acertou!");
                break;
            }
            else{
                System.out.println("Tente Novamente! Resposta Incorreta");
            }
        }
    }
}
