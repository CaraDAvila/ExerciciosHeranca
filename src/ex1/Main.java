package ex1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Veiculo> lista = new ArrayList<>();
        lista.add(new Carro("A1", "audi", 4));
        lista.add(new Carro("B1", "bmw", 2));
        lista.add(new Moto("Y2", "yamaha", 1200));

        for (Veiculo veiculo : lista) {
            System.out.println(veiculo);
            System.out.println();
        }

    }
}
