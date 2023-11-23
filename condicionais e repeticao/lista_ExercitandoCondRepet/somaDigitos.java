import java.util.Scanner;

public class somaDigitos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** SOMA DOS DÍGITOS ****");
        System.out.print("\n\nDigite um número: ");
        int num= teclado.nextInt();
        int ultimo= num;
        int semUltimo= num;
        int resultado=0;

        while(ultimo!=0){
            ultimo= semUltimo%10;
            semUltimo= semUltimo/10;
            System.out.printf("\n"+ ultimo);
            resultado =resultado + ultimo;
        }

        System.out.print("\n\nO resultado da soma entre os dígitos é "+ resultado + ".");
    }
}
