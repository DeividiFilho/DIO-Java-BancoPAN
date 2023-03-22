public class Carro {
        private String cor;
        private String modelo;
        private int capacidadeTanque;

    public Carro(String cor, String modelo, int capacidadeTanque) {
        this.setCor(cor);
        this.setModelo(modelo);
        this.setCapacidadeTanque(capacidadeTanque);
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

}
