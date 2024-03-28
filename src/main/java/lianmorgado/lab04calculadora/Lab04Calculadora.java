/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package lianmorgado.lab04calculadora;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lianm
 */
public class Lab04Calculadora {

    public static Scanner leer;
    
    public static void main(String[] args) {
        leer = new Scanner(System.in);
        MostrarMenu();
    }
    
    public static void MostrarMenu()
    {
        boolean seguir = true;
        while (seguir){
            System.out.println("1.........Sumar dos numeros");
            System.out.println("2.........Resta dos numeros");
            System.out.println("3.........Multiplicacion de dos numeros");
            System.out.println("4.........Division de dos numeros");
            System.out.println("5.........Salir");
            int opcion = ObtenerOpcion();
            seguir = EjecutarOpcion(opcion);
        }
    }
    
    public static int ObtenerOpcion()
    {
        boolean continuar = true;
        int opcion = 0;
        
        while (continuar)
        {
            //Se valida que el ingreso de la opcion sea un numero entero y que
            //este en el rango de las opciones.
            try
            {
                continuar = false;
                opcion = leer.nextInt();
                while (opcion < 1 || opcion > 5)
                {
                    System.out.println("ERROR: ingrese una opcion valida");
                    opcion = leer.nextInt();
                }
            }
            catch (InputMismatchException ex) 
            {
                continuar = true;
                leer.next();
                System.out.println("ERROR: ingrese un numero entero.");
            }
        }
        return opcion;
    }
    
    //Metodo para ejecutar las opciones, se retorna un verdadero o falso para continuar el programa.
    public static boolean EjecutarOpcion(int opcion)
    {
        Calculadora calculadora = new Calculadora();
        boolean continuar = true;
        switch (opcion)
        {
            case 1:
                System.out.println("LA SUMA DE LOS NUMEROS ES: " + calculadora.Sumar());
                break;
            case 2:
                System.out.println("LA RESTA DE LOS NUMEROS ES: " + calculadora.Resta());
                break;
            case 3:
                System.out.println("LA MULTIPLICACION DE LOS NUMEROS ES: " + calculadora.Multiplicacion());
                break;
            case 4:
                System.out.println("LA DIVISION DE LOS NUMEROS ES: " + calculadora.Division());
                break;
            case 5:
                System.out.println("Saliendo del programa...");
                continuar = false;
                break;
        }
        return continuar;
    }
}
