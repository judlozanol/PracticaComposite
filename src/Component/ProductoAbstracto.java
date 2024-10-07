/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

/**
 * Clase abstracta que sirve como la parte componente del patron Composite
 * @author Sergio Sanchez
 * 
 */

public abstract class ProductoAbstracto {
    
    String nombre;
    double precio;
    
    public ProductoAbstracto(String nom, double pres){
        
        super();
        this.nombre=nom;
        this.precio=pres;
    }
    
    public String getnombre(){
        
        return nombre; //retorna el nombre del producto
    }
    
    public void setnombre( String nom){
        
        this.nombre=nom; //cambia el nombre del producto
    }
    
    public double getprecio(){
        
        return precio; //retorna el precio del producto
    }
    
    public void setprecio(double pres){
        
        this.precio=pres; //cambia el precio del producto
    }
}// fin de la clase definie las caracteristicas del producto
