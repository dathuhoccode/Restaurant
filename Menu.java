package Restaurant;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Menu {
    public static void main(String[] agrs) {
        JFrame f = new JFrame("Menu");
        JMenuBar menuBar = new JMenuBar();
        f.setJMenuBar(menuBar);
        JMenu jMenu = new JMenu("Menu");
        JMenu jMenu1 = new JMenu("Bill");
        JMenu jMenu2 = new JMenu("Help");
        JMenuItem item = new JMenuItem("Add food");
        JMenuItem item1 = new JMenuItem("Add food ingredients");
        JMenuItem menuItem = new JMenuItem("Check bill");
        JMenuItem menuItem1 = new JMenuItem("Clear bill");
        JTable table = new JTable();
        menuBar.add(jMenu);
        menuBar.add(jMenu1);
        menuBar.add(jMenu2);
        jMenu.add(item);
        jMenu.add(item1);
        jMenu1.add(menuItem);
        jMenu1.add(menuItem1);
        JLabel jLabel;
        jLabel = new JLabel("Food name");
        jLabel.setFont(new Font("",Font.PLAIN,24));
        jLabel.setBounds(15,15,150,25);
        JLabel jLabel1 = new JLabel("Quality");
        jLabel1.setFont(new Font("",Font.PLAIN,24));
        jLabel1.setBounds(15,70,150,25);
        JLabel jLabel2 = new JLabel("Cost");
        jLabel2.setFont(new Font("",Font.PLAIN,24));
        jLabel2.setBounds(15,135,150,25);
        JTextField jTextField = new JTextField();
        jTextField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isLetter(c)) {
                    e.consume(); // Ngăn chặn ký tự không phải chữ được nhập vào
                }
            }
        });
        jTextField.setBounds(150,16,100,30);
        JTextField jTextField1 = new JTextField();
        jTextField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ngăn chặn ký tự không phải số được nhập vào
                }
            }
        });
        jTextField1.setBounds(150,70,100,30);
        JTextField jTextField2 = new JTextField();
        jTextField2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (!Character.isDigit(c)) {
                    e.consume(); // Ngăn chặn ký tự không phải số được nhập vào
                }
            }
        });
        jTextField2.setBounds(150,135,100,30);
        JButton addButton = new JButton("Add");
        addButton.setBounds(270,16,75,30);
        DefaultTableModel tableModel = new DefaultTableModel();
        JTable Table = new JTable(tableModel);

        // Thêm cột cho bảng
        tableModel.addColumn("Column 1");
        tableModel.addColumn("Column 2");
        tableModel.addColumn("Column 3");
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(jTextField);
        inputPanel.add(jTextField1);
        inputPanel.add(jTextField2);
        inputPanel.add(addButton);

        f.add(inputPanel, BorderLayout.NORTH);
        f.add(new JScrollPane(table), BorderLayout.CENTER);

        // Xử lý sự kiện khi nút được nhấn
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lấy dữ liệu từ các TextField
                String data1 = jTextField.getText();
                String data2 = jTextField1.getText();
                String data3 = jTextField2.getText();

                // Thêm dữ liệu vào bảng
                tableModel.addRow(new Object[]{data1, data2, data3});

                // Xóa dữ liệu trong các TextField
                jTextField.setText("");
                jTextField1.setText("");
                jTextField2.setText("");
            }
        });
        Table.setBounds(150,250,800,300);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.add(jLabel);
        f.add(jLabel1);
        f.add(jLabel2);
        f.add(jTextField);
        f.add(jTextField1);
        f.add(jTextField2);
        f.add(addButton);
        f.setLayout(null);
        f.add(Table);
        f.setSize(1652,835);
        f.setVisible(true);
    }
}
