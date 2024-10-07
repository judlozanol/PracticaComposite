
package practica_compositei;

/**
 *CLase que sirve como cliente ademas de la salida en el patron Composite
 * @author jorge malaver
 */

import Component.ProductoAbstracto;

import java.awt.EventQueue;
import vista.VistaComposite;
public class Practica_compositeI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VistaComposite frame = new VistaComposite();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
    	/*
        // TODO code application logic here
    	
    	
        //productos simples
        
      ProductoSimple ram4 =new ProductoSimple("Memoria 4GB", 23000, "Kisnton");
      ProductoSimple ram8 =new ProductoSimple("Memoria 8GB", 46000, "Kisnton");
      
      ProductoSimple disco1 =new ProductoSimple("Disco duro 512MG", 520000, "Kisnton");
      ProductoSimple disco2 =new ProductoSimple("Disco diro 1TB", 680000, "Kisnton");
      
      ProductoSimple intel = new ProductoSimple("Procesador Intel 17", 300000, "Intel");
      
      // productos compuestos
      ProductosCompuestos Compersonal = new ProductosCompuestos("VALOR COMPUTADOR");
      ProductosCompuestos Compoficina = new ProductosCompuestos("VALOR COMPUTADOR");
      
      // computdora personal de ram 4 y disco de 512  y procesador Intel(paquetes)
      Compersonal.SumProductos(ram4);
      Compersonal.SumProductos(disco1);
      Compersonal.SumProductos(intel);
      
      Compoficina.SumProductos(ram8);
      Compoficina.SumProductos(disco2);
      Compoficina.SumProductos(intel);
      
      // paquete compuesto varios simples
      
      ProductosCompuestos Compcompleto = new ProductosCompuestos("VALOR COMPUTADOR");
      Compcompleto.SumProductos(Compersonal);
      Compersonal.SumProductos(Compoficina);
      
     Salida sal = new Salida(1 , "Sonia Jaramillo"); //setear el número de pedido y el nombre del cliente
    
     //adicionar productos al pedido
     sal.adicionProductos(ram4);
     sal.adicionProductos(disco1);
     sal.adicionProductos(intel);
   
     sal.imprimir(); //imprimir el recibo del pedido
     
     Salida sal1= new Salida(2, "Universidad Distrtital");//setear el número de pedido y el nombre del cliente
     
     //adicionar productos al pedido
     sal1.adicionProductos(ram8);
     sal1.adicionProductos(disco2);
     sal1.adicionProductos(intel);
   
     sal1.imprimir(); //imprimir el recibo del pedido
      
     */
    }
    
}
