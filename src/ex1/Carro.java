package ex1;

public class Carro extends Veiculo {
    private int numPortas;

    public Carro(String placa, String marca, int numPortas) {
        super(placa, marca);
        this.numPortas = numPortas;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero de portas:" +numPortas;
    }

    public int getNumPortas(){
        return numPortas;
    }
}
