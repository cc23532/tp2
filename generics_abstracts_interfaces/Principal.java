class Principal{
    public static void main(String[] args){
        Armazenador<Livro> doCotuca = new Armazenador<Livro>("Biblioteca");
        Armazenador<Pessoa> Alunos = new Armazenador<Pessoa>("Classe");

        // System.out.println(doCotuca);
        // System.out.println(Alunos);
        // try{
        //     doCotuca.incluir(new Livro(1,"Be Welcome to Java"));
        //     doCotuca.incluir(new Livro(2,"Java 4.5"));
        //     doCotuca.incluir(new Livro(3,"A Biblia de Java"));
        //     doCotuca.incluir(new Livro(4,"Be the Best in Java"));

        //     Alunos.incluir(new Pessoa("Andreia"));
        //     Alunos.incluir(new Pessoa("Marcelo"));
        //     Alunos.incluir(new Pessoa("Renata"));

        // } catch (Exception e){
        //     System.out.println("Erro: " + e.getMessage());
        // }

        // System.out.println(doCotuca);
        // System.out.println(Alunos);

        aLivro l = new Livro();
        System.out.println(l);
    }
}