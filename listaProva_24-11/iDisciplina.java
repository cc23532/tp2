interface iDisciplina{
    public void setNome(String nome);

    public String getNome();

    public abstract void inserirAluno(aAluno a)throws Exception;
    public abstract void removerAluno(aAluno a)throws Exception;
    public abstract aAluno getAluno(String Nome);

    public abstract void ordenarAlunosPorNome();
    public abstract double mediaGeral();
    public abstract int quantosAcimaDaMedia();
    public abstract int quantosComMediaAcimaDe(double valor);
}