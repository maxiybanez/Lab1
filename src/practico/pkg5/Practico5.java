/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg5;

import javax.swing.JOptionPane;

/**
 *
 * @author Maxi Ybañez
 */
public class Practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         String[] menuComienzo = {"Si, Comenzar","No, Salir"};
        int seleccionM = JOptionPane.showOptionDialog(null, "Elija una opcion", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menuComienzo, menuComienzo[0]);
        switch(seleccionM){
           case 0: Arreglo array = new Arreglo();
                   int cantEdad= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de edades"));
                   int[] edad = new int[cantEdad];
                   for(int i=0;i<cantEdad;i++){
                       int edades= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una edad"));
                       edad[i]=edades;
                   }
                   int cantEdad2= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de edades"));
                   int cantEdad3= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de edades"));
                   int[][] edad2 = new int[cantEdad2][cantEdad3];
                   for(int j=0;j<cantEdad;j++){
                       for(int x=0;x<cantEdad;x++){
                         int edadArreglo2= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una edad"));
                         edad2[j][x]= edadArreglo2;
                       }
                   }
                   Arreglo array = new Arreglo();
                   int[] edad = new int[5];
                   
                   String[] menu2 = {"Buscar Mayor","Contar Vocales","Contar Caracteres","Salir"};
                   int seleccion2 = JOptionPane.showOptionDialog(null, "Elija una opcion", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, menu2, menu2[0]); 
                   switch(seleccion2){
                       case 0: array.sumarLista(edad);
                               int mayor= array.buscarMayor(edad2);
                               JOptionPane.showMessageDialog(null, "El mayor de la array es: "+ mayor);
                               break;
                       case 1: String nombre= JOptionPane.showInputDialog(null, "Ingrese una palabra");
                                int cantidad=array.cuentaVocales(nombre);
                                JOptionPane.showMessageDialog(null, "La cantidad de vocales de la palabra son: "+cantidad);
                                break;
                       case 2:  String palabra= JOptionPane.showInputDialog(null, "Ingrese una palabra");
                                String letra= JOptionPane.showInputDialog(null, "Ingrese un letra");
                                char letraChar = letra.charAt(0);
                                int cantiCaracter=array.cuentaCarecter(palabra, letraChar);
                                JOptionPane.showMessageDialog(null, "La cantidad de caracter "+letraChar+" es de "+cantiCaracter);
                                break;
                       case 3: break;
                    }
            case 1: break;
          }
    }
    
}
