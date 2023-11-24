import java.util.Arrays;

class Aluno extends aAluno{
    public static final int DEFAULT_LENGTH=5;

    private String Nome;
    private Avaliacao[] notas;
    private int limite=0;

    public Aluno(){
        this("<SemNome>", DEFAULT_LENGTH);
    }

    public Aluno(String nome){
        this(nome, DEFAULT_LENGTH);
    }

    public Aluno(int qtasAvaliacoes){
        this("<SemNome>", qtasAvaliacoes);
    }

    public Aluno(String nome, int qtasAvaliacoes) {
        this.setNome(nome);
    
        if (qtasAvaliacoes < DEFAULT_LENGTH) {
            qtasAvaliacoes = DEFAULT_LENGTH;
        }
    
        this.notas = new Avaliacao[qtasAvaliacoes];
        
        for (int i = 0; i < qtasAvaliacoes; i++) {
            this.notas[i] = new Avaliacao();
        }
    
        this.limite = 0;
    }
    
    public void setNome(String n){
        this.Nome= n;
    };

    public String getNome(){
        return this.Nome;
    };

    public boolean equals(Object outroAluno){
        if (this == outroAluno) {
            return true;
        }
        if (!(outroAluno instanceof Aluno)) {
            return false;
        }
        Aluno outro = (Aluno) outroAluno;
    
        return this.Nome.equals(outro.Nome);
    };

    public int compareTo(Object outroAluno){
        if (this == outroAluno) {
            return 0;
        }
        if (!(outroAluno instanceof Aluno)) {
            throw new IllegalArgumentException("Objeto passado não é um Aluno");
        }
        Aluno outro = (Aluno) outroAluno;
    
        return this.Nome.compareTo(outro.Nome);
    };

    public aAluno retornaClone(){
        try{
            return (Aluno)this.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
            return null;
        }
    };

    public Avaliacao[] getAvaliacoes(){
        return this.notas;
    };

    public String toString() {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < this.limite; i++) {
            result.append(notas[i].toString()).append("\n");
        }
        
        return result.toString();
    }

    public void inserirAvaliacao(Avaliacao a) throws Exception{
        if (a==null){
            throw new Exception ("Avaliação inválida");
        }
        if (this.limite==DEFAULT_LENGTH){
            throw new Exception("As notas já estão fechadas para o cálculo de média");
        }
        int onde= 0;

        if(onde<this.limite){
            if (notas[onde].equals(a)){
                throw new Exception("Avaliação já registrada");
            }
        }

        for (int i = this.limite; i > onde; i--) {
            notas[i] = notas[i - 1];
        }

        notas[0]= a;
        this.limite++;
    };
    
    public void removerAvaliacao(Avaliacao a) throws Exception{
         if (a==null){
            throw new Exception ("Avaliação inválida");
        }
        if (this.limite == 0) {
            throw new Exception("O Aluno não possui mais avaliações para serem excluídas");
        }
        int onde= 0;
        if (onde==this.limite){
            throw new Exception("Avaliação não encontrado");
        }

        while(onde<this.limite-1){
            notas[onde]= notas[onde+1];
            onde++;
        }

        this.limite--;

    };

    public void ordenarAvaliacoesPorNome(){
        if (this.notas != null) {
            Arrays.sort(this.notas, 0, this.limite, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        }
    };



    public double media(){
        if(this.limite==0){
            return 0.0;
        }

        double soma= 0.0;
        int somaPeso=0;
        for (int i=0; i<this.limite; i++){
            soma += ((this.notas[i].getNota())*(this.notas[i].getPeso()));
            somaPeso += this.notas[i].getPeso();
        }

        return soma/somaPeso;
    };
}