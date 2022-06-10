package classes;

import java.util.Scanner;

public abstract class Item {

    private String titulo;

    private String genero;

    private double valor;

    private Avaliacao[] avaliacoes = new Avaliacao[30];



     // metodos

    public void avaliar(){
        Avaliacao avaliacao = new Avaliacao();
        Scanner in = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        avaliacao.setNome(in.nextLine());
        System.out.println("Informe uma nota de 0 a 10: ");
        avaliacao.setRating(in.nextDouble());
        in.nextLine();
        System.out.println("Escreva o feedback (opcional): ");
        avaliacao.setFeedback(in.nextLine());

        for (int i = 0; i < getAvaliacoes().length; i++) {
            if (getAvaliacoes()[i] == null) {
                this.getAvaliacoes()[i] = avaliacao;
                break;
            }
        }
    }

    public double getTotalRating(){
        int contador = 0;
        double total = 0;
        for (Avaliacao a : getAvaliacoes()){
            if (a != null) {
                total += a.getRating();
                contador++;
            }
        }

        return total/contador;
    }


    // getter e setter

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Avaliacao[] getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(Avaliacao[] avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
