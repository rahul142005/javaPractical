import javax.swing.*;

class Swing {
    public static void main (String[] args) {
        JFrame j = new JFrame("Form");
        
        
        JLabel l1 = new JLabel("Name");
        j.add(l1);
        l1.setBounds(10, 30, 50, 50);

        JLabel l2 = new JLabel("Register number: ");
        j.add(l2);
        l2.setBounds(10, 70, 100, 50);

        JLabel l3 = new JLabel("Class");
        j.add(l3);
        l3.setBounds(10, 110, 100, 50);

        JLabel l4 = new JLabel("College: ");
        j.add(l4);
        l4.setBounds(10, 150, 100, 50);

        JLabel l5 = new JLabel("Contact: ");
        j.add(l5);
        l5.setBounds(10, 190, 100, 50);

        
        JTextField t1 = new JTextField();
        j.add(t1);
        t1.setBounds(100, 40, 150, 30);

        JTextField t2 = new JTextField();
        j.add(t2);
        t2.setBounds(100, 80, 150, 30);

        JTextField t3 = new JTextField();
        j.add(t3);
        t3.setBounds(100, 120, 150, 30);

        JTextField t4 = new JTextField();
        j.add(t4);
        t4.setBounds(100, 160, 150, 30);

        JTextField t5 = new JTextField();
        j.add(t5);
        t5.setBounds(100, 200, 150, 30);

        
        j.setSize(550, 500);
        j.setLayout(null);
        j.setVisible(true);
    }
}