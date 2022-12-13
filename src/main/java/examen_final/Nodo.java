package examen_final;

public class Nodo {
    private Cliente dato;
    private Nodo next;
    private Nodo back;

    @Override
    public String toString(){
        return "Nodo{"+"dato="+dato+'}';
    }

    public Nodo(){
    }
    public Nodo(Cliente dato){
        this.dato=dato;
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
    public Nodo getBack() {
        return back;
    }

    public void setBack(Nodo back) {
        this.back = back;
    }
}
