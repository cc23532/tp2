class Biblioteca{
    public static final int DEFAULT_LENGTH = 10;

    private String nome;
    private Livro[] livros;
    private int limite;

    public Biblioteca(){
        this("Sem Nome", DEFAULT_LENGTH);
    }
    public Biblioteca(int qtosLivros){
        this("Sem Nome", qtosLivros);
    }
    public Biblioteca(String nome){
        this(nome, DEFAULT_LENGTH);
    }
    public Biblioteca(int qtosLivros, String nome){
        this(nome, qtosLivros);
    }
    public Biblioteca(String nome, int qtosLivros){
        this.nome = nome;

        if (qtosLivros<DEFAULT_LENGTH) qtosLivros = DEFAULT_LENGTH;
        this.livros = new Livro[qtosLivros];
        this.limite = 0;
    }

    public void excluir(String l) throws Exception{
        excluir(new Livro(0,l));
    }
    public void excluir(Livro l) throws Exception{
        if (l==null) throw new Exception("Livro Inválido");
        if (limite==0) throw new Exception("Biblioteca vazia");
        int onde = ondeEsta(l);

        if (onde==this.limite)throw new Exception("Livro não encontrado");

        while (onde <this.limite-1){
            livros[onde] = livros[onde+1];
            onde++;
        }
        limite--;        
    }
    public void incluir(Livro l) throws Exception{
        if (l==null) throw new Exception("Livro Inválido");
        if (limite==livros.length) throw new Exception("Biblioteca sem espaço");
        int onde = ondeEsta(l);
        
        if (onde<this.limite) 
            if (livros[onde].equals(l))
                    throw new Exception("Livro já existe na biblioteca");

        // deslocar todos a partir desse lugar pra frente
        for (int i=this.limite; i>onde ; i--){
            livros[i] = livros[i-1];
        }

        // colocar o l na posicao do elemento maior
        livros[onde] = l;
        limite++;
    }

    public boolean pertence(String l){
        return pertence(new Livro(0,l));
    }
    public boolean pertence(Livro l){
        int onde = ondeEsta(l);
        if (onde == this.limite)  return false;

        return livros[onde].equals(l);
    }

    private int ondeEsta(Livro l){
        for (int i=0; i<this.limite; i++){
            int ct = livros[i].compareTo(l);
            if (ct>=0) return i;
        }
        return this.limite;
    }

    public String toString(){
        String retorno="Ocupação da Biblioteca "+ this.nome + ": " +this.limite+" de "+livros.length;

        for (int i=0; i<this.limite; i++){
            retorno += "\n" + livros[i] + " ";
        }
        return retorno;
    }

}