class Principal {
    public static void main(String arq[]){
        Armazenador meusDados= new Armazenador(10);
        try{
            meusDados.armazenar(39);
            meusDados.armazenar(5);
            meusDados.armazenar(959);
            meusDados.armazenar(514);
            meusDados.armazenar(2);
            meusDados.armazenar(44);
            meusDados.armazenar(88);
            meusDados.armazenar(35475);
            meusDados.armazenar(4);
            meusDados.armazenar(777);
            meusDados.armazenar(6);
        }

        catch(Exception e){
            System.out.println("Erro: "+ e.getMessage());
        }
       
        System.out.println();
        System.out.println(meusDados);
        meusDados.descartar(35475);
        System.out.println();

        System.out.println(meusDados);
        System.out.println();
        
        meusDados.ordenar();
        System.out.println(meusDados);
        System.out.println();

        System.out.println("Menor Valor= "+ meusDados.menorValor());
        System.out.println("Maior Valor= "+ meusDados.maiorValor());
        System.out.println(("Média dos Elementos= "+ meusDados.mediaDeValor()));
        System.out.println("Qtd. de Pares= "+ meusDados.qtosPares());
        System.out.println("Qtd de Ímpares= "+ meusDados.qtosImpares());
    }
}