package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ProductosConcretos.ProductoSimple;
import ProductosConcretos.Salida;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaComposite extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldNombre;
	private JTextField textFieldPrecio;
	private JTextField textFieldMarca;
	private JLabel txtNombre;
	private JLabel txtOrden;
	
	private Salida salida;
	private long orden;

	/**
	 * Create the frame.
	 */
	public VistaComposite() {
		orden=0;
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 0, 0));
		panel_1.setBounds(10, 11, 414, 239);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBounds(116, 11, 170, 53);
		panel_1.add(panel_2);
		panel_2.setLayout(new GridLayout(1, 0, 0, 0));
		
		JLabel lblNewLabel = new JLabel("ComponentesParaTi");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Yu Gothic Light", Font.BOLD, 17));
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cliente:");
		lblNewLabel_1.setBounds(10, 78, 42, 14);
		panel_1.add(lblNewLabel_1);
		
		txtNombre = new JLabel("");
		txtNombre.setBounds(55, 78, 170, 14);
		panel_1.add(txtNombre);
		
		JLabel lblNewLabel_1_2 = new JLabel("Orden:");
		lblNewLabel_1_2.setBounds(244, 78, 42, 14);
		panel_1.add(lblNewLabel_1_2);
		
		txtOrden = new JLabel("");
		txtOrden.setBounds(290, 78, 42, 14);
		panel_1.add(txtOrden);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(104, 103, 300, 20);
		panel_1.add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(104, 145, 300, 20);
		textFieldPrecio.setText("10000");
		panel_1.add(textFieldPrecio);
		
		textFieldMarca = new JTextField();
		textFieldMarca.setColumns(10);
		textFieldMarca.setBounds(104, 190, 300, 20);
		panel_1.add(textFieldMarca);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(38, 106, 46, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Precio");
		lblNewLabel_2_1.setBounds(38, 148, 46, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Marca");
		lblNewLabel_2_1_1.setBounds(38, 193, 46, 14);
		panel_1.add(lblNewLabel_2_1_1);
		
		cambiarSalida();
		
		JButton btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProductoSimple producto = new ProductoSimple(textFieldNombre.getText()
															, Integer.parseInt(textFieldPrecio.getText())
															, textFieldMarca.getText());
				salida.adicionProductos(producto);
				JOptionPane.showMessageDialog(null, "El Producto se Añadio con Exito!");

			}
		});
		btnAgregarProducto.setBounds(104, 216, 201, 23);
		panel_1.add(btnAgregarProducto);
		
		JButton btnPagar = new JButton("Pagar");
		btnPagar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, salida.imprimir(), "Pagando",JOptionPane.INFORMATION_MESSAGE );
				cambiarSalida();
			}
		});
		btnPagar.setBounds(315, 216, 89, 23);
		panel_1.add(btnPagar);
		
		
	}
	
	private void cambiarSalida() {
		orden += 1;
		String cliente = JOptionPane.showInputDialog("Digite el nombre del cliente");
		salida = new Salida(orden,cliente);
		txtNombre.setText(salida.getcliente());
		txtOrden.setText(String.valueOf(salida.getorden()));
	}
}


