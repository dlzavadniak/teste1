package classes.lanches;

import classes.lanches.Lanche;

public abstract class Sanduiches extends Lanche {

    private String[] adicionais = new String[10];


    public void adicionarAdicional(String adicional) {
        for (int i = 0; i < adicionais.length; i++) {
            if (this.adicionais[i] == null) {
                this.adicionais[i] = adicional;
                break;
            }
        }
    }

    public String[] getAdicionais() {
        return adicionais;
    }

    public void setAdicionais(String[] adicionais) {
        this.adicionais = adicionais;
    }
}