class Data{
    private int 	dia;
    private	int     mes;
    private	int     ano;
    private	boolean ehFeriado;

    public Data(){ 
        this(1,1,1900);
     }
    public Data(int dia, int mes, int ano){
        setDia(dia);
        setMes(mes);
        setAno(ano);
        this.ehFeriado= false;
      }

    public void setDia (int dia){
        if (dia<1) dia=1;
        if (dia>31) dia=31;

        this.dia=dia;
    }
    public void setMes (int mes){
        if (mes<1) mes=1;
        if (mes>12) mes=12;

        // validações do dia final do mes

        this.mes=mes;
    }
    public void setAno (int ano){
        this.ano=ano;
    }

    public int getDia(){return this.dia;}
    public int getMes(){return this.mes;}
    public int getAno(){return this.ano;}

    //public	int	    diasAte(Data){}
    public	void	somaDias(int dias){}
    public	void	somaMes	(int meses){}
    public  void	somaAno	(int anos){}

    public	String	toString(){
        return  this.dia + "/" +
                this.mes + "/" + 
                this.ano;
    }

}