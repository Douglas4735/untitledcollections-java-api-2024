package desafioDio;

import java.util.ArrayList;
import java.util.List;

public class CarinhoDeCompras {

   private List<Item> items;

    public CarinhoDeCompras() {
        this.items = new ArrayList<>();
    }
    public void adicionarItem(String nome , double preco, int quantidade){
            items.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();

        for(Item t : items){
            if(t.getNome().equalsIgnoreCase(nome)){
                itemsParaRemover.add(t);
            }
        }
        items.removeAll(itemsParaRemover);
    }
    public int calcularValorTotal(){
        return items.size();
    }
    public void exibirItens(){
        System.out.println(items);
    }

    public static void main(String[] args) {
        Item item = new Item("manteiga",35.50,2);
        CarinhoDeCompras carinhoDeCompras = new CarinhoDeCompras();

        System.out.println("O Numero total de items é: "+carinhoDeCompras.calcularValorTotal());

        carinhoDeCompras.adicionarItem("manteiga",32.50,2);
        carinhoDeCompras.adicionarItem("gelatina",2.50,5);
        carinhoDeCompras.removerItem("manteiga");

        System.out.println(carinhoDeCompras.calcularValorTotal());


//        System.out.println(item.getNome());
//        System.out.println(item.getPreco());
//        System.out.println(item.getQuantidade());



    }
}
