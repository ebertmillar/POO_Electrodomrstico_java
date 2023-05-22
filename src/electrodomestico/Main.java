/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author Ebert
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Electrodomestico[] electrodomesticos = new Electrodomestico[10];

        electrodomesticos[0] = new Electrodomestico(200, "Verde", 'C', 10);
        electrodomesticos[1] = new Lavadora(150, 30);
        electrodomesticos[2] = new Televisor(42, false, 500, "negro", 'E', 80);
        electrodomesticos[3] = new Electrodomestico();
        electrodomesticos[4] = new Electrodomestico(600, "gris", 'D', 20);
        electrodomesticos[5] = new Lavadora(40, 300,"blanco", 'Z',40);
        electrodomesticos[6] = new Televisor(250, 70);
        electrodomesticos[7] = new Lavadora(15, 400, "verde", 'A', 100);
        electrodomesticos[8] = new Televisor(60, true, 200, "naranja",  'C', 30 );
        electrodomesticos[9] = new Electrodomestico(50, 10);
        
        for (int i = 0; i < electrodomesticos.length; i++) {
               System.out.println("electrodomestico["+i+"]:" + electrodomesticos[i].toString() + "precio final: " + electrodomesticos[i].precioFinal() );
        }

    }
    
    

}
