class ArmazenadorOrdenado extends  Armazenador{

    public ArmazenadorOrdenado(){
        this(TAMANHO_MINIMO);
    }
    public ArmazenadorOrdenado(int qtos){
        super(qtos);
    }

    public void ordenar(){
            for (int lento=0; lento<limite-1; lento++){ // verdinho do desenho
                for (int rapido=lento+1; rapido<limite; rapido++){ // marrom do desenho
                    // perceber se os valores estão em ordem inversa
                    if (vet[lento]>vet[rapido]){
                        // trocando os valores de posição
                        int aux = vet[lento];
                        vet[lento] = vet[rapido];
                        vet[rapido] = aux;
                    }
                }
            }
        }

    public int menorValor() throws Exception{
        if (estaVazio()) throw new Exception("Armazenador está vazio!"); ;

        int menor = vet[0];
        for (int i=1; i<limite; i++)
            if (menor>vet[i]){
                menor= vet[i];
            }
        return menor;
    }
    public int maiorValor() throws Exception{
        if (estaVazio()) throw new Exception("Armazenador está vazio!"); ;
        
        int maior = vet[0];
        for (int i=1; i<limite; i++)
            if (maior<vet[i]){
                maior=vet[i];
            }
        return maior;
    }

    public double mediaDeValores()  throws Exception{
        if (estaVazio()) throw new Exception("Armazenador está vazio!"); ;

        int soma=0;
        double media=0.0;
        for (int i=0; i<limite; i++)
            soma += vet[i];

        media = (double) soma/limite; // casting de soma para double
        return media;
    }
    public int qtosPares() throws Exception{
        if (estaVazio()) throw new Exception("Armazenador está vazio!"); ;
        int qtos=0;
        for (int i=0; i<limite; i++)
            if ((vet[i]%2)==0) // par
                qtos++;

        return qtos;
    }
    public int qtosImpares() throws Exception{
        if (estaVazio()) throw new Exception("Armazenador está vazio!"); ;
        int qtos=0;
        for (int i=0; i<limite; i++)
            if ((vet[i]%2)==1) // impar
                qtos++;

        return qtos;
    }
  
}