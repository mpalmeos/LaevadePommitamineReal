package Main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Maie on 10/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Alustame pommitamisega!");
        System.out.println("Autor: Krister (näidismäng)");
        System.out.println("2016");

        int[][] LauaAlgseis = new int[9][9];
        int[][] LauaSeis = new int[9][9];

        // 0 - meri
        // 1 - laev
        // 2 - tabamus


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                LauaAlgseis[i][j] = (int) (Math.random() * 1.3);

                // i - increment/index
                // j - võib olla ka ii
            }
        }

        prindiLaud(LauaSeis);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Kuhu tahad pommitada? Formaat: x-y");
            String input = sc.nextLine();
            String[] xy = input.split("-");
            int x = Integer.parseInt(xy[0]) - 1;
            int y = Integer.parseInt(xy[1]) - 1;

            int tabamus = LauaAlgseis[y][x];

            if (tabamus == 1) {
                LauaSeis[y][x] = 2;
                System.out.println("Pihtas!");
            } else if (tabamus == 0) {
                LauaSeis[y][x] = 3;
                System.out.println("Mööda!");
            } else if (tabamus == 2) {
                System.out.println("Juba lasid põhja!");
            } else {
                System.out.println("Easter!");
                break;
            }

            prindiLaud(LauaSeis);

        }
        System.out.println("Mäng läbi!");

    }

    public static void prindiLaud(int[][] laud) {
        for (int i = 0; i < 9; i++) {
            System.out.println(Arrays.toString(laud[i]));
        }
    }
}
