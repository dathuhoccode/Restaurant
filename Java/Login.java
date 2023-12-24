package Restaurant.Java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;
import java.util.Objects;
import javax.swing.*;

public class Login {
    public static void main(String[] agrs) {
        JFrame f = new JFrame("Login");
        JLabel l1, l2;
        l1 = new JLabel("Who are you");
        l1.setBounds(50, 75, 100, 30);
        l2 = new JLabel("And your password");
        l2.setBounds(50, 125, 150, 30);
        JTextField jt = new JTextField();
        jt.setBounds(200, 82, 150, 30);
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setBounds(200, 125, 150, 30);
        Button login = new Button("Login");
        login.setBounds(200, 165, 75, 35);
        JLabel register = new JLabel("You haven't account, press me");
        register.setBounds(150,190,250,100);
        register.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                new Register().setVisible(true);
            }
        });
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = jt.getText();
                String pass = jPasswordField.getText();
                try {
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Restaurant","root","1234");
                    Statement statement = conn.createStatement();
                    ResultSet result = statement.executeQuery("select * from acc");
                    int loginrequest = '0';
                    if (conn != null) {
                        while (result.next()) {
                            if ((Objects.equals(result.getString("Acc_name"), name)) && (Objects.equals(result.getString("Acc_pass"), pass))) {

                                if(result.getString("acc_access").contains("ADMIN")) {
                                    loginrequest = 1;
                                }else if (result.getString("acc_access").contains("CUSTOMER")){
                                    loginrequest = 2;
                                }
                            }
                        }
                    }
                    ;
                    if (loginrequest == 1){
                        f.dispose();
                        JOptionPane.showMessageDialog(null, "Login success", "Login", JOptionPane.INFORMATION_MESSAGE);
                        new Menu().setVisible(true);
                    }else if (loginrequest == 2) {
                        f.dispose();
                        JOptionPane.showMessageDialog(null, "Login success", "Login", JOptionPane.INFORMATION_MESSAGE);
                        new MenuOrder().setVisible(true);
                    }else{
                        JOptionPane.showMessageDialog(null, "Login fail", "Login", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        f.add(login);
        f.add(l1);
        f.add(l2);
        f.add(jt);
        f.add(register);
        f.add(jPasswordField);
        f.setSize(500, 500);
        f.setLayout(new BorderLayout());
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}