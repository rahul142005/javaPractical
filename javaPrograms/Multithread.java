class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("From Thread A: %d * 3 = %d\n", i, (i * 3));
        }

        System.out.println("Exit from Thread A\n");
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("From Thread B: %d * 4 = %d\n", i, (i * 4));
        }

        System.out.println("Exit from Thread B\n");
    }
}

class C extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.printf("From Thread C: %d * 5 = %d\n", i, (i * 5));
        }

        System.out.println("Exit from Thread C\n");
    }
}

class Multithread {
    public static void main (String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();

        obj3.setPriority(10);
        obj1.setPriority(1);
        obj2.setPriority(7);

        System.out.println("Thread A start\n");
        obj1.start();
        System.out.println("Thread B start\n");
        obj2.start();
        System.out.println("Thread C start\n");
        obj3.start();
    }
}