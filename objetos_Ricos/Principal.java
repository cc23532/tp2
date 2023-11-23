class Principal{
    public static void main(String args[]) throws Exception{
        try{

             Pessoa p = new Pessoa("Andreia Souza");
             System.out.println("maiusculo: " + p.nome.tudoMaiusculo());
       

        } catch (Exception e){
            System.out.println("Erro: " + e.getMessage());

        }
        
        System.out.println("*** FIM ***");
    }
}