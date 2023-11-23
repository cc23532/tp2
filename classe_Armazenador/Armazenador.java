class Armazenador {
    public static int TAMANHO_MINIMO= 10;
    public static int TAMANHO_MAXIMO= 100;

    
    //Atributos
    private int vet[];
    private int limite;

    //Métodos
    public Armazenador(){
        this(TAMANHO_MINIMO);
    }   
    
    public Armazenador(int qtos){
        if(qtos<TAMANHO_MINIMO){
            qtos=TAMANHO_MINIMO;
        }

        if(qtos<TAMANHO_MAXIMO){
            qtos=TAMANHO_MAXIMO;
        }

        vet = new int[qtos];
        limite= 0;
    }

    public void armazenar(int elemento) throws Exception{
        if(this.limite== vet.length){
            throw new Exception("Armazenador está cheio!");
        }

        vet[this.limite]= elemento;
        this.limite++;
    }

    public void descartar(int elemento){
        for (int i=0; i<this.limite; i++){
            if(vet[i]== elemento){
                //deslocar os elementos
                for(int j=i; j<this.limite-1; j++){
                    vet[j]= vet[j+1];
                }

                //decrementar o limite
                this.limite--;
            }
        }
    }

    public void ordenar(){
        for(int lento= 0; lento<limite-1; lento++){
            //perceber se os valores estão em ordem
            for(int rapido=lento+1; rapido<limite; rapido++){
                if(vet[lento]> vet[rapido]){
                    //trocando os valores de posição
                    int aux= vet [lento];
                    vet[lento]= vet[rapido];
                    vet[rapido]= aux;
                }
            }
        }
    }

    public int menorValor(){
        int menor= vet[0];
        for(int i=0; i<limite; i++){
            if(vet[i]<menor){
                menor= vet[i];
            }
        }
        return menor;
    }
    public int maiorValor(){
        int maior= vet[0];
        for(int i=0; i<limite; i++){
            if(vet[i]>maior){
                maior= vet[i];
            }
        }
        return maior;
    }
    public double mediaDeValor(){
        double soma= 0;
        for(int i= 0; i<limite; i++){
            soma += vet[i];
        }
        return soma/limite; //cálculo de média
    }
    public int qtosPares(){
        int pares= 0;
        for (int i=0; i<limite; i++){
            if ((vet[i])%2== 0){
                pares++;
            }
        }
        return pares;
    }
    public int qtosImpares(){
        int impares= 0;
        for (int i=0; i<limite; i++){
            if ((vet[i])%2 != 0){
                impares++;
            }
        }
        return impares;    }

    public String toString(){
        String retorno="Utilizados= "+ this.limite+ "/"+ vet.length+ "\n[";
        for (int i=0; i<this.limite; i++){
            retorno= retorno+" "+ vet[i];
        }
        return retorno+" ]";
    }
}