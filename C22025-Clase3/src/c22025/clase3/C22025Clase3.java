/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c22025.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class C22025Clase3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        for (int i = 10; i >= 0; i--) {
            JOptionPane.showMessageDialog(null, "El valor de i es " + i);
        }*/
 /*
        int i=10;
        while (i>=0) {            
            JOptionPane.showMessageDialog(null, "El valor de i es " + i);
            i--;
        }*/
 /*
        String salida = "No";
        while (!salida.equals("Si")) {            
            salida=JOptionPane.showInputDialog("Digita Si para salir");
        }
        int i=1 , suma =0;
        while (i<10) {            
            suma +=i;
            ++i;
        }
        JOptionPane.showMessageDialog(null, suma);
         */
        // un while que no se ejecuta
        boolean variable = false;
        while (variable) {
            JOptionPane.showConfirmDialog(null, "Todos van tener un 1 punto asegurado en el quiz");
        }

        do {
            JOptionPane.showConfirmDialog(null, "Todos tiene que hacer quiz");
        } while (variable);

        int i = 10;

        do {
            JOptionPane.showMessageDialog(null, "La variable i "+ i);
            i--;
        } while (i>=0);
    }

}
