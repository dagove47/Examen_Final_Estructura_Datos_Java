/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Nodo2 {
    private Maleta dato;
    private Nodo2 next;
    private Nodo2 back;
    
    @Override
    public String toString(){
        return dato.toString();
    }
    
    public Nodo2(Maleta dato){
        this.dato=dato;
    }

    public Maleta getDato() {
        return dato;
    }

    public void setDato(Maleta dato) {
        this.dato = dato;
    }

    public Nodo2 getNext() {
        return next;
    }

    public void setNext(Nodo2 next) {
        this.next = next;
    }

    public Nodo2 getBack() {
        return back;
    }

    public void setBack(Nodo2 back) {
        this.back = back;
    }
}
