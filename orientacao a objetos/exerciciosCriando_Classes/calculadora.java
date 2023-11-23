package criando_Classes;
import java.util.Scanner;

class calculadora{
    Scanner scanner= new Scanner(System.in);
    int n1;
    int n2; 

    public void soma(){
        System.out.println("Digite um número: ");
        this.n1=scanner.nextInt();
        System.out.println("Digite um número: ");
        this.n2=scanner.nextInt();
        System.out.println("O resultado é " + (n1+n2)); ;
    }
    public void subtracao(){
        System.out.println("Digite um número: ");
        this.n1=scanner.nextInt();
        System.out.println("Digite um número: ");
        this.n2=scanner.nextInt();
        System.out.println("O resultado é " + (n1-n2));
    }
    public void multiplicacao(){
        System.out.println("Digite um número: ");
        this.n1=scanner.nextInt();
        System.out.println("Digite um número: ");
        this.n2=scanner.nextInt();
        System.out.println("O resultado é " + (n1*n2));
    }
    public void divisao(){
        System.out.println("Digite um número: ");
        this.n1=scanner.nextInt();
        System.out.println("Digite um número: ");
        this.n2=scanner.nextInt();
        System.out.println("O resultado é " + (n1/n2) + " e possui um resto equivalente a " + (n1%n2));
    }
}
