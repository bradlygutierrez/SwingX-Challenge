/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.Arrays;
import modelos.Numeros;


/**
 *
 * @author bradl
 */
public class DNumeros {
    Numeros num = new Numeros();
    int mayor = num.getNumeros()[0];
    int i = 0;
    
    public int calcularMayor(){
        do{
            int index= num.getNumeros()[i];
            if(mayor< index){
                mayor = index;
            }else{
                mayor = mayor;
            }
            i++; 
        }while(i < num.getNumeros().length);
    
        return mayor; 
    }
    
    public int calcularMenor(){
        int menor = num.getNumeros()[0];
        int i = 0;
        while(i < num.getNumeros().length){
            int b = num.getNumeros()[i];
            if(menor < b){
                menor = menor;
            }else{
                menor = b;
            }
            i++;
        }
        return menor;
    }
}
