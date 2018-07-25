package ge.cu.edu.View;


import ge.cu.edu.Controller.LoginController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Login {
    private JPanel mainPanel;
    private JTextField txt_username;
    private JTextField txt_pwd;
    private JButton btn_signin;

    public Login() {
        btn_signin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(txt_username.getText());
                System.out.println(txt_pwd.getText());

                if (LoginController.chackAccount(txt_username.getText(), txt_pwd.getText())) {
                    System.out.println("Succsess");
                } else {
                    System.out.println("username or pwd is incorrect");
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login app");
        frame.setSize(500, 400);
        frame.setContentPane(new Login().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
