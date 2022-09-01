package com.example.swing1.App;

import javax.swing.*;

import com.example.swing1.App.Eventos.EventoBotonPulsado;

import java.awt.*;
import java.awt.event.ActionEvent;

public class MiVentana3 extends JFrame {
    public MiVentana3 () {
        super("Añadir usuario");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Panel de fecha
        JPanel panelFecha = new JPanel();
        panelFecha.setLayout(new FlowLayout());
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));
        panelFecha.add(new JLabel("/"));
        panelFecha.add(new JTextField(2));

        // Panel de datos
        JPanel panelDatos = new JPanel();
        GridLayout gl = new GridLayout(3,2,0,5);
        panelDatos.setLayout(gl);
        panelDatos.add(new JLabel("Nombre:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("DNI:"));
        panelDatos.add(new JTextField(10));
        panelDatos.add(new JLabel("Fecha de nacimiento: "));
        panelDatos.add(panelFecha);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());
        Container cp = getContentPane();
        cp.setLayout(new FlowLayout());
        JButton boton = new JButton("Aceptar");
        boton.addActionListener(new EventoBotonPulsado());
        cp.add(boton);
//        panelBotones.add(new JButton("Aceptar"));
//        panelBotones.add(new JButton("Cancelar"));
       


        cp.add(panelDatos, BorderLayout.CENTER);
        cp.add(panelBotones, BorderLayout.SOUTH);   

//        JPanel panelBotones = new JPanel();
//        panelBotones.setLayout(new FlowLayout()); 
//        panelBotones.add(new JButton("Aceptar")); 
//        panelBotones.add(new JButton("Cancelar"));
//
//        Container cp = getContentPane(); 
//        cp.add(panelDatos, BorderLayout.CENTER); 
//        cp.add(panelBotones, BorderLayout.SOUTH);

       
        
        
        
        
    }
    
    
}
