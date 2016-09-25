package ufrochess;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiAjedrez extends JPanel implements WindowListener {

    Casilla[] casi;
    Color casillaNegra;
    Color casillaBlanca;
    Pieza piezaSeleccionada;

    public Pieza getPiezaSeleccionada() {
        return piezaSeleccionada;
    }

    public void setPiezaSeleccionada(Pieza piezaSeleccionada) {
        this.piezaSeleccionada = piezaSeleccionada;
    }

    
    
    public MiAjedrez() {
        super();
        this.casillaNegra = new Color(50, 50, 50);
        this.casillaBlanca = new Color(255, 255, 255);
        this.casi = new Casilla[64];
        this.setSize(400, 300);
        this.setLocation(100, 100);
        this.setLayout(new GridLayout(8, 8));
        this.creaCasillas();
        this.setVisible(true);
        //Este objeto en su rol de FRAME (VENTANA) le asignamos un escuchador de ventana, que es el mismo en su rol de implementacion de 
        //Escuchador de ventana (WindowListener)
        //this.addWindowListener(this);
        //this.setResizable(true);
        //this.setTitle("Ajedrez");

    }

    public int getAnchoCasilla() {
        return this.casi[5].getWidth();
    }

    public boolean ponerPieza(String posicion, String pieza, String color) {
        Casilla cas = this.enPosicion(posicion);
        Pieza alfil = null;
        if (pieza.equals("Alfil")) {
            alfil = new Alfil(color, posicion, cas);
        } else {
            if (pieza.equals("Caballo")) {
                alfil = new Caballo(color, posicion, cas);
            } else {
                if (pieza.equals("Torre")) {
                    alfil = new Torre(color, posicion, cas);
                }else{
                    if(pieza.equals("Peon")){
                        alfil = new Peon(color, posicion, cas);
                    }
                }
            }
        }

        if (cas != null) {
            cas.setPieza(alfil);

            return true;
        } else {
            return false;
        }
    }

    public Casilla enPosicion(String posicion) {
        Casilla cas = null;
        for (int i = 0; i < this.casi.length; i++) {
            if (this.casi[i].getCodigo().equals(posicion)) {
                return this.casi[i];
            }
        }
        return cas;
    }

    private void creaCasillas() {
        int k = -1;
        char letracel = 'a';
        int numecel = 8;

        for (int i = 1; i <= 64; i++) {
            this.casi[i - 1] = new Casilla("" + letracel + numecel, this);
            this.casi[i - 1].setLabel(this.casi[i - 1].getCodigo());
            //if(i==3) this.casi[i-1].setLabel("Cab");
            this.add(this.casi[i - 1]);
            if (k == 1) {
                this.casi[i - 1].setBackground(casillaNegra);
            } else {
                this.casi[i - 1].setBackground(casillaBlanca);
            }
            k *= -1;
            letracel++;

            if (i % 8 == 0) {
                k *= -1;
                numecel--;
                letracel = 'a';

            }

        }

    }

    public void limpiarTablero() {
        for (int i = 0; i < this.casi.length; i++) {
            if (this.casi[i].getPieza() != null) {

            } else {

                //this.casi[i].setLabel(null);
                this.casi[i].setIcon(null);
            }
        }
    }

    @Override
    public void windowOpened(WindowEvent we) {

    }

    @Override
    public void windowClosing(WindowEvent we) {
        //this.setVisible(false);
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
