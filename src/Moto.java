public class Moto extends Veiculo {
    private int cilindradas;

    //usa super
    public Moto(String placa, String marca, int cilindradas) {
        super(placa, marca);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Moto" + "cilindradas=" + cilindradas;
    }
}
