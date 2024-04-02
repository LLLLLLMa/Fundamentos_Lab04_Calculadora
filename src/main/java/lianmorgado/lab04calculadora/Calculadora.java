/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lianmorgado.lab04calculadora;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author lianm
 */
public class Calculadora {
    private int num1;
    private int num2;
    private Scanner leer;

    public Calculadora() {
        leer = new Scanner(System.in);
    }

    //metodos getter y setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    //fin getter y setter
    
    public int Sumar()
    {
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el primer numero");
        this.num1 = GenerarNumeroValido(0);
        
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el segundo numero");
        this.num2 = GenerarNumeroValido(0);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 0
        // para asegurar un numero entero positivo.
        this.ValidarIguales(0);
        
        //Se retorna la operacion solicitada
        return this.num1 + this.num2;
    }
    
    public int Resta()
    {
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el primer numero");
        this.num1 = GenerarNumeroValido(0);
        
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el segundo numero");
        this.num2 = GenerarNumeroValido(0);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 0
        // para asegurar un numero entero positivo.
        this.ValidarIguales(0);
        
        //Se retorna la operacion solicitada
        return this.num1 - this.num2;
    }
    
    public int Multiplicacion()
    {
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el primer numero");
        this.num1 = GenerarNumeroValido(0);
        
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el segundo numero");
        this.num2 = GenerarNumeroValido(0);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 0
        // para asegurar un numero entero positivo.
        this.ValidarIguales(0);
        
        //Se retorna la operacion solicitada
        return this.num1 * this.num2;
    }
    
    public float Division()
    {
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el primer numero");
        this.num1 = GenerarNumeroValido(0);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 1
        // ya que no se puede dividir por 0.
        System.out.println("Ingrese el segundo numero");
        this.num2 = GenerarNumeroValido(1);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 1
        // ya que no se puede dividir por 0.
        this.ValidarIguales(1);
        
        //Se retorna la operacion solicitada
        return (float) this.num1 / (float) this.num2;
    }
    
    public int Resto()
    {
        // Se pide el numero con un valor minimo de 0 para que sea un entero positivo.
        System.out.println("Ingrese el primer numero");
        this.num1 = GenerarNumeroValido(0);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 1
        // ya que no se puede dividir por 0.
        System.out.println("Ingrese el segundo numero");
        this.num2 = GenerarNumeroValido(1);
        
        // Se valida que ambos numeros no sean iguales con un valor minimo de 1
        // ya que no se puede dividir por 0.
        this.ValidarIguales(1);
        
        //Se retorna la operacion solicitada
        return this.num1 % this.num2;
    }
    
    private void ValidarIguales(int min)
    {
        while (this.num1 == this.num2)
        {
            System.out.println("ERROR: los numeros no pueden ser iguales");
            System.out.println("Vuelva a ingresar el segundo numero, no puede ser menor o igual a " + (min-1));
            this.num2 = GenerarNumeroValido(min);
        }
    }
    
    private int GenerarNumeroValido(int min)
    {
        System.out.println("Ingrese un numero entero y mayor o igual que " + min);
        int num = 0;
        boolean continuar = true;
        while (continuar)
        {
            try
            {
                continuar = false;
                num = leer.nextInt();
                while (num < min)
                {
                    System.out.println("ERROR: el numero ingresado no puede ser menor a " + min);
                    System.out.println("Vuelva a ingresar el numero" + min);
                    num = leer.nextInt();
                }
            }
            catch (InputMismatchException ex)
            {
                continuar = true;
                leer.next();
                System.out.println("ERROR: ingrese un numero entero");
            }
        }
        return num;
    }
}
