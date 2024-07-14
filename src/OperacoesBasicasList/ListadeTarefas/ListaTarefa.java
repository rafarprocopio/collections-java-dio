package OperacoesBasicasList.ListadeTarefas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atributo
    private List <Tarefa> tarefalList;

    public ListaTarefa() {
        this.tarefalList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefalList.add(new Tarefa(descricao));
        }

    public void removerTarefa(String descricao) {
        List<Tarefa> TarefasParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    TarefasParaRemover.add(t);
            }
        }
        tarefalList.removeAll(TarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefalList.size();
        }
    public void obterDescricoesTarefas() {
        System.out.println(tarefalList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("o número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        System.out.println("o número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("o número total de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();


    }
}
