import java.util.Scanner;
public class List01_ex01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int Num1= teclado.nextInt();

        System.out.print("Digite um número inteiro: ");
        int Num2= teclado.nextInt();
                
        if (Num1>Num2){
            System.out.print(Num1+ "é maior que "+ Num2);
        }else{
            if(Num2>Num1){
                System.out.print(Num2+ "é maior que "+ Num1);
            }else{
                System.out.print(Num2+ "é igual a "+ Num1);

            }
        }
        teclado.close();
    }   
}
