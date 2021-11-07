package MODEL;


public class Carro {
    
    String marca, modelo, cor;
    int ano;
    
    public Carro(){
        
    }
    
    public Carro(String marca, String modelo, String cor, int ano){
        
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setCor(cor);
        this.setAno(ano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    
}
