public class Carro extends Veiculo {
    private int numPortas;

    //usa super
    public Carro(String placa, String marca, int numPortas) {
        super(placa, marca);
        this.numPortas = numPortas;
    }


}
