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
public class Alfil extends Pieza {
    

    public Alfil(String color, String posicion,Casilla casillaActual) {
        super.setCasillaActual(casillaActual);
        super.setColor(color);
        super.setPosicion(posicion);
        if(color.equals("negro")){
            super.setImagenPieza("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\alfil_negro.png");
        }else{
            if(color.equals("blanco")){
                super.setImagenPieza("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\alfil_blanco.png");
            }
        }
    }
    
    
    
    public void consultarPosicion(){
        //TENEMOS LA COORDENADA DE LA CASILLA EN LA QUE ESTAMOS
        String indice = super.getCasillaActual().getCodigo();
        char letra = indice.charAt(0);
        int numero = Integer.parseInt(""+indice.charAt(1));
        for (int i = 0; i < 10; i++) {
            String asd = (letra++)+""+(numero++);
            if(recorrer(asd, i)){
              break;  
            }
        }
        
        letra = indice.charAt(0);
        numero = Integer.parseInt(""+indice.charAt(1));
        
        for (int i = 0; i < 10; i++) {
            String asd = (letra--)+""+(numero--);
            if(recorrer(asd, i)){
              break;  
            }
        }
        
        letra = indice.charAt(0);
        numero = Integer.parseInt(""+indice.charAt(1));
        
        for (int i = 0; i < 10; i++) {
            String asd = (letra++)+""+(numero--);
            if(recorrer(asd, i)){
              break;  
            }
        }
        
        letra = indice.charAt(0);
        numero = Integer.parseInt(""+indice.charAt(1));
        
        for (int i = 0; i < 10; i++) {
            String asd = (letra--)+""+(numero++);
            if(recorrer(asd, i)){
              break;  
            }
        }
        
    }

private boolean recorrer(String asd, int i){
    char letra = asd.charAt(0);
    int numero = asd.charAt(1);
    int ancho = super.getCasillaActual().getWidth() ;
    int alto = super.getCasillaActual().getHeight() ;
    ImageIcon imagenInicial = new ImageIcon("C:\\Users\\Alberto\\Desktop\\IMAGENES CHESS NIGGA IE\\objetivo.png");
    ImageIcon imagen = new ImageIcon(imagenInicial.getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_REPLICATE));
    
    try{
            
            if(super.getCasillaActual().getTablero().enPosicion(asd).getPieza() == null){
                super.getCasillaActual().getTablero().enPosicion(asd).setIcon(imagen);
                
            }else{
                if(super.getCasillaActual().getTablero().enPosicion(asd).getPieza() != null){
                    if(super.getCasillaActual().getTablero().enPosicion(asd).getPieza().getColor().equals(super.getColor())){
                        if(i!=0){
                            return true;
                        }
                    }else{
                        
                        super.getCasillaActual().getTablero().enPosicion((letra--)+""+(numero++)).setIcon(imagen);
                    }
                }
            }
            }catch(Exception e){
                
            }
    
    return false;
}
    
   

    
}
