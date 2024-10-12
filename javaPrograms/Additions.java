import Addition.*;
import java.util.*;

class Additions {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int a = obj.nextInt();
        int b = obj.nextInt();

        Addition newA = new Addition();
        int sum = newA.add(a, b);

        System.out.printf("Sum = %d", sum);

        obj.close();
    }
}