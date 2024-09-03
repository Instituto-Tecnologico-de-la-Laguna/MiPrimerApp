package com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Operaciones {
    private JLabel labPrimer;
    private JTextField txtNumUno;
    private JTextField txtNumDos;
    private JButton btnCalcular;
    private JButton btnBorrar;
    private JPanel pnlOperaciones;

    public Operaciones() {
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(txtNumUno.getText());
                int b = Integer.parseInt(txtNumDos.getText());

                JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + (a + b));

                txtNumUno.setText("");
                txtNumDos.setText("");
            }
        });
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNumUno.setText("");
                txtNumDos.setText("");

            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Primer App con Swing GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300); //Tamaño de la ventana
        frame.setContentPane(new Operaciones().pnlOperaciones);
        //frame.setBounds(30,30,500,300);
        //prueba del git
        //prueba tres
        //
        //cambio
        frame.pack();
        frame.setVisible(true);

    }
    //Daniela Aldaco
}
