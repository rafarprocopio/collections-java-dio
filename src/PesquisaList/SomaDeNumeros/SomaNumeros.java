package PesquisaList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

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

    public int encontrarMenorNumero(){
        int menorNumero = 0;
        if (!numerolist.isEmpty()) {
            for (Integer numero : numerolist) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros() {
        if (!numerolist.isEmpty()) {
          System.out.println(this.numerolist);
        } else {
          System.out.println("A lista está vazia!");
        }
      }

    public static void main(String[] args) {
    SomaNumeros somaNumeros = new SomaNumeros();

    somaNumeros.adicionarNumero(7);
    somaNumeros.adicionarNumero(3);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-4);
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(8);

    System.out.println("Números adicionados:");    
    somaNumeros.exibirNumeros();

    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
    
}
