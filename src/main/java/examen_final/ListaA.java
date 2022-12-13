package examen_final;

public class ListaA {
    private Nodo cabeza;

    public void inserta(Cliente p){
        if(cabeza==null){
            cabeza = new Nodo(p);
        }else if(cabeza.getNext()==null){
            cabeza.setNext(new Nodo(p));
        }else{
            Nodo aux = cabeza;
            while (aux.getNext() != null ){
                aux=aux.getNext();
            }
            Nodo temp = new Nodo(p);
            temp.setNext(aux.getNext());
            aux.setNext(temp);
        }
    }
    @Override
    public String toString() {
        Nodo aux = cabeza;
        String s = "";
        while (aux != null) {
            s += aux + ", \n";
            aux = aux.getNext();
        }
        return s;

    }
}
