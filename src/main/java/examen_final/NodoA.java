package examen_final;

public class NodoA {
    private Cliente dato;
    private Nodo next;

    public NodoA(){
    }

    public NodoA(Cliente dato) {
        this.dato = dato;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
