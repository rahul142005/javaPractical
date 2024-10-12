import java.util.*;

class Power {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        int base = obj.nextInt();
        int expo = obj.nextInt();
        int power = (int) Math.pow (base, expo);

        System.out.printf("Power of a number is %d", power);

        obj.close();
    }
}