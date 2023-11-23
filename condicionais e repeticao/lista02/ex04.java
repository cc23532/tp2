import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** SOMA DOS PARES ****");
        System.out.print("\nDigite um número: ");
        int num= teclado.nextInt();
        int i;
        int somador = num;


        for(i = num-1; i>0; i--){
            if(i%2==0){
                int resultado= somador+i;
                System.out.printf(somador + " + "+ i + " = " + resultado + "\n");
                somador=resultado;
            }
        }            
    }
}