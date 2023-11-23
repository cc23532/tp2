import java.util.Scanner;

public class fatorial_For {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("**** FATORIAL ****");
        System.out.print("\nDigite um número: ");
        int num= teclado.nextInt();
        if(num<0){
            System.out.print("Não serão aceitos números negativos. Tente novamente.");
            return;
        }
        int i;
        int somador = num;


        for(i = num-1; i>0; i--){
            int resultado= somador*i;
            System.out.printf(somador + " * "+ i + " = " + resultado + "\n");
            somador=resultado;
            if(i==1){
                break;
            }
        }            
    }

}
