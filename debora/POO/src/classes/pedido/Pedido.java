package classes.pedido;

import classes.lanches.*;

public class Pedido {

    private Lanche[] lanches = new Lanche[10];

    public void imprimirComanda() {

        for (Lanche l : this.getLanches()) {
            if (l != null) {
                if (l instanceof MiniPizza) {
                    MiniPizza mp = ((MiniPizza) l);
                    System.out.println("==== " + l.getTipo() + "-" + mp.getSabor() + " ====");
                    if (mp.isBordaRecheada()) {
                        System.out.println("-Com borda recheada de: " + ((MiniPizza) l).getSaborBorda() + "-");
                    }
                    if (l instanceof Pizza) System.out.println("Tamanho: " + ((Pizza) l).getTamanho());
                } else {
                    System.out.println("====" + l.getTipo() + "====");
                }
                if (l instanceof XBurguer) {
                    if (((XBurguer) l).isAberto()) {
                        System.out.println("-LANCHE ABERTO-");
                    }
                }
                System.out.printf("Valor: R$%.2f\n", l.getValor());
                System.out.println("--INGREDIENTES--");
                for (String ingrediente : l.getIngredientes()) {
                    if (ingrediente != null) {
                        System.out.println(ingrediente);
                    }
                }
                if (l instanceof Sanduiches) {
                    Sanduiches s = (Sanduiches) l;
                    if (s.getAdicionais()[0] != null) {
                        System.out.println("-ADICIONAIS-");
                        for (String adicional : s.getAdicionais()) {
                            if (adicional != null) {
                                System.out.println(adicional);
                            }
                        }
                    }
                }
            }
        }
        System.out.printf("Valor: R$%.2f\n", calcularValorTotal());
        System.out.println("------------------------");
    }

        public double calcularValorTotal () {
            double valorTotal = 0;
            for (int i = 0; i < lanches.length; i++) {
                if (this.lanches[i] != null) {
                    valorTotal += lanches[i].getValor();
                }
            }
            return valorTotal;
        }

        public void adicionarLanche (Lanche lanche){
            for (int i = 0; i < 10; i++) {
                if (this.lanches[i] == null) {
                    this.lanches[i] = lanche;
                    break;
                }
            }
        }

        public Lanche[] getLanches () {
            return this.lanches;
        }
    }

