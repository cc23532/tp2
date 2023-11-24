import java.util.Arrays;

class Disciplina implements iDisciplina{
    public static final int DEFAULT_LENGTH=10;
    private String nome;
    private aAluno[] alunos;
    private int limite=0;

    public Disciplina(){
        this.alunos= new aAluno[DEFAULT_LENGTH];
    }

    public Disciplina(String nome){
        this(nome, DEFAULT_LENGTH);
    }

    public Disciplina(String nome, int qtosAlunos){
        this.setNome(nome);
    
        if (qtosAlunos < DEFAULT_LENGTH) {
            qtosAlunos = DEFAULT_LENGTH;
        }
    
        this.alunos = new aAluno[qtosAlunos];
        
        for (int i = 0; i < qtosAlunos; i++) {
            this.alunos[i] = new Aluno();
        }
    
        this.limite = 0;
    }

    public void setNome(String nome){
        this.nome= nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void inserirAluno(aAluno a)throws Exception{
        if (a==null){
            throw new Exception ("Aluno inválido");
        }
        if (this.limite==DEFAULT_LENGTH){
            throw new Exception("A sala já está lotada");
        }
        int onde= 0;

        if(onde<this.limite){
            if (alunos[onde].equals(a)){
                throw new Exception("Aluno já registrado");
            }
        }
        for (int i = this.limite - 1; i > onde; i--) {
            alunos[i] = alunos[i - 1];
        }

        alunos[limite]= a;
        this.limite++;
    };
    
    public void removerAluno(aAluno a)throws Exception{
        if (a==null){
            throw new Exception ("Aluno inválido");
        }
        if (this.limite == 0) {
            throw new Exception("A sala já está vazia");
        }
        int onde= 0;
        if (onde==this.limite){
            throw new Exception("Aluno não encontrado");
        }

        while(onde<this.limite-1){
            alunos[onde]= alunos[onde+1];
            onde++;
        }

        this.limite--;
    };


    public aAluno getAluno(String Nome){
        for (int i = 0; i < this.alunos.length; i++) {
            if (alunos[i].getNome().equals(Nome)) {
                return alunos[i];   
            }
        }
        return null;
    };

    public void ordenarAlunosPorNome(){
        if (this.alunos != null) {
            Arrays.sort(this.alunos, 0, this.limite, (a1, a2) -> a1.getNome().compareTo(a2.getNome()));
        }
    };
    
    public double mediaGeral(){
        if(this.limite==0){
            return 0.0;
        }

        double soma= 0.0;
        for (int i=0; i<this.limite; i++){
            soma += this.alunos[i].media();
        }

        return soma/this.limite;
    };
    
    public int quantosAcimaDaMedia(){
        if(this.alunos.length==0){
            return 0;
        }

        int soma=0;
        for (int i=0; i<this.alunos.length; i++){
            if(this.alunos[i].media() >=5){
                soma++;
            }
        }
        return soma;
    };
    
    public int quantosComMediaAcimaDe(double valor){
        if(this.alunos.length==0){
            return 0;
        }

        int soma=0;
        for (int i=0; i<this.alunos.length; i++){
            if(this.alunos[i].media() >=valor){
                soma++;
            }
        }
        return soma;
    };

}
