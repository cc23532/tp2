package criando_Classes;
import java.util.Random;


class dado{
    //Atributos 
    Random random = new Random();
    int n1;
    int n2;
    //Métodos

    public void jogarDado(){
        this.n1=  random.nextInt(6) +1;
        System.out.println("O número sorteado foi "+ n1);

    }
    
    public void jogar1x1(){
        this.n1=  random.nextInt(6) +1;
        this.n2=  random.nextInt(6) +1;
        if(n1>n2){
            System.out.println("O primeiro número ("+ this.n1 + ") é maior que o segundo ("+ this.n2+")" );
        }
        else if(n1<n2){
            System.out.println("O primeiro número ("+ this.n1 + ") é menor que o segundo ("+ this.n2+")" );
        }
        else{
            System.out.println("O primeiro número ("+ this.n1 + ") é igual ao segundo ("+ this.n2+")" );

        }

    }
}

