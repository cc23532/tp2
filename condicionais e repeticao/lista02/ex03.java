import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** NÚMERO PRIMO OU NÃO ****");
        System.out.print("\nDigite um número: ");
        int num= teclado.nextInt();
        int i;
        int divisores = 0;

        for(i = num; i>0; i--){
            if(num%i==0){
                divisores++;
            }
        }    
        
        if(divisores>2){
            System.out.println("\nO número "+ num + " não é primo, pois possui "+ divisores +" divisores.");
        }
        else{
            System.out.println("O número "+ num + " é primo.");
        }
    }
}