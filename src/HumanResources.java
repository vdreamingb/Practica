import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HumanResources extends JFrame {
    private JTextField textField1;
    private JPanel contentPane;
    private JButton button1;
    private JLabel logIn;
    private JLabel username;
    private JLabel password;
    private JPasswordField passwordField1;

    private void initStyles(){
        contentPane.setBackground(Color.DARK_GRAY);
        contentPane.setForeground(Color.WHITE);
        button1.setBackground(Color.GREEN);
        button1.setForeground(Color.WHITE);
        logIn.setForeground(Color.WHITE);
        textField1.setBorder(BorderFactory.createEmptyBorder());
        passwordField1.setBorder(BorderFactory.createEmptyBorder());
        button1.setBorder(BorderFactory.createEmptyBorder());
        username.setForeground(Color.WHITE);
        password.setForeground(Color.WHITE);
    }

    public HumanResources(){
        initStyles();
        setTitle("Human resources");
        setSize(600, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(contentPane);
        setVisible(true);
        setResizable(false);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textField1.getText();
                String password = new String(passwordField1.getPassword());
                LogInLogic newUser = new LogInLogic(username, password);
                boolean isTrueUser = newUser.logIn();
                if(isTrueUser){
                    new Workspace();
                    dispose();
                } else{
                    JDialog dialog = new JDialog(HumanResources.this, "Eroare", true);
                    JLabel newErrorMessage = new JLabel("Nu ati introdus parola sau nume de utilizator correct");
                    dialog.add(newErrorMessage);
                    dialog.setSize(400, 150);
                    dialog.setLocationRelativeTo(HumanResources.this);
                    dialog.setVisible(true);
                }
            }
        });
    }

    public static void main(String[] args){
        new HumanResources();
    }
}
