import java.util.Scanner;

public class casaVirtual{  
    public static void main(String[] args) {
        Lampada lampada= new Lampada();
        Scanner scanner= new Scanner(System.in);
        
        while(true){
            System.out.println("\nLâmpada: "+ lampada);
            System.out.println();
            System.out.println("1. Acender a Lâmpada;");
            System.out.println("2. Desligar a Lâmpada;");
            System.out.println("9. Sair da Casa;");
            System.out.println("\nDigite a opção desejada:");
            int opcao = scanner.nextInt();

            if(opcao==9){
                break;
            }
            
            if(opcao==1){
                lampada.ligar();
            }
            else if(opcao==2){
                lampada.desligar();
            }
            else{
                System.out.println("Opção inválida. Digite Novamente.");
            }
        }
    scanner.close();
    }
}