package Examen_Final_Estructura_Datos_Java.src.main.java.examen_final;

public class Cola {
    ListaA lista = new ListaA();
    private Nodo frente;
    private Nodo ultimo;

    public Cola() {
    }

    public void add(Cliente c){
        Nodo newnodo = new Nodo(c);
        if(frente == null){
            frente = newnodo;
            ultimo = newnodo;
        } else{
            ultimo.setBack(newnodo);
            ultimo=newnodo;
        }
    }

    public Nodo atiende(){
        Nodo aux = frente;
        lista.inserta(new Cliente(frente.getDato().getNombre(),frente.getDato().getApellido()
                ,frente.getDato().getCedula(),frente.getDato().getCorreo()
                ,frente.getDato().getTelefono(),frente.getDato().getEdad()
                ,frente.getDato().getNumeroV()));
        if (frente != null){
            frente = frente.getBack();

            aux.setBack(null);
        }

        return aux;
    }

    @Override
    public String toString() {
        String s = "";
        int x = 1;
        Nodo aux = frente;
        while (aux != null){
            s += aux + "\n";
            aux = aux.getBack();
        }
        return s;
    }
}

