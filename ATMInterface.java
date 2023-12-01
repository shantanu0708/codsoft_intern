import javax.swing.*;
//import java.awt.*;
//import java.util.Scanner.*;

public class ATMInterface extends JFrame {
    //private JTextField user;
    public ATMInterface() {
        setTitle("ATM Machine");
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pan = new JPanel();
        add(pan);
        placeComponents(pan);
        setVisible(true);
    }
    private void placeComponents(JPanel pan) {
        setLayout(null);
        JLabel atmlabel = new JLabel("Welcome to ATM Interface");
        atmlabel.setBounds(30, 50, 125, 25);
        pan.add(atmlabel);
        JButton startButton = new JButton("Begin");
        startButton.setBounds(60,70,120,25);
        pan.add(startButton);
    }
    public static void main(String[] args) {
        new ATMInterface();
    }   
}