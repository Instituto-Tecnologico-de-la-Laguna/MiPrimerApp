package com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inicio {
    private JPanel pnlInicio;
    private JTextField txtNombre;
    private JButton btnAceptar;

    public inicio() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, txtNombre.getText());
            }
        });
//Angel Hernandez Silva 23130010
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Primer App con Swing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300); //Tamaño de la ventana
        frame.setContentPane(new inicio().pnlInicio);
        //frame.setBounds(30,30,500,300);
        //prueba del git
        //prueba tres
        //
        //cambio
        frame.pack();
        frame.setVisible(true);

    }
}
