
package daw.poo;

//17,18,19,20,24,25

//Quiero una clase llamada Utilidades, sin atributos, con dos métodos: generarAleatorios 
//en un rango dado y leer Enteros con Scanner. Luego probar en un main ambos métodos 
//creando un objeto de la clase Utilidades

public class EJ17 {

    
    public static void main(String[] args) {
        CajaCarton caja1 = new CajaCarton();
        System.out.println("Caja 1 - Ancho: " + caja1.getAncho());
        System.out.println("Caja 1 - Alto: " + caja1.getAlto());
        System.out.println("Caja 1 - Peso: " + caja1.getPeso());
        System.out.println("Caja 1 - Largo: " + caja1.getLargo());
        
        System.out.println("Ahora introducimos un nuevo peso, anchura, altura y longitud.");
        caja1.setAncho(45);
        caja1.setAlto(84);
        caja1.setAlto(24);
        caja1.setLargo(12);
        
        System.out.println("Caja 1 - Ancho: " + caja1.getAncho());
        System.out.println("Caja 1 - Alto: " + caja1.getAlto());
        System.out.println("Caja 1 - Peso: " + caja1.getPeso());
        System.out.println("Caja 1 - Largo: " + caja1.getLargo());
        
        CajaCarton caja2 = new CajaCarton(1, 45, 8, 4, 1);
        CajaCarton caja3 = new CajaCarton();
        
        System.out.println(caja2);
        caja2.abrir();
        caja3.cerrar();
        
        
    }
    
}
