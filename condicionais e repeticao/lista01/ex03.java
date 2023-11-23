import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("****DETRAN****");
        System.out.print("Digite seu nome: ");
        String Nome= teclado.next();

        System.out.print("Digite sua idade:");
        int idade= teclado.nextInt();

        if(idade<18){
            System.out.print("SEJA BEM VINDO, "+ Nome+ ", VOCÊ AINDA NÃO ESTÁ APTO A TIRAR A CNH POIS AINDA NÃO ATINGIU A IDADE MÍNIMA!");
        }
        else{
            if(16<idade){
                System.out.print("SEJA BEM VINDO, "+ Nome+ ", VOCÊ JÁ ESTÁ APTO A TIRAR A CNH!");
        }

        teclado.close();}
    }
}
