import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** CONTAGEM REGRESSIVA ****");
        System.out.print("\nDigite um número: ");
        int num;
        num= teclado.nextInt();

        while(num!=0){
            System.out.printf( num +"\n");
            num--;
        }

    }
}

