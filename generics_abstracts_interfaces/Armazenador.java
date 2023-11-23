class Armazenador<Tipo>{
    public static final int DEFAULT_LENGTH = 10;

    private String nome;
    private Tipo[] vetor;
    private int limite;

    public Armazenador(){
        this("Sem Nome", DEFAULT_LENGTH);
    }
    public Armazenador(int qtos){
        this("Sem Nome", qtos);
    }
    public Armazenador(String nome){
        this(nome, DEFAULT_LENGTH);
    }
    public Armazenador(int qtos, String nome){
        this(nome, qtos);
    }
    public Armazenador(String nome, int qtos){
        this.nome = nome;

        if (qtos<DEFAULT_LENGTH) qtos = DEFAULT_LENGTH;
        this.vetor = (Tipo[])new Object[qtos];
        this.limite = 0;
    }

    public void excluir(Tipo l) throws Exception{
        if (l==null) throw new Exception("Objeto Inválido");
        if (limite==0) throw new Exception("Armazenador Vazio");
        int onde = 0;
        for (; onde<this.limite; onde++){
            if (vetor[onde].equals(l)) break;
        }
        if (onde==this.limite)throw new Exception("Objeto não encontrado");

        while (onde <this.limite-1){
            vetor[onde] = vetor[onde+1];
            onde++;
        }
        limite--;        
    }
    public void incluir(Tipo l) throws Exception{
        if (l==null) throw new Exception("Objeto Inválido");
        if (limite==vetor.length) throw new Exception("Sem espaço");
        int onde = 0;
        for (; onde<this.limite; onde++){
            if (vetor[onde].equals(l)) break;
        }        
        if (onde<this.limite) 
            if (vetor[onde].equals(l))
                    throw new Exception("Objeto já está armazenado");

        // deslocar todos a partir desse lugar pra frente
        for (int i=this.limite; i>onde ; i--){
            vetor[i] = vetor[i-1];
        }

        // colocar o l na posicao do elemento maior
        vetor[onde] = l;
        limite++;
    }

    // public boolean pertence(Tipo l){
    //     int onde = ondeEsta(l);
    //     if (onde == this.limite)  return false;

    //     return (vetor[onde].equals(l));
    // }

    public String toString(){
        String retorno="Ocupação "+ this.nome + ": " +this.limite+" de "+vetor.length;

        for (int i=0; i<this.limite; i++){
            retorno += "\n" + vetor[i] + " ";
        }
        return retorno;
    }
}