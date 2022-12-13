/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package examen_final;

import javax.swing.JOptionPane;

/**
 *
 * @author dagove47
 */
public class Examen_Final_Estructura_Datos_Java {

    public static void main(String[] args) {
        //        Cola cola = new Cola();
        int loop = 0;
        while(loop == 0) {
            int mainMenu = Integer.parseInt(JOptionPane.showInputDialog(
                "Digite el numero de la accion que desea realizar:\n\n" +
                "0- Salir \n" +
                "1- S \n" +
                "2- B \n" +
                "3- V \n\n"));
            switch(mainMenu) {
                case 0:
                    
                    break;
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
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
