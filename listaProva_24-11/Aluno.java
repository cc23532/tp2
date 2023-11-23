import java.util.Arrays;

class Aluno extends aAluno{
    public static final int DEFAULT_LENGTH=5;

    private String Nome;
    private Avaliacao[] notas;
    private int limite=0;

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

    public void inserirAvaliacao(Avaliacao a) throws Exception{
        if (a==null){
            throw new Exception ("Avaliação inválida");
        }
        if (this.notas.length==DEFAULT_LENGTH){
            throw new Exception("As notas já estão fechadas para o cálculo de média");
        }

        notas[limite]= a;
        limite++;
    };
    
    public void removerAvaliacao(Avaliacao a) throws Exception{
         if (a==null){
            throw new Exception ("Avaliação inválida");
        }
        if (this.notas == null || this.notas.length == 0) {
            throw new Exception("O Aluno não possui mais avaliações para serem excluídas");
        }

        boolean encontrada= false;
        for(int i=0; i<this.notas.length; i++){
            if(this.notas[i].equals(a)){
                encontrada= true;
                break;
            }
        }
        if(!encontrada){
            throw new Exception("Avaliação não encontrada para remoção")
        }

    };

    public void ordenarAvaliacoesPorNome(){
        if (this.notas != null) {
            Arrays.sort(this.notas, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        }
    };

    public double media(){

    };
}