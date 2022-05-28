package classes;

public class Voo {
    public String [][] codificacaoAssento;
    public boolean [][] ocupacaoAssento;

    public Voo(int linhas, int cadeirasPorLinha) {
        this.ocupacaoAssento = new boolean[linhas][cadeirasPorLinha];
        this.codificacaoAssento = new String[linhas][cadeirasPorLinha];
        String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < cadeirasPorLinha; c++) {
                this.codificacaoAssento[i][j]
            }
        }
    }

            public boolean verificarOcupacao (String codigo){
                return false; // só pra nao encher o saco.
                //for (int l = 0; l < this.codificacaoAssento.length; l++) {
                   // for (int c = 0; c < this.codificacaoAssento.length; c++) {

                  //  }
               // }
            }

            public void ocupar (String codigo){

            }

            public int quantidadeLivre () {
                return 0;
            }

            public void mostrarAssentos () {

            }
        }
