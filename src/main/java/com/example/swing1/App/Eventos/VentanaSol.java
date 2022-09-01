package com.example.swing1.App.Eventos;

import javax.swing.*;
import java.awt.*;

public class VentanaSol extends JFrame {
    public VentanaSol() {
        super("Dibujo de un Sol");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container cp = getContentPane();
        cp.add(new PanelSol());
    }
}
