/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author Ebert
 */
public class Televisor extends Electrodomestico {

    final static int PULGADAS = 20;
    final static boolean SINTONIZA = false;
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
        this.resolucion = PULGADAS;
        this.sintonizador = SINTONIZA;
        super.color = COLOR;
        super.precioBase = PRECIO_BASE;
        super.consumoEnergetico = CONSUMO_ENERGETICO;
        super.peso = PESO;
    }

    public Televisor(double precioBase, double peso) {
        super(precioBase, peso);
        super.color = COLOR;
        super.consumoEnergetico = CONSUMO_ENERGETICO;
        this.resolucion = PULGADAS;
        this.sintonizador = SINTONIZA;

    }

    public Televisor(int resolucion, boolean sintonizador, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public double precioFinal() {

        boolean sintoniza = SINTONIZA;
        double precio_base = super.precioFinal();

        if (resolucion > 40 && !sintoniza) {
            precio_base += ((precio_base * 0.3) + 50);
        }
        if (resolucion > 40 && sintoniza) {
            precio_base += (precio_base * 0.3);
        }
        if (resolucion < 40 && !sintoniza) {
            precio_base += 50;
        }
        /*if (resolucion < 40 && sintoniza) {
            precio_base = super.precioFinal();
        }*/
        
        return precio_base;
    }

}
