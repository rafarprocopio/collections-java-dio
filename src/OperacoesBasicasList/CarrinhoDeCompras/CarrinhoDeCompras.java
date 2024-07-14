package OperacoesBasicasList.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List <Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
       itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
       List<Item> ItensParaRemover = new ArrayList<>();
        for(Item i : itemList) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                    ItensParaRemover.add(i);
            }
        }
        itemList.removeAll(ItensParaRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : itemList) {
            double valorItem = item.getPreco() * item.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(itemList);
    }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("chocolate", 5, 2);
        carrinhoDeCompras.adicionarItem("iogurte", 7, 3);
        carrinhoDeCompras.adicionarItem("arroz", 22, 1);
       
        carrinhoDeCompras.exibirItens();
        
        System.out.println(carrinhoDeCompras.calcularValorTotal());
        
    }
}
