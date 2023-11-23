import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("****JUSTIÇA ELEITORAL****");
        System.out.print("Digite seu nome: ");
        String Nome= teclado.next();

        System.out.print("Digite sua idade:");
        int idade= teclado.nextInt();

        if(idade<16){
            System.out.print("SEJA BEM VINDO, "+ Nome+ ", VOCÊ AINDA NÃO ESTÁ APTO A VOTAR POIS AINDA NÃO ATINGIU A IDADE MÍNIMA!");
        }
        else{
            if(16<idade){
                if(idade<18){
                    System.out.print("SEJA BEM VINDO, "+ Nome+ ", VOCÊ ESTÁ APTO A VOTAR SEM A OBRIGATORIEDADE LEGAL");
                }
                else{
                    if(idade<70){
                        System.out.print("SEJA BEM VINDO, "+ Nome+ ", VOCÊ JÁ ATINGIU A IDADE PARA O VOTO OBRIGATÓRIO");
                    }
                    else{
                        System.out.print("SEJA BEM VINDO, "+ Nome+ ", VOCÊ ESTÁ APTO A VOTAR SEM A OBRIGATORIEDADE LEGAL");
                    }
                }
            }
        }

        teclado.close();}
}