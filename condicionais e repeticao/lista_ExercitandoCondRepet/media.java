import java.util.ArrayList;
import java.util.Scanner;
public class media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("**** CÁLCULO DE MÉDIA ****");
        int qtdNum;
        ArrayList<Integer>numeros= new ArrayList<>();
        
        for(qtdNum=1; qtdNum<=10; qtdNum++){
            System.out.println("Digite um número: ");
            numeros.add((teclado.nextInt()));
        }

        int soma = 0;
        for (Integer n : numeros) {
            soma += n.intValue();
        }

        System.out.println("\nA soma é " + soma);
        int media= (soma/qtdNum);

        System.out.println("\nA média calculada é igual a " + media);
    }

}
