package ufrochess;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alberto
 */

// PRIMERO QUE TODO SE HEREDA DE LA CLASE JFRAME QUE DEFINE TODO LO QUE UNA VENTANA PUEDE HACER (FRAME => VENTANA)
public class HolaMundoGUI extends JFrame implements WindowListener{
    private MiAjedrez tablero;
    private PanelLetras panelLetras;
    private PanelNumeros panelNumeros;
    private BorderLayout diseñoDeBordes;    
    
    
    public HolaMundoGUI() {
        //CON ESTE PODEMOS DEFINIR EL TITULO DE LA VENTANA
        super("Juego del Ajedrez"); // el titulo de la ventana
        
        this.diseñoDeBordes = new BorderLayout();
        //CADA FRAME TIENE UN JPANEL O CONTENEDOR POR DEFECTO EL CUAL SE LLAMA A SI MISMO COMO THIS
        this.setLayout(diseñoDeBordes); // Le damos un diseño de bordes
        
        
        //MEDIANTE ADD AGREGAMOS ELEMENTOS A NUESTRO JPANEL (CONTENEDOR), PUEDEN SER BOTONES, LABEL, MAS JPANEL, ETC.
        
         //REALIZANDO UNA MODIFICACION Y DEJANDO MIAJEDREZ COMO UN JPANEL, ESTE PUEDE SER INTRODUCIDO EN CUALQUEIR JFRAME (VENTANA)
        this.tablero = new MiAjedrez();
        System.out.println(this.tablero.ponerPieza("e5", "Alfil", "negro"));
        System.out.println(this.tablero.ponerPieza("c7", "Alfil", "blanco"));
        System.out.println(this.tablero.ponerPieza("e1", "Alfil", "blanco"));
        System.out.println(this.tablero.ponerPieza("g7", "Alfil", "blanco"));
        System.out.println(this.tablero.ponerPieza("c3", "Caballo", "blanco"));
        System.out.println(this.tablero.ponerPieza("e8", "Caballo", "blanco"));
        System.out.println(this.tablero.ponerPieza("f3", "Caballo", "negro"));
        System.out.println(this.tablero.ponerPieza("h4", "Torre", "blanco"));
        System.out.println(this.tablero.ponerPieza("a4", "Torre", "negro"));
        System.out.println(this.tablero.ponerPieza("a7", "Torre", "blanco"));
        System.out.println(this.tablero.ponerPieza("b1", "Peon", "negro"));
        System.out.println(this.tablero.ponerPieza("b5", "Peon", "blanco"));
        System.out.println(this.tablero.ponerPieza("d1", "Peon", "negro"));
        this.add(tablero, BorderLayout.CENTER);
        
        
        //Ponemos a la izquierda o al oeste el panel de letras
        panelLetras = new PanelLetras();
        this.add(panelLetras, BorderLayout.SOUTH);
        
        //Ponemos abajo o al sur el panel de numeros
        panelNumeros = new PanelNumeros();
        this.add(panelNumeros, BorderLayout.WEST);
        
        
       
        this.setVisible(true); // mostramos la ventana 
        this.pack(); // la ajustamos 
        
        //Como esta clase tiene un rol de escuchador de ventana entonces, le podemos decir que se escuche a si misma para reaccionar
        this.addWindowListener(this);
    }

    public static void main(String[] a) {
         new HolaMundoGUI();
    }

    @Override
    public void windowOpened(WindowEvent we) {
    }

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
        
    }

    @Override
    public void windowClosed(WindowEvent we) {
    }

    @Override
    public void windowIconified(WindowEvent we) {
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
    }

    @Override
    public void windowActivated(WindowEvent we) {
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
    }
}
