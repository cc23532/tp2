import java.util.Scanner;
public class numPrimo{
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);

        System.out.print("**** NÚMERO PRIMO OU NÃO ****");
        System.out.print("\nDigite um número: ");
        int num= teclado.nextInt();
        if(num<0){
            System.out.print("Não serão aceitos números negativos. Tente novamente.");
            return;
        }
        
        int i;
        int divisores= 0;
        for(i=1; i<= num; i++){
            if(num%i==0){
                divisores++;
            }
        }

        if(divisores==2){
            System.out.println("O número " + num+ " é primo pois possui " + divisores + " divisores.");
        }
        else{
            System.out.println("O número " + num+ " não é primo pois possui " + divisores + " divisores.");

        }

    }
 
}
