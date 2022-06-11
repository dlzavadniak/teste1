package classes.lanches;

import classes.lanches.Lanche;

public class MiniPizza extends Lanche {

    private boolean bordaRecheada;

    private String sabor;
    private String saborBorda;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Molho de tomate");
        this.setTipo("Mini Pizza");
    }

    public void adicionarSaborEIngredientes(String sabor) {
        this.setSabor(sabor);
        switch (sabor.toUpperCase()) {
            case "4 QUEIJOS":
                this.adicionarIngrediente("Cheddar");
                this.adicionarIngrediente("Catupiry");
                this.adicionarIngrediente("Provolone");
                break;
            case "CALABRESA":
                this.adicionarIngrediente("Calabresa");
                break;
            case "FRANGO COM CATUPIRY":
                this.adicionarIngrediente("Frango");
                this.adicionarIngrediente("Catupiry");
                break;
            case "MARGUERITA":
                this.adicionarIngrediente("Tomate");
                this.adicionarIngrediente("Manjericão");
                break;
            case "PORTUGUESA":
                this.adicionarIngrediente("Ovo");
                this.adicionarIngrediente("Presunto");
                this.adicionarIngrediente("Cebola");
                this.adicionarIngrediente("Pimentão");
                break;
        }
    }


    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public void setBordaRecheada(boolean bordaRecheada) {
        this.bordaRecheada = bordaRecheada;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getSaborBorda() {
        return saborBorda;
    }

    public void setSaborBorda(String saborBorda) {
        this.saborBorda = saborBorda;
    }
}