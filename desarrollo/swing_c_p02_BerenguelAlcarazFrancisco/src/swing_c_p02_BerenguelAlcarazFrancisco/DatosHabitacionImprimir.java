/**
 * DatosHabitacion.java
 * 1 dic. 2020 12:32:44
 */
package swing_c_p02_BerenguelAlcarazFrancisco;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosHabitacionImprimir.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class DatosHabitacionImprimir extends JPanel{
	
	/** The habitacion. */
	private JLabel habitacion = new JLabel("Tipo de Habitacion");
	
	/** The num habita. */
	private JLabel numHabita = new JLabel("Numero de Habitaciones");
	
	/** The importe. */
	private JLabel importe = new JLabel("Importe");
	
	/** The importe calculo. */
	private JLabel importeCalculo =new JLabel();
	
	
	/** The tipo habitacion. */
	private JLabel tipoHabitacion = new JLabel();
	
	/** The num habitaciones. */
	private JLabel numHabitaciones = new JLabel();
	
	/** The ninyos. */
	private JLabel ninyos = new JLabel();
	
	/** The edad ninyo. */
	private JLabel edadNinyo = new JLabel();
	
	/** The edad. */
	private JLabel edad = new JLabel("Edad Niños");
	
	/** The extra. */
	private JLabel extra = new JLabel("Extra");
	
	/** The extra tipo. */
	private JLabel extraTipo =new JLabel();
	
	
	
	/**
	 * Instantiates a new datos habitacion imprimir.
	 */
	public DatosHabitacionImprimir() {
		this.setLayout(null);
		
		Color c = new Color(76,189,224);
		this.setBackground(c);
		
		habitacion.setBounds(100,10,150,30);
		tipoHabitacion.setBounds(250,10,200,30);
		tipoHabitacion.setText(DatosHabitacion.tipoHabitacion.getSelectedItem().toString());
		
		numHabita.setBounds(100,50,150,30);
		numHabitaciones.setBounds(250,50,150,30);
		numHabitaciones.setText(DatosHabitacion.numHabitaciones.getValue().toString());
		
		
		ninyos.setBounds(100,90,100,30);
		ninyos.setText(DatosHabitacion.ninyos.isSelected()? "Niños:\t Si":"Niños: No");
		
		importe.setBounds(100,130,100,30);
		importeCalculo.setText(DatosHabitacion.importeCalculo.getText());
		importeCalculo.setBounds(180,130,100,30);
		
		edad.setBounds(100,170,150,30);
		extra.setBounds(100,210,150,30);
		edadNinyo.setBounds(250,170,150,30);
		extraTipo.setBounds(250,210,150,30);
		if(DatosHabitacion.ninyos.isSelected()){
			edadNinyo.setText(String.valueOf(DatosHabitacion.edadNinyo.getValue()));
			extraTipo.setText(DatosHabitacion.extraTipo.getText());
			this.add(edad);
			this.add(edadNinyo);
			this.add(extra);
			this.add(extraTipo);
		}
		
		
		this.add(habitacion);
		this.add(tipoHabitacion);
		this.add(numHabita);
		this.add(numHabitaciones);
		this.add(ninyos);
		this.add(importe);
		this.add(importeCalculo);
		
		
		
	}





}
