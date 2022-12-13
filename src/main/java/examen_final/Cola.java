package examen_final;

import javax.swing.JOptionPane;

public class Cola {

    ListaA lista = new ListaA();
    private Nodo frente;
    private Nodo ultimo;
    private Cliente atendido;

    public Cola() {
    }

    public void add(Cliente c) {
        Nodo newnodo = new Nodo(c);
        if (frente == null) {
            frente = newnodo;
            ultimo = newnodo;
        } else {
            ultimo.setBack(newnodo);
            ultimo = newnodo;
        }
    }

    public Nodo atiende() {
        Nodo aux = frente;
        atendido = frente.getDato();
        lista.inserta(atendido);
        if (frente != null) {
            frente = frente.getBack();
            aux.setBack(null);
        }
        
        return aux;
    }
    
    public void mostrarAtendidos(){
        JOptionPane.showMessageDialog(null,"Lista de atendidos: \n" + lista);
    }

    @Override
    public String toString() {
        String s = "";
        int x = 1;
        Nodo aux = frente;
        while (aux != null) {
            s += x + " - " + aux + "\n";
            aux = aux.getBack();
            x++;
        }
        return s;
    }
}
