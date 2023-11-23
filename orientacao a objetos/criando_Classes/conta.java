
class Conta {
    public String titular;
    public int numero;
    public String agencia;
    private double saldo;
    private String dataDeAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, String dataDeAbertura){
        this.titular= titular;
        this.numero= numero;
        this.agencia= agencia;
        this.saldo= saldo;
        this.dataDeAbertura= dataDeAbertura;
    }

    public void setTitular(String titular){
        this.titular= titular;
    }

    public void setNumero(int numero){
        this.numero= numero;
    }
    public void setAgencia(String agencia){
        this.agencia= agencia;
    }

    public void setSaldo(double saldo){
        this.saldo= saldo;
    }

    public void setDataDeAbertura(String dataDeAbertura){
        this.dataDeAbertura= dataDeAbertura;
    }

    public String getTitular(){
        return this.titular;
    }

    public int getNumero(){
        return this.numero;
    }

    public String getAgencia(){
        return this.agencia;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public String getDataDeAbertura(){
        return this.dataDeAbertura;
    }

    public String toString(){
        return  "Seja bem-vindo, " + this.titular +
                "\nCONTA: " + this.numero + 
                "\nAGÊNCIA: "+ this.agencia + 
                "\nSaldo: " + this.saldo + 
                "\nData de abertura da conta: " + this.dataDeAbertura; 
    }

    }

