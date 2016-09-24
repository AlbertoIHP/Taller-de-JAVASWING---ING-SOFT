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
public class ejecutabe {

    public static void main(String[] args) {
        MiAjedrez a = new MiAjedrez();
        System.out.println(a.ponerPieza("e5", "Alfil", "negro"));
        System.out.println(a.ponerPieza("c7", "Alfil", "blanco"));
        System.out.println(a.ponerPieza("e1", "Alfil", "blanco"));
        System.out.println(a.ponerPieza("g7", "Alfil", "blanco"));
        System.out.println(a.ponerPieza("c3", "Caballo", "blanco"));
        System.out.println(a.ponerPieza("e8", "Caballo", "blanco"));
        System.out.println(a.ponerPieza("f3", "Caballo", "negro"));
        System.out.println(a.ponerPieza("h4", "Torre", "blanco"));
        System.out.println(a.ponerPieza("a4", "Torre", "negro"));
        System.out.println(a.ponerPieza("a7", "Torre", "blanco"));
        System.out.println(a.ponerPieza("b1", "Peon", "negro"));
        System.out.println(a.ponerPieza("b5", "Peon", "blanco"));
        System.out.println(a.ponerPieza("d1", "Peon", "negro"));
    }
}
