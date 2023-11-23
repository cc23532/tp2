import java.util.Scanner;

public class fatorial_While {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** FATORIAL ****");
        System.out.print("\n\nDigite um número: ");
        int num= teclado.nextInt();
        if(num<0){
            System.out.print("Não serão aceitos números negativos. Tente novamente.");
            return;
        }
        int resultado=1;
        int num1= num;

        while(num1!=0){
            resultado =resultado * num1;
            num1--;
        }

        System.out.print("\n\nO resultado da fatorial de " + num +" é "+ resultado + ".");
    }
}
