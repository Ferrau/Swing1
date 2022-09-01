package com.example.swing1.App.Eventos;

import javax.swing.*;
import java.awt.*;

public class MiVentana5 extends JFrame {
    public MiVentana5() {
        super("Titulo de ventana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container cp = getContentPane();
        cp.add(new JLabel("Nombre :"));
        JTextField texto = new JTextField(20);
        cp.add(texto);
        JButton botonSaludo = new JButton("Saludar");
        cp.add(botonSaludo);
        botonSaludo.addActionListener(new EventoSaludo(texto));
    }
}

//Version 2

/* public class MiVentana5 extends JFrame {
    private JTextField cuadroTexto;
    class EventoSaludo implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "¡Hola, " +
                    cuadroTexto.getText() + "!");
        }
    }
 */


//Version 3

/*public class MiVentana extends JFrame implements ActionListener {
    private JTextField cuadroTexto;
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "¡Hola, " +
                cuadroTexto.getText() + "!");
    }
    public MiVentana() {
 …
        cuadroTexto = new JTextField(20);
        cp.add(cuadroTexto);
 …
        botonSaludo.addActionListener(this);

    }
 */
