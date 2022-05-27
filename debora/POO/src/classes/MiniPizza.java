package classes;

public class MiniPizza extends Lanche {

    public boolean bordaRecheada;

    public String saborBorda;
    public MiniPizza() {
        this.adicionarIngrediente("Massa");
        this.adicionarIngrediente("Queijo");
        this.adicionarIngrediente("Molho de tomate");
        this.adicionarIngrediente("Calabresa");
        this.adicionarIngrediente("Cebola");
        this.tipo = "Mini Pizza";
    }

    @Override
    public void montarComanda() {
        super.montarComanda();
        if (this.bordaRecheada) {
            System.out.println("-Com borda recheada de: "+this.saborBorda+"-");
        }

    }


}
