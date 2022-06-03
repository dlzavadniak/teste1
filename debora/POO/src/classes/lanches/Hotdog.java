package classes.lanches;

public class Hotdog extends Sanduiches {

    public Hotdog(){
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Molho de tomate");
        this.adicionarIngrediente("Batata Palha");
        this.adicionarIngrediente("Queijo cheddar");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Chucrute");
        this.adicionarIngrediente("Ervilha");
        this.setTipo("Hotdog");
    }
}
