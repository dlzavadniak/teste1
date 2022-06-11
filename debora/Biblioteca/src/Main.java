import classes.*;

import java.util.Scanner;

//VALEU DEBS S2
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("(1) - Adicionar item na estante");
        System.out.println("(2) - Buscar e tratar retorno");
        System.out.println("(3) - Remover item da estante");
        System.out.println("(4) - Mostrar itens da estante");
        System.out.println("(0) - Sair");
        int escolha = in.nextInt();
        in.nextLine();

        switch (escolha) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 0:
        }

    }

    public static void adicionarNaEstante(Estante e) {
        if (e.estanteCheia()) {
            System.err.println("Sua estante está cheia! Não é possivel adicionar mais itens!");
        } else {
            int escolha = -1;
            while (escolha < 0 || escolha > 1) {
                System.out.println("Que tipo de item é: (1)-DVD  (2)-Livro");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 1) {
                    System.out.println("Escolha uma opção válida");
                }
            }
            in.nextLine();
            if (escolha == 0) {
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
            } else {
                Livro livro = new Livro();
                System.out.println("Título do livro: ");
                livro.setTitulo(in.nextLine());
                System.out.println("Gênero do livro: ");
                livro.setGenero(in.nextLine());
                System.out.println("Valor do livro: ");
                livro.setValor(in.nextDouble());
                in.nextLine();
                System.out.println("Autor do livro: ");
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
    }

    public static void buscarTratarRetorno(Estante e, Item i) {
        if (e.getItens() == null) {
            System.err.println("Não existem itens na sua estante! Adicione um!");
        } else {
            int escolha = -1;
            while (escolha < 0 || escolha > 3) {
                System.out.println("Que tipo de item é: (1)-DVD  (2)-Livro ");
                escolha = in.nextInt();
                if (escolha < 0 || escolha > 3) {
                    System.out.println("Escolha uma opção válida");
                }
            }
            in.nextLine();
            System.out.println("Você deseja (1) - Avaliar ou (2) - Ver avaliações?");
            int escolhadois = in.nextInt();
            if (escolha == 1) {
                i.avaliar();
            } else if (escolha == 2) {
                for (int a = 0; a < i.getAvaliacoes().length; a++) {
                    System.out.println(i.getAvaliacoes()[a]);
                }
            }
        }
    }

    public Item removerItemDaEstante(Estante e) {
        return null;
    }

    public static void mostrarItensDaEstante(Item i, Estante e) {

        if (i instanceof Item) {
            Avaliacao av = new Avaliacao();
            System.out.println("Título: " + i.getTitulo());
            System.out.println("Gênero: " + i.getGenero());
            System.out.println("Valor: " + i.getValor());
            if (i instanceof Dvd) {
                System.out.println("Diretor do filme: " + ((Dvd) i).getDiretor());
                System.out.println("Ano de lançamento:" + ((Dvd) i).getAnoLancamento());
                System.out.println("Duração do filme: " + ((Dvd) i).getDuracao());
                System.out.println("--------------------");
            } else if (i instanceof Livro) {
                System.out.println("Autor do livro: " + ((Livro) i).getAutor());
                System.out.println("Quantidade de paginas: " + ((Livro) i).getQtdePaginas());
                System.out.println("Ano de publicação: " + ((Livro) i).getAnoPublicacao());
                System.out.println("Edição: " + ((Livro) i).getEdicao());
                System.out.println("--------------------");
            }
        }

    }

}








