import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class UserBank_Acc {
      public double balance;
      UserBank_Acc(){
        balance = 1000.0;
      }
}
class ATMInterface1 extends JFrame {
    private JTextField user;
    UserBank_Acc u = new UserBank_Acc();
    public ATMInterface1(){
        setTitle("ATM Interface");
        setLocation(360, 150);
        setSize(800,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel pan1 = new JPanel();
        add(pan1);
        place_components(pan1);
        setVisible(true);
    }
    private void place_components(JPanel pan1) {
        pan1.setLayout(null);
        
        JLabel atmlabel1 = new JLabel("ATM MACHINE");
        atmlabel1.setBounds(270, 10, 620, 100);
        atmlabel1.setFont(new Font(("Aerial"),Font.BOLD,40));
        pan1.add(atmlabel1);

        JLabel userLabel = new JLabel("Enter Amount:");
        userLabel.setBounds(230, 150, 120, 30);
        userLabel.setFont(new Font(("Aerial"),Font.PLAIN,16));
        pan1.add(userLabel);

        user = new JTextField(20);
        user.setBounds(340, 150, 120, 30);
        pan1.add(user);

        JButton withdrawButton = new JButton("Withdraw");
        withdrawButton.setBounds(50, 250, 175, 50);
        withdrawButton.setFont(new Font(("Aerial"),Font.CENTER_BASELINE,18));
        pan1.add(withdrawButton);

        JButton depositButton = new JButton("Deposit");
        depositButton.setBounds(290, 250, 175, 50);
        depositButton.setFont(new Font(("Aerial"),Font.CENTER_BASELINE,18));
        pan1.add(depositButton);

        JButton balanceButton = new JButton("Check Balance");
        balanceButton.setBounds(530,250,175,50);
        balanceButton.setFont(new Font(("Aerial"),Font.CENTER_BASELINE,18));
        pan1.add(balanceButton);

        withdrawButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double amount = Double.parseDouble(user.getText());
                    if (amount > 0 && amount <= u.balance) {
                        u.balance -= amount;
                        JOptionPane.showMessageDialog(null, "Withdrawn: ₹" + amount);
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
                        u.balance += amount;
                        JOptionPane.showMessageDialog(null, "Deposited: ₹" + amount);
                    } else {
                        JOptionPane.showMessageDialog(null, "Please enter a valid deposit amount.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number.");
                }
            }
        }
        );

        balanceButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Available Balance: ₹"+ u.balance);
            }
        }
        );
    }
}

public class ATMInterface extends JFrame {
    public ATMInterface() {
        setTitle("ATM Machine");
        setLocation(250,0);
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
                setVisible(false);  
                new ATMInterface1(); 
           } 
        }
        );
    }
    public static void main(String[] args) {
        new ATMInterface();
    }   
}