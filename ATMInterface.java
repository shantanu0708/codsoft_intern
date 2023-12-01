import javax.swing.*;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ATMInterface1 extends JFrame {
    private JTextField user;
    private JLabel balanceLabel;
    private double balance = 1000.0;
    public ATMInterface1(){
        setTitle("ATM Interface");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pan1 = new JPanel();
        add(pan1);
        place_components(pan1);
        setVisible(true);
    }
        private void place_components(JPanel pan1) {
        pan1.setLayout(null);
        JLabel userLabel = new JLabel("Enter Amount:");
        userLabel.setBounds(10, 20, 120, 25);
        pan1.add(userLabel);

        user = new JTextField(20);
        user.setBounds(140, 20, 120, 25);
        pan1.add(user);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(10, 80, 120, 25);
        pan1.add(withdrawButton);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(140, 80, 120, 25);
        pan1.add(depositButton);

        balanceLabel = new JLabel("Balance: $" + balance);
        balanceLabel.setBounds(10, 120, 200, 25);
        pan1.add(balanceLabel);

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(user.getText());
                    if (amount > 0 && amount <= balance) {
                        balance -= amount;
                        updateBalanceLabel();
                        JOptionPane.showMessageDialog(null, "Withdrawn: $" + amount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid amount or insufficient funds.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        }
        );
        depositButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(user.getText());
                    if (amount > 0) {
                        balance += amount;
                        updateBalanceLabel();
                        JOptionPane.showMessageDialog(null, "Deposited: $" + amount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid deposit amount.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        }
        );
    }
    private void updateBalanceLabel() {
        balanceLabel.setText("Balance: $" + balance);
    }
}
public class ATMInterface extends JFrame {
    public ATMInterface() {
        setTitle("ATM Machine");
        setSize(1024,768);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pan = new JPanel();
        add(pan);
        placeComponents(pan);

        setVisible(true);
    }
    private void placeComponents(JPanel pan) {
        pan.setLayout(null);

        JLabel atmlabel = new JLabel("!!Welcome to ATM Interface!!");
        atmlabel.setBounds(175, 50, 620, 150);
        atmlabel.setFont(new Font(("Aerial"),Font.BOLD,45));
        pan.add(atmlabel);

        JButton startButton = new JButton("Begin");
        startButton.setBounds(300,300,360,100);
        startButton.setFont(new Font(("Aerial"),Font.PLAIN,45));
        pan.add(startButton);

        startButton.addActionListener( new ActionListener() {
            public void actionPerformed(ActionEvent e){   
                new ATMInterface1(); 
           } 
        }
        );
    }

    public static void main(String[] args) {
        new ATMInterface();
    }   
}