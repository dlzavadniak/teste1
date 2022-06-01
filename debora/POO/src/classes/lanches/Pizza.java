package classes.lanches;

import classes.lanches.MiniPizza;

public class Pizza extends MiniPizza {

    private String tamanho;

    @Override
    public void montarComanda() {
        super.montarComanda();
        System.out.println("Tamanho: "+this.tamanho);
    }

    public Pizza() {
       this.setTipo("Pizza");
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
}
