/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author Matheus
 */
public class CaixaSemGenerics {
    
    private Object coisa;
    
    public void guardar(Object coisa){
        this.coisa = coisa;
    }
    
    public Object pegar(){
        return this.coisa;
    }
    
}
