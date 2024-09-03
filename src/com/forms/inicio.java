package com.forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class inicio {
    private JPanel pnlInicio;
    private JTextField txtNombre;
    private JButton btnAceptar;
    private JButton btnBorrar;

    public inicio() {
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, txtNombre.getText());
            }

        });
//Daniela Aldaco Hernandez C20130918
        btnBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtNombre.setText("");
            }
        });
    }


}
