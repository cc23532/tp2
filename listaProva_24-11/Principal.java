class Principal {
    public static void main(String[] args) throws Exception {
        Disciplina disciplina= new Disciplina("Tecnicas De Programacao");
        
        aAluno antenor = new Aluno("Antenor Mariano Sanches", 3);
        aAluno lucia = new Aluno("Lucia Helena Galvão", 3);
        aAluno pedro = new Aluno("Pedro Alexandre Klabin", 3);
        aAluno renata = new Aluno("Renata Paula Pires", 3);

        antenor.inserirAvaliacao(new Avaliacao("Trabalho", 8.0, 2));
        antenor.inserirAvaliacao(new Avaliacao("Lista De Exercício", 2.0, 2));
        antenor.inserirAvaliacao(new Avaliacao("Prova", 7.0, 6));
        antenor.inserirAvaliacao(new Avaliacao("AAA", 7.0, 5));

        lucia.inserirAvaliacao(new Avaliacao("Trabalho", 8.0, 2));
        lucia.inserirAvaliacao(new Avaliacao("Lista De Exercício", 3.0, 2));
        lucia.inserirAvaliacao(new Avaliacao("Prova", 6.5, 6));
        lucia.inserirAvaliacao(new Avaliacao("AAA", 7.0, 5));

        pedro.inserirAvaliacao(new Avaliacao("Trabalho", 8.0, 2));
        pedro.inserirAvaliacao(new Avaliacao("Lista De Exercício", 2.5, 2));
        pedro.inserirAvaliacao(new Avaliacao("Prova", 9.0, 6));
        pedro.inserirAvaliacao(new Avaliacao("AAA", 7.0, 5));

        renata.inserirAvaliacao(new Avaliacao("Trabalho", 8.0, 2));
        renata.inserirAvaliacao(new Avaliacao("Lista De Exercício", 7.0, 2));
        renata.inserirAvaliacao(new Avaliacao("Prova", 8.5, 6));
        renata.inserirAvaliacao(new Avaliacao("AAA", 7.0, 5));

        disciplina.inserirAluno(antenor);
        disciplina.inserirAluno(lucia);
        disciplina.inserirAluno(pedro);
        disciplina.inserirAluno(renata);

        disciplina.mediaGeral();

        System.out.println("-----------------------------------");
        System.out.println("Relatório de Alunos de "+ disciplina.getNome());
        System.out.println("-----------------------------------");
        
        System.out.println("ALUNO: "+antenor.getNome());
        antenor.ordenarAvaliacoesPorNome();
        System.out.println(antenor.toString());
        System.out.println("A MÉDIA do aluno é de: "+ antenor.media());
        
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        
        System.out.println("ALUNO: "+lucia.getNome());
        lucia.ordenarAvaliacoesPorNome();
        System.out.println(lucia.toString());
        System.out.println("A MÉDIA do aluno é de: "+ lucia.media());

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        
        System.out.println("ALUNO: "+pedro.getNome());
        pedro.ordenarAvaliacoesPorNome();
        System.out.println(pedro.toString());
        System.out.println("A MÉDIA do aluno é de: "+ pedro.media());

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        
        System.out.println("ALUNO: "+renata.getNome());
        renata.ordenarAvaliacoesPorNome();
        System.out.println(renata.toString());
        System.out.println("A MÉDIA do aluno é de: "+ renata.media());

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println("A MÉDIA GERAL da sala é de: "+ disciplina.mediaGeral());

        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        System.out.println("O total de alunos com NOTA ACIMA DE 3.00 é de: "+ disciplina.quantosComMediaAcimaDe(3.00));

    }

}
