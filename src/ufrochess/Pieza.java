/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufrochess;

import javax.swing.ImageIcon;

/**
 *
 * @author Alberto
 */
public abstract class Pieza {

    ImageIcon imagenPieza;
    String posicion;
    String color;
    Casilla casillaActual;

    public Casilla getCasillaActual() {
        return casillaActual;
    }

    public void setCasillaActual(Casilla casillaActual) {
        this.casillaActual = casillaActual;
    }
    

    public ImageIcon getImagenPieza() {
        return imagenPieza;
    }

    public void setImagenPieza(String direccionImagen) {
        this.imagenPieza = new ImageIcon(direccionImagen);;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    

}
