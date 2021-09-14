/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico.pkg5;

/**
 *
 * @author Maxi Ybañez
 */
public class Practico5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Arreglo array = new Arreglo();
        int[ ] edad = new int[5];
        edad[0]= 5;
        edad[1]= 8;
        edad[2]= 50;      
        edad[3]= 35;
        edad[4]= 20;
        int[][] edad2 = new int[4][5];
        edad2[0][0]= 5;
        edad2[0][1]= 8;
        edad2[0][2]= 50;      
        edad2[0][3]= 35;
        edad2[0][4]= 20;
        edad2[1][0]= 29;
        edad2[1][1]= 40;
        edad2[1][2]= 31;
        edad2[1][3]= 70;
        
        
        array.sumarLista(edad);
        int mayor= array.buscarMayor(edad2);
        System.out.println("El mayor es: "+mayor);
        
        int cantidad=array.cuentaVocales("maximiliano");
        System.out.println("La cantidad de vocales del string son "+cantidad);
        
        int cantiCaracter=array.cuentaCarecter("maximiliano", 'i');
        System.out.println("La cantidad de vocales del string son "+cantiCaracter);
    }
    
}
