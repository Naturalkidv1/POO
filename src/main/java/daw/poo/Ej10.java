/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw.poo;

/**
 *
 * @author ajbazan01
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Cancion cancion1 = new Cancion();
        System.out.println(cancion1);
        
        Cancion cancion2 = new Cancion("Carta de Suicidio", "Porta");
        System.out.println(cancion2);
        
        cancion1.setAutor("Si");
        cancion1.setTitulo("La Bebesita bebe lean");
        System.out.println(cancion1);
        
        System.out.println(cancion1.toString());
        
    }
    
}
