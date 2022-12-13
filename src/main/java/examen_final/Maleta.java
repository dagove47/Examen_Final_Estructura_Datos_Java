/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Maleta {
    private int largo;
    private int ancho;
    private int fondo;
    private int peso;
    
    public Maleta(int largo, int ancho, int fondo, int peso){
        this.largo = largo;
        this.ancho = ancho;
        this.fondo = fondo;
        this.peso = peso;
    }
    
    public Maleta(){}

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    @Override
    public String toString(){
        return "Maleta{" + "largo="+largo+", ancho="+ancho+", fondo="+fondo+", peso="+peso+"}";
    }
}
