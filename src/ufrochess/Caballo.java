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
public class Caballo extends Pieza {

    public void consultarPosicion() {
        //TENEMOS LA COORDENADA DE LA CASILLA EN LA QUE ESTAMOS
        String indice = super.getCasillaActual().getCodigo();
        char letra = indice.charAt(0);
        int numero = Integer.parseInt("" + indice.charAt(1));
        int ancho = super.getCasillaActual().getWidth() ;
        int alto = super.getCasillaActual().getHeight() ;
        ImageIcon imagenInicial = new ImageIcon("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\objetivo.png");
        ImageIcon imagen = new ImageIcon(imagenInicial.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_REPLICATE));

        String asd = (++letra) + "" + (++numero);
        try{
        if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
            asd = (++letra) + "" + numero;
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
            asd =(--letra)+""+(++numero);
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        letra = indice.charAt(0);
        numero = Integer.parseInt("" + indice.charAt(1));
        try{
        asd = (--letra) + "" + (--numero);
        if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
            asd = (--letra) + "" + numero;
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
            asd =(++letra)+""+(--numero);
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
        letra = indice.charAt(0);
        numero = Integer.parseInt("" + indice.charAt(1));
        try{
        asd = (++letra) + "" + (--numero);
        if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
            asd = (++letra) + "" + numero;
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
            asd =(--letra)+""+(--numero);
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        letra = indice.charAt(0);
        numero = Integer.parseInt("" + indice.charAt(1));
        
        try{
        asd = (--letra) + "" + (++numero);
        if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
            asd = (--letra) + "" + numero;
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
            asd =(++letra)+""+(++numero);
            if (super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null) {
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }

    public Caballo(String color, String posicion, Casilla casillaActual) {
        super.setCasillaActual(casillaActual);
        super.setColor(color);
        super.setPosicion(posicion);
        if (color.equals("negro")) {
            super.setImagenPieza("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\caballo_negro.png");
        } else {
            if (color.equals("blanco")) {
                super.setImagenPieza("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\caballo_blanco.png");
            }
        }
    }

}
