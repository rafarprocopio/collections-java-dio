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
        // Criando uma instância da classe SomaNumeros
    SomaNumeros somaNumeros = new SomaNumeros();

    // Adicionando números à lista
    somaNumeros.adicionarNumero(5);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(0);
    somaNumeros.adicionarNumero(-2);
    somaNumeros.adicionarNumero(10);
    somaNumeros.adicionarNumero(8);

    // Exibindo a lista de números adicionados
    System.out.println("Números adicionados:");    
    somaNumeros.exibirNumeros();

    // Calculando e exibindo a soma dos números na lista
    System.out.println("Soma dos números = " + somaNumeros.calcularSoma());

    // Encontrando e exibindo o maior número na lista
    System.out.println("Maior número = " + somaNumeros.encontrarMaiorNumero());

    // Encontrando e exibindo o menor número na lista
    System.out.println("Menor número = " + somaNumeros.encontrarMenorNumero());
  }
    
}
