package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }
    public void removertarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        for (Tarefa t : tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }
    public void obterDescricaoTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O Numero total de tarefas é: "+listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 1");
        listaTarefa.adicionarTarefa("tarefa 3");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removertarefa("tarefa 1");
        //listaTarefa.removertarefa("tarefa 2");
        System.out.println(listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoTarefas();
    }
}
