/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package examen_final;

import javax.swing.JOptionPane;

/**
 *
 * @author David Gomez, Gabriel Brilla, Gerald Blanco, Alexander Torres
 */
public class Examen_Final_Estructura_Datos_Java {

    public static void main(String[] args) {
        ListaCircular listaCircular = new ListaCircular();
        Cola cola = new Cola();

        int loop = 0;
        while (loop == 0) {
            int mainMenu = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite el numero de la accion que desea realizar:\n\n"
                    + "1- Comprar boletos \n"
                    + "2- Observar la cola \n"
                    + "3- Extraer el primero en la cola \n"
                    + "4- Mostrar lista de finalizados \n"
                    + "5- Ingresar maletas \n"
                    + "6- Observar la lista de las maletas \n"
                    + "7- Salir \n\n"));
            switch (mainMenu) {
                case 1:
                    cola.add(new Cliente(JOptionPane.showInputDialog("Ingrese el nombre del cliente: "),
                    JOptionPane.showInputDialog("Ingrese el apellido del cliente: "),
                    JOptionPane.showInputDialog("Ingrese la cedula del ciente: "),
                    JOptionPane.showInputDialog("Ingrese el correo del cliente: "),
                    JOptionPane.showInputDialog("Ingrese el número de telefono del cliente: "),
                    JOptionPane.showInputDialog("Ingrese la edad del cliente: "),
                    JOptionPane.showInputDialog("Ingrese el número de vuelo del cliente: ")));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,cola);
                    break;
                case 3:
                    cola.atiende();
                    JOptionPane.showMessageDialog(null,"Se ha atendido al " +
                        "primero en la fila");
                    break;
                case 4:
                    cola.mostrarAtendidos();
                    break;
                case 5:
                    int largo = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite largo de la maleta:"));
                    int ancho = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite el ancho de la maleta:"));
                    int fondo = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite el fondo de la maleta:"));
                    int peso = Integer.parseInt(JOptionPane.showInputDialog(
                            "Digite el peso de la maleta:"));
                    listaCircular.insertar(new Maleta(largo, ancho, fondo, peso));

                    JOptionPane.showMessageDialog(null, "Maleta agregada a la lista con exito!");

                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Lista de Maletas: \n" + listaCircular);
                    break;
                case 7:
                    loop = 1;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Valor Incorrecto");
                    break;
            }
        }
        System.exit(0);
    }
}
