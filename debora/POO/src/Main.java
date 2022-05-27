import classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hotdog");
        System.out.println("(5) - Mini Pizza");
        int escolha = in.nextInt();
        in.nextLine();
        Lanche lanche = null;

        switch (escolha) {
            case 1:
                lanche = new XSalada();
                break;

            case 2:
                lanche = new XBurguer();
                break;

            case 3:
                lanche = new MistoQuente();
                break;

            case 4:
                lanche = new Hotdog();
                break;

            case 5:
                lanche = new MiniPizza();
                break;

            default:
                System.err.println("Escolha uma opção válida!");
        }

        if (lanche instanceof Sanduiches) {
            //ADICIONAIS
            System.out.println("Deseja algum adicional? (S/N)");
            String adc = in.nextLine();
            if (adc.equalsIgnoreCase("S")) {
                System.out.println("Qual adicional você deseja? (max 10): ");
                for (int i = 0; i < 10; i ++) {
                    ((Sanduiches) lanche).adicionarAdicional(in.nextLine());
                    System.out.println("Deseja adicionar mais adicionais? (S/N)");
                    String parada = in.nextLine();
                    if(parada.equalsIgnoreCase("N")){
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
        }
        else {
            System.out.println("Borda recheada? (S/N)");
            String borda = in.nextLine();
            MiniPizza miniPizza = ((MiniPizza) lanche);
            ((MiniPizza) lanche).bordaRecheada = borda.equalsIgnoreCase("S");
            if (miniPizza.bordaRecheada) {
                System.out.println("Qual o sabor do recheio da borda:");
                miniPizza.saborBorda = in.nextLine();
            }
        }

        System.out.print("Informe o valor de " + lanche.tipo + ": R$");
        lanche.valor = in.nextDouble();
        lanche.montarComanda();

    }
}
