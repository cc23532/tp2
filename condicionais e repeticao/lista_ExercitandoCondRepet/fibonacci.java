import java.util.*;
public class fibonacci{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.print("**** SEQUÊNCIA DE FIBONACCI ****");
        System.out.print("\n\nDigite N número para gerar uma sequência de N elementos utilizando Fibonacci (mínimo de 2 elementos): ");
        int num= teclado.nextInt();

        int xAtual=0;
        int xMenosDois= 1;
        int xAnterior= 1;
        int elementos= 2;

        while(elementos<num){
            xAtual=( xMenosDois+ xAnterior);
            System.out.println(xAtual + " ");

            xMenosDois= xAnterior;
            xAnterior= xAtual;

            elementos++;
        }

    }
}