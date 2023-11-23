class NomeSimples {
    private String nome;

    public NomeSimples(String nome) throws Exception{

        if (nome.length()<3) 
             throw new Exception("Nome muito curto");

        int contador=0;
        for (int i=0; i<nome.length(); i++){
            if (nome.charAt(i)==' ')
                 contador++;
        }
        if (contador==0) 
                throw new Exception("Indique nome e sobrenome");

        for (int i=0; i<nome.length(); i++){
            if ("0123456789".indexOf(nome.charAt(i)) != -1) 
                 throw new Exception("Nomes não podem conter números");
        }

        // parâmetro nome passou por todas as validações!!
        this.nome = nome;

    }

    public String iniciais(){
        return "";
    }

    public String tudoMaiusculo(){
        return nome.toUpperCase();
    }
    
    public String tudoMinusculo(){
        return nome.toLowerCase();
    }

    public String primeiroNome(){
        return "";
    }
    public String ultimoNome(){
        return "";
    }

    public String toString(){
        return this.nome;
    }
}