package classes.lanches;

import classes.lanches.Sanduiches;

public class XBurguer extends Sanduiches {

    private boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    @Override
    public void mostrarDetalhesComanda() {

    }
}
