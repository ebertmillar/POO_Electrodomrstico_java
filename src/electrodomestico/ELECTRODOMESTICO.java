/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package electrodomestico;

/**
 *
 * @author Ebert
 */
public class Electrodomestico {

    final static String[] COLORES_DISPONIBLES = {"blanco", "negro", "rojo", "azul", "gris"};
    final static String COLOR = "BLANCO";
    final static char CONSUMO_ENERGETICO = 'F';
    final static double PRECIO_BASE = 100;
    final static double PESO = 5;
    private double precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    private String[] coloresDisponibles;

    /**
     * constructor por defecto sin parametros
     */
    public Electrodomestico() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;

    }

    /**
     * construcotr solo con dos paramentros
     *
     * @param precioBase
     * @param peso
     */
    public Electrodomestico(int precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
    }

    /**
     * constructor con todos los parametros
     *
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;

    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String[] getColoresDisponibles() {
        return coloresDisponibles;
    }

    public void setColoresDisponibles(String[] coloresDisponibles) {
        this.coloresDisponibles = coloresDisponibles;
    }

    public void comprobarConsumoEnergetico(char letra) {

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            this.consumoEnergetico = letra;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO;
        }
    }

    public void comprobarColor(String color) {

        for (int i = 0; i < COLORES_DISPONIBLES.length; i++) {

            if (color.equalsIgnoreCase(COLORES_DISPONIBLES[i])) {
                this.color = color;
            } else {
                this.color = COLOR;
            }
        }
    }

    public void precioFinal() {

        double precio_base=0;
        
        switch (consumoEnergetico) {
            case 'A':
                precio_base = 100;
                precioTamañoConsumo(precio_base);
                break;
            case 'B':
                precio_base = 80;
                precioTamañoConsumo(precio_base);
                break;
            case 'C':
                precio_base = 60;
                precioTamañoConsumo(precio_base);
                break;
            case 'D':
                precio_base = 50;
                precioTamañoConsumo(precio_base);

                break;
            case 'E':
                precio_base = 30;
                precioTamañoConsumo(precio_base);

                break;
            case 'F':
                precio_base = 10;
                precioTamañoConsumo(precio_base);

                break;

            default:
                throw new AssertionError();
        }

    }

    /**
     * metodo aumenta el precio base segun el peso
     * @param precio_base 
     */
    void precioTamañoConsumo(double precio_base) {
        if (peso >= 0 && peso < 19) {
            precio_base += 10;
        } else if (peso >= 20 && peso < 49) {
            precio_base += 50;
        } else if (peso >= 50 && peso <= 79) {
            precio_base += 80;
        } else if (peso >= 80) {
            precio_base += 100;
        }
    }

}
