package com.example.swing1.App.Eventos;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EventoSaludo implements ActionListener {

    private JTextField cuadroTexto;
    public EventoSaludo(JTextField cuadroTexto) {
        this.cuadroTexto = cuadroTexto;
    }
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "¡Hola, " +
                cuadroTexto.getText() + "!");
    }

}


