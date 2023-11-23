class Principal{
    public static void main(String arq[]) {

        ArmazenadorOrdenado meusDados = new ArmazenadorOrdenado();

        try{
            meusDados.armazenar(7);
            meusDados.armazenar(5);
            meusDados.armazenar(4);
            meusDados.armazenar(6);
            meusDados.armazenar(8);
            meusDados.armazenar(1);
        } catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }
      
         try{
                
                System.out.println("Vetor: " + meusDados);
                System.out.println();
                System.out.println("Menor Valor: " + 
                    ((ArmazenadorOrdenado)meusDados).menorValor());
                // System.out.println("Maior Valor: " + meusDados.maiorValor());
                // System.out.println("Media......: " + meusDados.mediaDeValores());
                // System.out.println("Pares......: " + meusDados.qtosPares());
                // System.out.println("Impares....: " + meusDados.qtosImpares());


           } catch(Exception e){
            System.out.println("Erro de Busca: " + e.getMessage());
        }
    }
}