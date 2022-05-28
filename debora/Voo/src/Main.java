import classes.Voo;

import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Voo voo = null;
        System.out.print("Digite a quantidade de fileiras do avião: "); //fileiras (linhas)
        int linhas = in.nextInt();
        System.out.print("Digite a quantidade de cadeiras por fileiras do avião: "); //colunas (quantidade de cadeiras por linha)
        int cadeirasPorLinha = in.nextInt();
        Voo v = new Voo(linhas,cadeirasPorLinha);

    }

}
