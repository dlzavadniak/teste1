package classes.lanches;

import classes.lanches.Sanduiches;

public class XBurguer extends Sanduiches {

    public boolean aberto;

    public XBurguer() {
        this.adicionarIngrediente("Hamburguer");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Presunto");
        this.adicionarIngrediente("Pão");
        this.setTipo("XBurguer");
    }
    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.aberto) {
            System.out.println("-LANCHE ABERTO-");
        }

    }

}
