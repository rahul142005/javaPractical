import java.util.*;

class notEligible extends Exception {
    notEligible (String s) {
        super(s);
    }
}

class ExceptionThrow {
    static void check (int percent) throws notEligible {
        if (percent < 50) {
            throw new notEligible ("Not eligible to write exam!");
        }
        else if (percent >= 75) {
            System.out.println("Eligible to write exam!");
        }
        else {
            System.out.println("Eligible to write exam, after fine");
        }
    }

    public static void main (String[] args) {
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter attendance percentage: ");
        int percent = obj.nextInt();

        try {
            check (percent);
        }

        catch (notEligible e) {
            System.out.println(e.getMessage());
        }

        obj.close();
    }
}