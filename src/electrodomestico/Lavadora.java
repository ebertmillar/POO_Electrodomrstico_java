/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author Ebert
 */
public class Lavadora extends Electrodomestico {

    final static double CARGA_DEF = 5;
    private double carga;

    public Lavadora() {
        this.carga = CARGA_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.color = COLOR;
        this.peso = PESO;
        this.precioBase = PRECIO_BASE;
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.carga = CARGA_DEF;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.color = COLOR;
    }

    public Lavadora(double carga, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    public double precioFinal() {
        
        double precio_base = super.precioFinal();
        
        if (carga > 30) {
            precio_base += 50;
        }
        
        return precio_base;
    }
    
    
    

}
