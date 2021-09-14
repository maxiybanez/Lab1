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
public class Arreglo {

    public Arreglo() {
    }
    
    
    public static void sumarLista( int[]array){
        int suma=0;
        for(int i = 0; i < array.length; i++){
            suma+=array[i];
         }
        System.out.println("El promedio de la array es; "+(suma/array.length));
    }
    
    public static int buscarMayor(int[][]array){
        int mayor=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
               if(array[i][j]> mayor){
                   mayor = array[i][j]; 
               }
            }
        }
        return mayor;
    }

    public static int cuentaVocales(String string){
        int cantDeVocales=0;
        for(int x=0;x<string.length();x++) {
            if ((string.charAt(x)=='a') || (string.charAt(x)=='e') || (string.charAt(x)=='i') || (string.charAt(x)=='o') || (string.charAt(x)=='u')){ 
            cantDeVocales++;
         }
        }
        return cantDeVocales;
    }
    
    public static int cuentaCarecter (String string, char caracter){
        int cantDeCaracter=0;
        for(int x=0;x<string.length();x++) {
            if ((string.charAt(x)==caracter)){
                cantDeCaracter++;
            }
        }
        return cantDeCaracter;
    }
    
}

