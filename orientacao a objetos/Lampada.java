class Lampada {
    //Atributos
    private boolean estaLigada; //"nasce" falso
    
    //Métodos
    public void ligar(){
        this.estaLigada= true;
    }

    public void desligar(){
        this.estaLigada= false;
    }

    public String toString(){
        if (estaLigada){
            return  "Acesa";
        }
        return  "Apagada";

    }

}
