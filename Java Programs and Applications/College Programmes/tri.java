import java.lang.*;
class tri
{
public static void stars() {
    for (int i = 1; i <= 10; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        for (int j = 1; j <= 8 - 2 * i; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}