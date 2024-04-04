package EjerciciosClase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class ActividadEnClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingresa un número de 3 digitos");
        numero=lector.nextInt();
        
        int cifras = Integer.toString(numero).length();
        int suma = 0;
        if(cifras>2){
            for(int i = 0; i < cifras; i++){
                String num = String.valueOf(Integer.toString(numero).charAt(i));
                suma+=Integer.parseInt(num);}
            
            System.out.println("La suma es:" + suma);
        } else { System.out.println("Ingrese un número de 3 cifras");
        
        
        
        
        }
}


}