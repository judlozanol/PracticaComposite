
package ProductosConcretos;

/**
 * Clase que sirve como el cliente en el patron Composite
 * @author jorge malaver
 */

// agrega productos para la venta

import Component.ProductoAbstracto;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import Component.ProductoAbstracto;
public class Salida {
    private long ordenI;
    private String Cliente;
    //private Calendar fecha;
    //private List productos = new ArrayList();
    
    private List< ProductoAbstracto > productos =new ArrayList<ProductoAbstracto>(); //arraylist de los productos abstractos
    
    public Salida(long orden, String cliente){
        super();
        this.ordenI=orden;
        this.Cliente=cliente;
    }
    
    public long getorden(){
        
        return ordenI;// retornar el número de la orden
        
    }
    
    public void  setorden(long orden){
        
        this.ordenI=orden; // cambiar el número de la orden
    }
    
    public String getcliente(){
    	
        return Cliente; //retornar el cliente
    }
    
    public void setcliente(String cliente){
    	
        this.Cliente=cliente; //cambiar el cliente
    }
    
    public List getproductos(){
        
        return productos; //retornar la lista de productos
    }
    
    public void setproductos(List productos){
        
        this.productos=productos; //cambiar la lista de productos
    }
    
    public double getprecio(){
         double pres=0;
        for(ProductoAbstracto sum : productos){ 
          pres += sum.getprecio(); //sumar el precio de los productos(hojas)
         }
         return pres; //retornar el precio total
    }
    
    public void adicionProductos(ProductoAbstracto produ){
       
        productos.add(produ); //añadir producto a la lista
    }
    
    
      public void eliminarProductos(ProductoAbstracto produ){
       
        productos.add(produ); //quitar el producto de la lista
    }   
     /*
      * Metodo que imprime en consola el recibo
      * el recibo contiene el cliente, los productos y sus respectivos precios
      * finalizando, retorna el precio total a pagar
      */
     public String imprimir(){
    	 NumberFormat formato= new DecimalFormat("####.00");
    	 String mensaje = "<html>Orden #";
    	 mensaje += String.valueOf(ordenI);
    	 mensaje += "<br>Cliente: ";
    	 mensaje += Cliente;
    	 mensaje += "<br>Productos:<br><ul>";
    	 for(ProductoAbstracto sum : productos){
    		 mensaje += "<li>";
             mensaje += sum.getnombre() + "......." + formato.format(sum.getprecio());
             mensaje += "</li>";
            } ;
         mensaje += "</ul>Total Compra : " + formato.format(getprecio()) + "</html>";
    	 return mensaje;
    	 /*
       NumberFormat formato= new DecimalFormat("####.00");
       System.out.println("\n====================================\nOrden........"  + ordenI);
       System.out.println("Cliente..." + Cliente );
       System.out.println("Productos..........." );
       for(ProductoAbstracto sum : productos){
          System.out.println(sum.getnombre() + "......." + formato.format(sum.getprecio()));
         } ;
         System.out.println();
       System.out.println("Total Compra   :" + formato.format(getprecio()));
       */
     }
        
}// fin lista
