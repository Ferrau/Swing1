package com.example.swing1.App;
/*Realizar un programa escrito en Java que muestre una ventana de la clase JFrame
 con 1 botón(JButton) y una etiqueta(JLabel) cuando se pulse el botón deberá
 aparecer una ventana del tipo JDialog con característica modal
 (que no se pueda volver a la ventana principal hasta que no se cierre la ventana
 JDialog) con un Campo de Texto (JTextField) donde el usuario deberá introducir
 su nombre y un botón (JButton) que hará desaparecer la ventana JDialog y
 se mostrará en el JLabel de la ventana principal un saludo junto con el
 nombre ingresado en el JTextField.
*/
import com.example.swing1.App.Eventos.VentanaSol;

public class VentanaPrueba {
    public static void main(String[] args) {
        //MiVentana v = new MiVentana();
        //MiVentana2 v = new MiVentana2();
        MiVentana3 v = new MiVentana3();
        //BotonVentana v = new BotonVentana();
        //MiVentana5 v = new MiVentana5();
        //VentanaSol v = new VentanaSol();

        v.setVisible(true);
    }
    /*public static void main(String[] args) {
        JFrame f = new JFrame("Titulo de ventana");
        f.setSize(400, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }*/
}

