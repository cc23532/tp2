import java.util.Scanner;
    public class ex01 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);

            System.out.print("**** TABUADA ****");
            System.out.print("\nDigite um número: ");
            int num;
            num= teclado.nextInt();
            int multiplicador= 1;

            while(multiplicador <= 10){
                int resultado= num*multiplicador;
                System.out.printf(num +" * "+ multiplicador+ " = " + resultado+"\n");
                multiplicador ++;
            }
        }
}