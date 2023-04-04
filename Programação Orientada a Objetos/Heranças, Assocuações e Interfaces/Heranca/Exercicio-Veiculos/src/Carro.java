public class Carro extends Veiculo{
    private int numPortas;
    private boolean cambioAutomatico;

    public Carro(String marca, String modelo, int ano, String cor, double preco, int numPortas, boolean cambioAutomatico) {
        super(marca, modelo, ano, cor, preco);
        this.numPortas = numPortas;
        this.cambioAutomatico = cambioAutomatico;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public boolean isCambioAutomatico() {
        return cambioAutomatico;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "numPortas=" + numPortas +
                ", cambioAutomatico=" + cambioAutomatico +
                '}';
    }
}
