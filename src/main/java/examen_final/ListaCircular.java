/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_final;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class ListaCircular {
    private Nodo2 cabeza;
    private Nodo2 ultimo;

    public void insertar(Maleta p) {
        int sum = p.getLargo() + p.getAncho() + p.getFondo();
        System.out.println("TOTAL SUMA: " + sum);
        if (cabeza == null) {
            cabeza = new Nodo2(p);
            ultimo = cabeza;
        } else if (sum % 2 != 0) {
            ultimo.setNext(new Nodo2(p));
            ultimo = ultimo.getNext();
        } else {
            Nodo2 aux = cabeza;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            Nodo2 temp = new Nodo2(p);
            temp.setNext(aux.getNext());
            temp.setBack(aux);
            aux.setNext(temp);
            temp.getNext().setBack(temp); //nuevo
        }
        ultimo.setNext(cabeza);
        cabeza.setBack(ultimo);
    }

    @Override
    public String toString() {
        Nodo2 aux = cabeza;
        String s = "";
        if (aux != null) {
            s += aux + "\n";
            aux = aux.getNext();
            while (aux != cabeza) {
                s += aux + "\n" ;
                aux = aux.getNext();
            }
        } else {
            s += "vacia";
        }
        return s;
    }
}
