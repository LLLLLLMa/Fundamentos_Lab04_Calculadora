/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lianmorgado.lab04calculadora;
import java.util.Scanner;
/**
 *
 * @author lianm
 */
public class PalabraRecursiva {
    private String palabra;
    private Scanner leer;
    
    public PalabraRecursiva()
    {
        leer = new Scanner(System.in);
    }
    
    private String FuncionRecursivaInvertir(int index)
    {
        String[] letras = this.palabra.split("");
        String palabraInvertida = letras[index];
        
        if (index == 0)
        {
            return letras[index];
        }
        
        palabraInvertida += FuncionRecursivaInvertir(index-1);
        return palabraInvertida;
    }
    
    public void RevisarPalabra()
    {
        System.out.println("Ingrese la palabra que quiere revisar: ");
        this.palabra = leer.next();
        String palabraInvertida = FuncionRecursivaInvertir(this.palabra.length()-1);
        if (palabraInvertida.toLowerCase().equals(this.palabra.toLowerCase()))
        {
            System.out.println("La palabra es palindrome");
        }
        else
        {
            System.out.println("La palabra no es palindrome");
        }
    }
}
