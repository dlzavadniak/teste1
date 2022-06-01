import classes.lanches.*;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        montarLanche();
    }

    private static void montarLanche(){
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hotdog");
        System.out.println("(5) - Mini Pizza");
        System.out.println("(6) - Pizza");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;


        switch (escolha) {
            case 1 -> lanche = new XSalada();
            case 2 -> lanche = new XBurguer();
            case 3 -> lanche = new MistoQuente();
            case 4 -> lanche = new Hotdog();
            case 5 -> lanche = new MiniPizza();
            case 6 -> lanche = new Pizza();
            default -> System.err.println("Escolha uma opção válida!");
        }

        if (lanche instanceof Sanduiches) {
            //ADICIONAIS
            System.out.println("Deseja algum adicional? (S/N)");
            String adc = in.nextLine();
            if (adc.equalsIgnoreCase("S")) {
                System.out.println("Qual adicional você deseja? (max 10): ");
                for (int i = 0; i < 10; i++) {
                    ((Sanduiches) lanche).adicionarAdicional(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if (parada.equalsIgnoreCase("N")) {
                        break;
                    }
                    System.out.println("Informe o adicional: ");
                }
            }
            if (lanche instanceof XBurguer) {
                System.out.println("Lanche aberto? (S/N)");
                String aberto = in.next();
                ((XBurguer) lanche).aberto = aberto.equalsIgnoreCase("S");
            }
        } else {
            System.out.println("Qual sabor você deseja?");
            System.out.println("(1) - Quatro queijos");
            System.out.println("(2) - Calabresa");
            System.out.println("(3) - Frango com catupiry");
            System.out.println("(4) - Marguerita");
            System.out.println("(5) - Portuguesa");
            int sabor = in.nextInt();
            in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            switch (sabor) {
                case 1:
                    miniPizza.adicionarSaborEIngredientes("4 Queijos");
                    break;
                case 2:
                    miniPizza.adicionarSaborEIngredientes("Calabresa");
                    break;
                case 3:
                    miniPizza.adicionarSaborEIngredientes("Frango com catupiry");
                    break;
                case 4:
                    miniPizza.adicionarSaborEIngredientes("Marguerita");
                    break;
                case 5:
                    miniPizza.adicionarSaborEIngredientes("Portuguesa");
                    break;
                default:
                    System.err.println("Escolha um sabor válido");
            }
            if (lanche instanceof Pizza) {
                System.out.println("Qual o tamanho da pizza você deseja?");
                System.out.println("MiniPizza");
                System.out.println("XS - Broto");
                System.out.println("SM - Pequena");
                System.out.println("MD - Média");
                System.out.println("LG - Grande");
                System.out.println("XL - Familia");
                ((Pizza) lanche).setTamanho(in.nextLine().toUpperCase());
            }
            System.out.println("Borda recheada? (S/N)");
            String borda = in.nextLine();
            ((MiniPizza) lanche).setBordaRecheada(borda.equalsIgnoreCase("S"));
            if (miniPizza.isBordaRecheada(borda)) {
                System.out.println("Qual o sabor do recheio da borda:");
                miniPizza.setSaborBorda(in.nextLine());
            }
        }

        System.out.print("Informe o valor de " + lanche.getTipo()+ ": R$");
        lanche.setValor(in.nextDouble());
        lanche.montarComanda();
    }
}
