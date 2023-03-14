class Carro {
    boolean onOff = false;
    String marca;
    String cor;
    String modelo;
    int tanqueGasolina;

    //Sobrecarga do construtor
    Carro(){
        
    }

    Carro(String marca, String cor,String modelo,int tanqueGasolina){
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.tanqueGasolina = tanqueGasolina;
    }

    //Get e Setters dos atributos
    void setMarca(String marca){
        this.marca = marca;
    }
    
    String getMarca(){
        return marca;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    String getCor(){
        return cor;
    }

    void setModelo(String modelo){
        this.modelo = modelo;
    }

    String getModelo(){
        return modelo;
    }

    void setTanqueGasolina(int tanqueGasolina){
        this.tanqueGasolina = tanqueGasolina;
    }

    int getTanqueGasolina(){
        return tanqueGasolina;
    }

    public double calculaValorTotal(double valorGasolina){
        return (valorGasolina * this.tanqueGasolina);
    }
}