package com.example.swing1.App.Eventos;

import javax.swing.*;
import java.awt.*;

public class BotonVentana extends JFrame {
    public BotonVentana() {
        super("Botón");
        setSize(200,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton("¡Púlsame!");
        boton.addActionListener(new EventoBotonPulsado());
        cp.add(boton);
    }
}
