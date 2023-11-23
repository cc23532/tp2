package criando_Classes;
import java.util.Scanner;

public class main_Menu {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        pet pet = new pet();
        dado dado = new dado();
        calculadora calculadora = new calculadora();
        System.out.println("Digite 1 para entrar: ");
        int entrar= scanner.nextInt(); 

        if(entrar==1){
            System.out.println("");
            pet.acorda();
            pet.latir();
            System.out.println("\n\t--Ops... Ele não está acostumado com visitas :/");
            System.out.println("\t--Mas fique tranquilo! Ele só late, não morde.");
            System.out.println("\t--Só fazer um carinho que ele fica mais calmo.");
            System.out.println("\t--Se quiser, tem alguns biscoitos ali na mesa, capaz dele fazer amizade mais rápido");
                
            while(true){
                System.out.println("");
                System.out.println("\t1.\t Fazer Carinho");
                System.out.println("\t2.\t Dar Biscoito");
                System.out.println("\t((\t Para seguir adiante, digite qualquer outro número...\t))");

                System.out.println("\nDigite a ação a ser tomada: ");
                int acao= scanner.nextInt();
                    
                if(acao==1){
                    System.out.println("");
                    pet.carinho();
                    pet.abanaRabo();
                    System.out.println("");
                }
                else if (acao==2){
                    System.out.println("");
                    pet.comer();
                    pet.abanaRabo();
                    System.out.println("");

                }
                else{
                    System.out.println("\nCerto... Vamos seguir a diante.");
                    pet.dormir();
                    break;
                }
            }
            while(true){
                System.out.println("\n\t-- Fique à vontade, o que deseja fazer agora?");
                System.out.println("\t-- Podemos jogar dados ou podemos brincar com a calculadora, se não quiser mais brincar com o pet.");
                System.out.println("\t1.\t Jogar Dados");
                System.out.println("\t2.\t Abrir Calculadora");
                System.out.println("\t3.\t Brincar com o Pet");

                System.out.println("\nDigite a ação a ser tomada: ");
                int acao= scanner.nextInt();
                if (acao==1){
                    while(true){
                        System.out.println("\t1.\t Sortear Número Aleatório");
                        System.out.println("\t2.\t Jogar 1x1");
                        System.out.println("\t((\t Para seguir adiante, digite qualquer outro número...\t))");

                        System.out.println("\n Digite a ação a ser tomada: ");
                        int dadoMenu = scanner.nextInt();
                        if(dadoMenu==1){
                            System.out.println("");
                            dado.jogarDado();
                            System.out.println("");
                        }
                        else if(dadoMenu==2){
                            System.out.println("");
                            dado.jogar1x1();
                            System.out.println("");
                        }
                        else{
                            System.out.println("");
                            System.out.println("\nCerto... Vamos seguir a diante.");
                            break;          
                        }
                    }
                    
                }
                
                else if(acao==2){
                        while(true){
                        System.out.println("\t****** CALCULADORA ******\n");
                        System.out.println("\n\t1.\tSoma");
                        System.out.println("\t2.\tSubtração");
                        System.out.println("\t3.\tMultiplicação");
                        System.out.println("\t4.\tDivisão");
                        System.out.println("\t((\t Para seguir adiante, digite qualquer outro número...\t))");

                        System.out.println("\n Digite a ação a ser tomada: ");
                        int calculadoraMenu= scanner.nextInt();

                        if(calculadoraMenu==1){
                            System.out.println("");
                            calculadora.soma();
                            System.out.println("");
                        }

                        else if(calculadoraMenu==2){
                            System.out.println("");
                            calculadora.subtracao();
                            System.out.println("");
                        }
                        else if(calculadoraMenu==3){
                            System.out.println("");
                            calculadora.multiplicacao();
                            System.out.println("");
                        }
                        else if(calculadoraMenu==4){
                            System.out.println("");
                            calculadora.divisao();
                            System.out.println("");
                        }
                        else{
                            System.out.println("");
                            System.out.println("\nCerto... Vamos seguir a diante.");
                            break;
                        }
                    }
                }
                else if (acao==3){
                    System.out.println("");
                    pet.acorda();
                    pet.latir();
                    pet.abanaRabo();
                    System.out.println("");

                    while(true){
                        System.out.println("\t1.\t Fazer Carinho");
                        System.out.println("\t2.\t Dar Biscoito");
                        System.out.println("\t3.\t Jogar Bolinha");
                        System.out.println("\t((\t Para seguir adiante, digite qualquer outro número...\t))");
                        int petMenu= scanner.nextInt();
                        if(petMenu==1){
                            System.out.println("");
                            pet.carinho();
                            pet.abanaRabo();
                            System.out.println("");
                        }
                        else if(petMenu==2){
                            System.out.println("");
                            pet.comer();
                            pet.abanaRabo();
                            System.out.println("");
                        }
                        else if(petMenu==3){
                            System.out.println("");
                            pet.latir();
                            pet.brincar();
                            pet.abanaRabo();
                            System.out.println("");
                        }
                        else{
                            System.out.println("");
                            pet.dormir();
                            System.out.println("\nCerto... Vamos seguir a diante.");
                            break;
                        }
                    }
                }
                else{
                    System.out.println("");
                    System.out.println("\nCerto... Até a próxima!");
                    break;
                }
                
            }
        }
    }
}
