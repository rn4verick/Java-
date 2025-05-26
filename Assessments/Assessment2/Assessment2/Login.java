package Assessment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame {

    private JTextField txtUsername;
    private JPasswordField txtPassword;

    public Login() {
        setTitle("Hangman Game - Login");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Username:"));
        txtUsername = new JTextField();
        panel.add(txtUsername);

        panel.add(new JLabel("Password:"));
        txtPassword = new JPasswordField();
        panel.add(txtPassword);

        JButton btnLogin = new JButton("Login");
        JButton btnRegister = new JButton("Register");

        panel.add(btnLogin);
        panel.add(btnRegister);

        add(panel);


        btnLogin.addActionListener(e -> login());
        btnRegister.addActionListener(e -> register());

        setVisible(true);
    }


    private void login() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        User currentUser = DBManager.checkLogin(username, password);

        if (currentUser != null) {
            JOptionPane.showMessageDialog(this, "Login successful!");
            dispose();
            new Game(currentUser);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid username or password.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void register() {
        String username = txtUsername.getText().trim();
        String password = new String(txtPassword.getPassword());

        if (username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty!", "Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean success = DBManager.registerUser(username, password);
        if (success) {
            JOptionPane.showMessageDialog(this, "Registration successful!");
        } else {
            JOptionPane.showMessageDialog(this, "Registration failed. Username may exist.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}