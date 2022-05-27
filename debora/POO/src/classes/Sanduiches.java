package classes;

public abstract class Sanduiches extends Lanche {

    public String[] adicionais = new String[10];


    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < adicionais.length; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    public void montarComanda() {
        super.montarComanda();
        if (this.adicionais[0] != null) {
            System.out.println("-ADICIONAIS-");
            for (String adiocional : this.adicionais) {
                if (adiocional != null) {
                    System.out.println(adiocional);
                }
            }
        }
    }
}