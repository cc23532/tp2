class Pessoa{
    // Atributos
    public	String  nome;
    private	String  cpf;

    // Construtores
    public Pessoa(){
        this("<SemNome>", ""); // chamada do contrutor sobrecarregado
    }
    public Pessoa(String nome){
        this(nome, "");// chamada do contrutor sobrecarregado
    }
    public Pessoa(String nome, String cpf){
        this.setNome(nome);
        setCPF(cpf);
    }
    public	void	setNome(String nome){
        this.nome = nome;  // atributo = parametro
    }
    public	void	setCPF(String cpf){
        this.cpf = cpf;
    }
    public	String	getNome(){
        return this.nome;
    }
    public	String	getCPF(){
        return this.cpf;
    }
    public	String	toString(){
        return "Nome : "+ this.nome + 
                "\nCPF. : " + this.cpf;
    }
}