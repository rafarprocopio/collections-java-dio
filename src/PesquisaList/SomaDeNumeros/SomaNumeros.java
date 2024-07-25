package PesquisaList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<numero> inteiroslist;

    //declaração feita automatica através do Generate Constructor. Depois substituido por vazio e inserido uma new ArrayList Vazio tbm selecionado automaticamente
    public SomaNumeros() {
        this.numerolist = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero) {
        numerolist.add(new Numero(numero));
    }
}
