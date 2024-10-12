import java.util.*;

class Array {
    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        System.out.print("Enter number of elements: ");
        
        int noe = obj.nextInt();
        int[] arr = new int[noe];

        System.out.print("Enter array elements: ");

        for (int ind = 0; ind <= arr.length - 1; ind++) {
            arr[ind] = obj.nextInt();
        }

        System.out.print("Elements of array: ");

        for (int ind = 0; ind <= arr.length - 1; ind++) {
            System.out.printf("%d ",arr[ind]);
        }

        obj.close();
    }
}