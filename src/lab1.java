import java.util.Scanner;
public class lab1 {
        public static void main(String[] args) {
            try {
                double s = 0;
                Scanner in = new Scanner(System.in);
                System.out.println("Введіть a:");
                byte a = in.nextByte();
                System.out.println("Введіть b:");
                byte b = in.nextByte();
                System.out.println("Введіть n:");
                byte n = in.nextByte();
                System.out.println("Введіть m:");
                byte m = in.nextByte();
                if (a <= 0 && n >= 0) {
                    System.out.println("Ділення на нуль");
                } else {
                    for (byte i = a; i <= n; i++) {
                        for (byte j = b; j <= m; j++) {
                            s += ((double) (i + j) / i);
                        }
                    }
                    System.out.println(s);
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Було введено сторонній символ. Введіть ціле число");
            }

        }
}
