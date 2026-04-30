package ex2.main;

import ex2.conta.Conta;
import ex2.corrente.ContaCorrente;
import ex2.poupanca.ContaPoupanca;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> lista= new ArrayList<>();
        lista.add(new ContaCorrente(2,5000,80000));
        lista.add(new ContaPoupanca(1,10000,10));

        for (Conta conta : lista){
            conta.depositar(2000);

            System.out.println(conta.getSaldoDisponivel());
        }
    }
}
