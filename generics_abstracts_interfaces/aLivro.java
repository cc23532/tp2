abstract class aLivro {
    // Atributos
    protected int id;
    protected String nome;

    public aLivro(){
        this(0,"<SemNome>");
    }
    public aLivro(int id, String n){
        this.id = id;
        this.nome = n;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public abstract int compareTo(Object outro);
    public abstract boolean equals(Livro outro);

    public String toString(){
        return "["+this.id+"] "+this.nome;
    }
}