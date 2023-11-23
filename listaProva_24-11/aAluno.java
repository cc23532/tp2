public abstract class aAluno{
    private String Nome;
    private Avaliacao[] notas;

    public abstract void setNome(String n);
    public abstract String getNome();

    public abstract boolean equals();
    public abstract int compareTo();
    public abstract aAluno retornaClone();

    public abstract Avaliacao[] getAvaliacoes();
    public abstract void inserirAvaliacao(Avaliacao a) throws Exception;
    public abstract void removerAvaliacao(Avaliacao a) throws Exception;
    public abstract void ordenarAvaliacoesPorNome();
    public abstract double media();
}