class  Lampada{
    // Atributos
    private boolean estaLigada;

    // Metodos
    public Lampada(boolean ligada){
        this.estaLigada = ligada;
    }
    public Lampada(){
        this(false);
    }

    public void ligar(){
        this.estaLigada = true;
    }
    public void desligar(){
        this.estaLigada = false;
    }

    public String toString(){
        if (this.estaLigada)
            return "Acesa";

        return "Apagada";
    }

}