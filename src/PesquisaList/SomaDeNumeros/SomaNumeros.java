package PesquisaList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class SomaNumeros {

    private List <Integer> numerolist;

    //declaração feita automatica através do Generate Constructor. Depois substituido por vazio e inserido uma new ArrayList Vazio tbm selecionado automaticamente
    public SomaNumeros() {
        this.numerolist = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero) {
        this.numerolist.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (Integer numero : numerolist) {
            soma += numero;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int maiorNumero = 0;
        if (!numerolist.isEmpty()) {
            for (Integer numero : numerolist) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }

    }
}
