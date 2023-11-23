class Pessoa {
    public NomeSimples nome;

    public Pessoa (String nome) throws Exception{
        this.nome = new NomeSimples(nome);
    }

    public String toString(){
        return nome.toString();
    }
}