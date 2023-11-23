class Armazenador{

    public static int TAMANHO_MINIMO = 10;
    public static int TAMANHO_MAXIMO = 100;

    // Atributos
    protected int vet[];
    protected int limite;  // também representa quantos elementos

    // Metodos
    // construtores
    public Armazenador(){
        this(TAMANHO_MINIMO);
    }
    public Armazenador(int qtos){
        if (qtos<TAMANHO_MINIMO) qtos= TAMANHO_MINIMO;
        if (qtos>TAMANHO_MAXIMO) qtos= TAMANHO_MAXIMO;

        vet = new int[qtos];
        limite = 0;
    }

    public void armazenar(int elemento) throws Exception{
        if (this.limite == vet.length) 
              throw new Exception("Armazenador está cheio!");

        vet[this.limite] = elemento;
        this.limite++;
    }

    public void descartar(int elemento){
        for (int i=0; i<this.limite; i++){
            if (vet[i] == elemento ){ // achei o elemento
                // delocar os elemento
                for (int j=i; j<this.limite-1; j++){
                    vet[j] = vet[j+1];
                }
                // decrementar o limite
                this.limite--;
            }
        }
    }

    public boolean estaVazio(){
        return limite == 0;
    }
    public boolean estaCheio(){
        return limite == vet.length;
    }

    public String toString(){
        String retorno="[";
        for (int i=0; i<this.limite; i++){
            retorno = retorno + " " + vet[i];
        }
        return retorno+" ]\nUtilizados " + 
                        this.limite + "/" + 
                        vet.length;
    }

}
