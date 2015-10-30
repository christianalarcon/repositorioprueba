/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion1;

import java.util.Scanner;

/**
 *
 * @author CAD08
 */
public class SumaDesarrollo {
    
    
    public void sumar()
    {
    Scanner entrada=new Scanner(System.in);
    
    int valor1=entrada.nextInt();
    int valor2=entrada.nextInt();
    
    int suma= valor1+valor2;
    
    System.out.println("La suma es: "+suma);
    }
    
    
}
