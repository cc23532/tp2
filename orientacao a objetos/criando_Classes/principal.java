class Principal{
    public static void main(String[] args){

        Pessoa eu = new Pessoa("Andreia", "124.548.656-55");

        System.out.println("Escrita do Objeto");
        System.out.println(eu);

        eu.nome = "Andréia Souza";
        /**
         * eu.cpf = "000.000çljhu"; 
         * 
         * não é um comando válido pois cpf tem acesso privativo 
         * na classe Pessoa
         * */        
        eu.setCPF("000.000çljhu");

        System.out.println("\nEscrita dos atuibutos");
        System.out.println("Nome --> " + eu.getNome());
        System.out.println("CPF --> " +eu.getCPF());

        System.out.println("\nEscrita do Objeto");
        System.out.println(eu);

        /** teste da Data */
        System.out.println("\n\n\n\n\n\n");
        Data hoje = new Data(11,10,2023);
        System.out.println(hoje);

        
    }
}
    

