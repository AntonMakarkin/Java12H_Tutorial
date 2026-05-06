import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Arithmetic

        int x = 10;
        int y = 2;

        x += y; //x = x + y
        x -= y; //x = x - y
        x *= y; //x = x * y
        x /= y;
        x %= y;

        x++;
        x--;
        System.out.println(x);

        //Order of operations [parentasis-exponents-multiplication-division-addition-S]

        double result = 3 + 4 * (7 - 5) / 2.0;
        System.out.println(result);
    }
}