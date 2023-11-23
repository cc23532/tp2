class Livro{
    // Atributos
    private int id;
    private String nome;

    public Livro(){
        this(0,"<SemNome>");
    }
    public Livro(int id, String n){
        this.id = id;
        this.nome = n;
    }
    public int compareTo(Object outro){
        // Endereços de memoria iguais
        if (outro == this) return 0;

        // Não sao do mesmo tipo
        if (!(outro instanceof Livro)) return -1;

        // validação de conteudo igual
        Livro o = (Livro) outro;
        return this.nome.compareTo(o.nome);
    }

    public boolean equals(Object outro){
        // // Endereços de memoria iguais
        // if (outro == this) return true;

        // // Não sao do mesmo tipo
        // if (!(outro instanceof Livro)) return false;

        // // validação de conteudo igual
        // Livro o = (Livro) outro;
        // return ((this.id == o.id) &&
        //      (this.nome.equals(o.nome)));

        return this.compareTo(outro)==0;
    }

    public String toString(){
        return "["+this.id+"] "+this.nome;
    }
}