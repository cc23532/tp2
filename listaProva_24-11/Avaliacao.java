class Avaliacao extends Object implements Cloneable{
    private String nome;
    private double nota; 
    private int peso;

    public Avaliacao() {
        this("<SemNome>", 0.0, 0);
    }

    public Avaliacao(String nome){
        this(nome, 0.0, 0);

    }

    public Avaliacao(String nome, double nota){
        this(nome, nota, 0);
    }

    public Avaliacao(String nome, double nota, int peso){
        this.setNome(nome);
        this.setNota(nota);
        this.setPeso(peso);
    }

    public void setNome (String nome){
        this.nome= nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNota(double nota){
        this.nota=nota;
    }

    public double getNota(){
        return this.nota;
    }

    public void setPeso(int peso){
        this.peso= peso;
    }

    public int getPeso(){
        return this.peso;
    }

    public int compareTo(Object outraAvaliacao){
        if (this == outraAvaliacao) {
            return 0;
        }
        if (!(outraAvaliacao instanceof Avaliacao)) {
            throw new IllegalArgumentException("Objeto passado não é uma Avaliacao");
        }
        Avaliacao outra = (Avaliacao) outraAvaliacao;
    
        return this.nome.compareTo(outra.nome);
    }

    public boolean equals(Avaliacao outraAvaliacao){
        if (this == outraAvaliacao) {
            return true;
        }
        if (!(outraAvaliacao instanceof Avaliacao)) {
            return false;
        }
        Avaliacao outra = (Avaliacao) outraAvaliacao;
    
        return this.nome.equals(outra.nome);
    }

    public Avaliacao retornaClone(){
        try{
            return (Avaliacao)this.clone();
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
            return null;
        }
    }

    public String toString(){
        return "AVALIAÇÃO: "+ getNome()+ 
                "\n NOTA: "+ getNota()+ 
                "\n PESO: "+ getPeso();
    }
}
