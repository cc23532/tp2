public abstract class aAluno extends Object implements Cloneable{
    public abstract void setNome(String n);
    public abstract String getNome();

    public abstract boolean equals(Object outroAluno);
    public abstract int compareTo(Object outroAluno);
    public abstract aAluno retornaClone();

    public abstract Avaliacao[] getAvaliacoes();
    public abstract void inserirAvaliacao(Avaliacao a) throws Exception;
    public abstract void removerAvaliacao(Avaliacao a) throws Exception;
    public abstract void ordenarAvaliacoesPorNome();
    public abstract double media();
}