package Restaurant;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
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
        JTextField jt1 = new JTextField();
        jt1.setBounds(200, 125, 150, 30);
        Button login = new Button("Login");
        login.setBounds(200, 165, 75, 35);
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = jt.getText();
                String pass = jt1.getText();
                try {
                    File file = new File("D:\\Codejava\\myproject\\src\\Restaurant\\text.txt");
                    Scanner scanner = new Scanner(file);
                    boolean loginrequest = false;
                    // Đọc dữ liệu từ file
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        // Split dữ liệu theo khoảng trắng
                        String[] data = line.split(" ");
                        // Kiểm tra thông tin đăng nhập
                        if (data.length == 2 && data[0].equals(name) && data[1].equals(pass)) {
                            loginrequest = true;
                            break;
                        }
                    }
                    scanner.close();
                    ;
                    if (loginrequest){
                        f.dispose();
                        JOptionPane.showMessageDialog(null, "Login success", "Login", JOptionPane.INFORMATION_MESSAGE);
                        Menu menu = new Menu();
                        menu.display();
                    }else {
                        JOptionPane.showMessageDialog(null, "Login fail", "Login", JOptionPane.INFORMATION_MESSAGE);
                    }

                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
        f.add(login);
        f.add(l1);
        f.add(l2);
        f.add(jt);
        f.add(jt1);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
