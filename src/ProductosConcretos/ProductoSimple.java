
package ProductosConcretos;

/**
 * Clase que que sirve como el componente leaf del patron Composite
 * @author jorge malaver
 * 
 */
import Component.ProductoAbstracto;

public class ProductoSimple extends ProductoAbstracto{
    
    String marca;
    double precio;
    
    
    public ProductoSimple(String nom, double pres, String marca) {
        
    	super(nom, pres); 
        this.marca=marca;
        this.precio=pres;
    }
    @Override
    public double getprecio(){
    	
        return precio; //retornar el precio del producto simple
    }
            
    @Override
    public void setprecio(double pres){
        
        this.precio=pres; //cambiar el precio del prcuto simple
    }
    public String getMarca(){
    	
        return marca; //retornar la marca del producto simple
    }
    
    public void setMarca(String mar){
        
        this.marca=mar; //cambiar la marca del producto simple
    }
} // fin clase ProductoSimple se adiciona un nuevo atributo llamado marca
