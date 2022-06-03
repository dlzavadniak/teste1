package classes.lanches;

import classes.lanches.MiniPizza;

public class Pizza extends MiniPizza {

    private String tamanho;


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
