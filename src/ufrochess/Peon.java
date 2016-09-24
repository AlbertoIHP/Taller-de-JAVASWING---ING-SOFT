/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufrochess;

/**
 *
 * @author Alberto
 */
public class Peon extends Pieza{
    public Peon(String color, String posicion, Casilla casillaActual) {
        super.setCasillaActual(casillaActual);
        super.setColor(color);
        super.setPosicion(posicion);

        if (color.equals("negro")) {
            super.setImagenPieza("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\peon_negro.png");
        } else {
            if (color.equals("blanco")) {
                super.setImagenPieza("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\peon_blanco.png");
            }
        }
    }
    
}
