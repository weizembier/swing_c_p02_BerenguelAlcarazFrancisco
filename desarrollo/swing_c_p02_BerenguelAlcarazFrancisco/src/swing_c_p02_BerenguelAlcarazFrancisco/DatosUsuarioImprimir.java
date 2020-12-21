/**
 * DatosUsuario.java
 * 1 dic. 2020 9:40:57
 */
package swing_c_p02_BerenguelAlcarazFrancisco;



import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;


// TODO: Auto-generated Javadoc
/**
 * The Class DatosUsuarioImprimir.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class DatosUsuarioImprimir extends JPanel{
	
	
	/** The nombre. */
	private JLabel nombre =new JLabel("Nombre");
	
	/** The apellidos. */
	private JLabel apellidos =new JLabel("Apelidos");
	
	/** The dni. */
	private JLabel dni =new JLabel("DNI");
	
	/** The telefono. */
	private JLabel telefono =new JLabel("Telefono");
	
	/** The fecha entrada. */
	private JLabel fechaEntrada  =new JLabel("Fecha De Entrada");
	
	/** The fecha salida. */
	private JLabel fechaSalida  =new JLabel("Fecha De Salida");
	
	/** The num dias estancia. */
	private JLabel numDiasEstancia  =new JLabel("Nº De Días De Estancia");

	
	/** The nombre texto. */
	private JLabel nombreTexto =new JLabel();
	
	/** The apellido texto. */
	private JLabel apellidoTexto =new JLabel();
	
	/** The dni texto. */
	private JLabel dniTexto =new JLabel();
	
	/** The telefono texto. */
	private JLabel telefonoTexto =new JLabel();
	
	/** The num dias extancia texto. */
	private JLabel numDiasExtanciaTexto =new JLabel();
	
	/** The fecha entrada usuario. */
	private JLabel fechaEntradaUsuario =new JLabel();
	
	/** The fecha salida usuario. */
	private JLabel fechaSalidaUsuario=new JLabel();
	
	
	/**
	 * Instantiates a new datos usuario imprimir.
	 */
	public DatosUsuarioImprimir() {
		
		this.setLayout(null);
	
		Color c = new Color(76,189,224);
		this.setBackground(c);
		
		nombre.setBounds(100,10,100,30);
		nombreTexto.setBounds(180,10,200,30);
		
		apellidos.setBounds(100,50,100,30);
		apellidoTexto.setBounds(180,50,200,30);
		
		dni.setBounds(100,90,100,30);
		dniTexto.setBounds(180,90,200,30);
		
		telefono.setBounds(100,130,100,30);
		telefonoTexto.setBounds(180,130,200,30);
		
		fechaEntrada.setBounds(100,170,100,30);
		fechaEntradaUsuario.setBounds(250,170,200,30);
		
		fechaSalida.setBounds(100,210,100,30);
		fechaSalidaUsuario.setBounds(250,210,200,30);
		
		numDiasEstancia.setBounds(100,250,150,30);
		numDiasExtanciaTexto.setBounds(250,250,200,30);
		
		nombreTexto.setText(DatosUsuario.nombreTexto.getText());
		apellidoTexto.setText(DatosUsuario.apellidoTexto.getText());
		dniTexto.setText(DatosUsuario.dniTexto.getText());
		telefonoTexto.setText(DatosUsuario.telefonoTexto.getText());
		numDiasExtanciaTexto.setText(DatosUsuario.numDiasExtanciaTexto.getText());
		fechaEntradaUsuario.setText(DatosUsuario.diaDeEntrada);
		fechaSalidaUsuario.setText(DatosUsuario.diaDeSalida);
		
		this.add(nombre);
		this.add(apellidos);
		this.add(dni);
		this.add(telefono);
		this.add(fechaEntrada);
		this.add(fechaSalida);
		this.add(numDiasEstancia);

		this.add(nombreTexto);
		this.add(apellidoTexto);
		this.add(dniTexto);
		this.add(telefonoTexto);
		this.add(fechaEntradaUsuario);
		this.add(fechaSalidaUsuario);

	
		this.add(numDiasExtanciaTexto);
		
	}


	
	

}
