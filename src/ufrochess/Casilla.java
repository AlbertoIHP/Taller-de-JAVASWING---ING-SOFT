package ufrochess;

import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Casilla extends JButton implements MouseListener, ComponentListener {

    String codigo;
    ImageIcon imagenCasilla;
    Pieza pieza;
    MiAjedrez tablero;
    
    public Casilla(String codigo, MiAjedrez tablero) {
        this.codigo = codigo;
        this.addMouseListener(this);
        this.addComponentListener(this);
        this.pieza = null;
        this.imagenCasilla = null;
        this.tablero = tablero;
    }

    public ImageIcon getImagenCasilla() {
        return imagenCasilla;
    }

    public void setImagenCasilla(ImageIcon imagenCasilla) {
        this.imagenCasilla = imagenCasilla;
        this.setIcon(imagenCasilla);
    }

    public Pieza getPieza() {
        return pieza;
    }

    public void setPieza(Pieza pieza) {
        //this.setLabel(null);
        this.pieza = pieza;
        try{
        this.setImagenCasilla(pieza.getImagenPieza());
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void mouseClicked(MouseEvent me) {
        if(this.getPieza() != null && tablero.getPiezaSeleccionada()==null){
        tablero.setPiezaSeleccionada(this.pieza);
        this.setIcon(null);
        this.setPieza(null);
        }else{
            if(this.getPieza() == null){
                if(tablero.getPiezaSeleccionada() != null){
                    this.setPieza(tablero.getPiezaSeleccionada());
                    this.getPieza().setCasillaActual(this);
                    tablero.setPiezaSeleccionada(null);
                    this.mouseEntered(me);
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        //if(tablero.getPiezaSeleccionada() != null){
        //this.setPieza(tablero.getPiezaSeleccionada());
        //}
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        if(this.pieza != null){
            if(this.pieza instanceof Alfil){
                ((Alfil)this.pieza).consultarPosicion();
            }else{
                if(this.pieza instanceof Caballo){
                    ((Caballo)this.pieza).consultarPosicion();
                }else{
                    if(this.pieza instanceof Torre){
                        ((Torre)this.pieza).consultarPosicion();
                    }
                }
            }
        }
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        this.tablero.limpiarTablero();
        
    }

    @Override
    public void componentResized(ComponentEvent ce) {
        int ancho = this.getWidth() - 30;
        int alto = this.getHeight() - 20;
        try{
        this.imagenCasilla = new ImageIcon(this.pieza.getImagenPieza().getImage().getScaledInstance(ancho, alto, java.awt.Image.SCALE_REPLICATE));
        this.setIcon(imagenCasilla);
        System.out.println("RESIZED");
        }catch(Exception e){
            
        }
    }

    public MiAjedrez getTablero() {
        return tablero;
    }

    public void setTablero(MiAjedrez tablero) {
        this.tablero = tablero;
    }

    @Override
    public void componentMoved(ComponentEvent ce) {
        System.out.println("MOVED");
    }

    @Override
    public void componentShown(ComponentEvent ce) {
        System.out.println("SHOWN");
    }

    @Override
    public void componentHidden(ComponentEvent ce) {
        System.out.println("HIDDEN");
    }
    
}
