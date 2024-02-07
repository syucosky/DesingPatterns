package FactoryMethod;

import javax.swing.*;

public class WindowsBtnProductoConcreto implements ButtonProducto {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;

    public void render() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 44));
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new java.awt.BorderLayout());
        frame.getContentPane().add(panel);
        panel.add(label, java.awt.BorderLayout.CENTER);
        onClick();
        frame.setSize(320, 200);
        frame.setVisible(true);
        onClick();
    }
    public void onClick() {
        button = new JButton("Exit");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                frame.setVisible(false);
                System.exit(0);
            }
        });
        panel.add(button, java.awt.BorderLayout.SOUTH);
    }
}
