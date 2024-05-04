import java.awt.geom.Arc2D;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please, enter height of the pyramid: ");

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        for (int i = 0; i < (2 * h); i++) {
            for (int j = 0; j <  h - Math.abs(h-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}