package com.example.swing1.App.Eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoBotonPulsado implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        //imprime en consola
        //System.out.println("¡Gracias!");

        //imprime en boton
        JButton boton = (JButton) e.getSource();
        boton.setText("¡Gracias!");
    }
}
