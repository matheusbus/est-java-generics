/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplos;

/**
 *
 * @author Matheus
 */
public class CaixaComGenerics<T> {
    
    private T coisa;
    
    public void guardar(T coisa){
        this.coisa = coisa;
    }
    
    public T abrir(){
        return this.coisa;
    }
    
    
}
