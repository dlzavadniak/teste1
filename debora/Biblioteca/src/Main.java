import classes.*;

import java.util.Scanner;

//VALEU DEBS S2
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Estante e = new Estante(5);
        System.out.println("Insira 5 títulos na estante: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Que tipo de item é: (1)-DVD  (2)-Livro");
            String tipo = in.nextLine();
            if (tipo.equalsIgnoreCase("1")) {
                Dvd dvd = new Dvd();
                System.out.println("Título do filme: ");
                dvd.setTitulo(in.nextLine());
                System.out.println("Gênero do filme: ");
                dvd.setGenero(in.nextLine());
                System.out.println("Valor do filme: ");
                dvd.setValor(in.nextDouble());
                in.nextLine();
                System.out.println("Diretor do filme: ");
                dvd.setDiretor(in.nextLine());
                System.out.println("Ano de lançamento do filme: ");
                dvd.setAnoLancamento(in.nextInt());
                in.nextLine();
                System.out.println("Duração do filme: ");
                dvd.setDuracao(in.nextDouble());
                in.nextLine();
                e.adicionarItem(dvd);
            } else if (tipo.equalsIgnoreCase("Livro")) {
                Livro livro = new Livro();
                System.out.println("Título do livro: ");
                livro.setTitulo(in.nextLine());
                System.out.println("Gênero do livro?");
                livro.setGenero(in.nextLine());
                System.out.println("Valor do livro?");
                livro.setValor(in.nextDouble());
                System.out.println("Autor do livro");
                livro.setAutor(in.nextLine());
                System.out.println("Quantidade de páginas do livro: ");
                livro.setQtdePaginas(in.nextInt());
                in.nextLine();
                System.out.println("Ano de publicação: ");
                livro.setAnoPublicacao(in.nextInt());
                in.nextLine();
                System.out.println("Edição número: ");
                livro.setEdicao(in.nextInt());
                in.nextLine();
                e.adicionarItem(livro);
            }
        }

        for (Item i : e.getItens()) {
            if (i instanceof Item) {
                System.out.println("Título: " + i.getTitulo());
                System.out.println("Gênero: " + i.getGenero());
                System.out.println("Valor: " + i.getValor());
                if (i instanceof Dvd) {
                    System.out.println("Diretor do filme: " + ((Dvd) i).getDiretor());
                    System.out.println("Ano de lançamento:" + ((Dvd) i).getAnoLancamento());
                    System.out.println("Duração do filme: " + ((Dvd) i).getDuracao());
                } else if (i instanceof Livro) {
                    System.out.println("Autor do livro: " + ((Livro) i).getAutor());
                    System.out.println("Quantidade de paginas: " + ((Livro) i).getQtdePaginas());
                    System.out.println("Ano de publicação: " + ((Livro) i).getAnoPublicacao());
                    System.out.println("Edição: " + ((Livro) i).getEdicao());
                }

            }
        }
    }
}





