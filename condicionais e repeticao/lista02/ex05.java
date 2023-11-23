import java.util.Scanner;


public class ex05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** DIVISORES POR 3 ****");
        System.out.print("\n\nDigite um número: ");
        int num= teclado.nextInt();
        int i;
        int somador= 1;


        for(i = num-1; i>0; i--){
            if(i%3==0){
                somador++;
            }            
        }
        System.out.print("O número digitado (" + num +") possui " + somador +" números entre ele e 1 que são divisíveis por 3.");
            
    }
}
