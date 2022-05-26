import classes.Hotdog;
import classes.MistoQuente;
import classes.XBurguer;
import classes.XSalada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-MENU: Escolha uma opção-");
        System.out.println("(1) - X-Salada");
        System.out.println("(2) - X-Burguer");
        System.out.println("(3) - Misto Quente");
        System.out.println("(4) - Hotdog");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                XSalada lanche = new XSalada();
                System.out.print("Informe o valor do XSalada: R$");
                lanche.valor = in.nextDouble();
                System.out.println("Lanche aberto? (S/N)");
                in.nextLine();
                String aberto = in.next();
                lanche.aberto = aberto.equalsIgnoreCase("S");
                lanche.montarComanda();
                break;

            case 2:
                XBurguer lanche2 = new XBurguer();
                System.out.print("Informe o valor do XBurguer: R$");
                lanche2.valor = in.nextDouble();
                System.out.println("Lanche aberto? (S/N)");
                in.nextLine();
                String aberto2 = in.next();
                lanche2.aberto = aberto2.equalsIgnoreCase("S");
                lanche2.montarComanda();
                break;

            case 3:
                MistoQuente lanche3 = new MistoQuente();
                System.out.print("Informe o valor do Misto quente: R$");
                lanche3.valor = in.nextDouble();
                lanche3.montarComanda();
                break;

            case 4:
                Hotdog lanche4 = new Hotdog();
                System.out.print("Informe o valor do Hotdog: R$");
                lanche4.valor = in.nextDouble();

                lanche4.montarComanda();
                break;

            default:
                System.out.println("Escolha uma opção válida!");

        }

    }
}
