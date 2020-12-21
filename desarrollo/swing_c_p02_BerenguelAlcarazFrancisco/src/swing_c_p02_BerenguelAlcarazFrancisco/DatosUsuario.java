/**
 * DatosUsuario.java
 * 1 dic. 2020 9:40:57
 */
package swing_c_p02_BerenguelAlcarazFrancisco;


import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.time.temporal.ChronoUnit.DAYS;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.toedter.calendar.JCalendar;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosUsuario.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class DatosUsuario extends JPanel implements PropertyChangeListener{
	
	
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
	static JTextField nombreTexto =new JTextField();
	
	/** The apellido texto. */
	static JTextField apellidoTexto =new JTextField();
	
	/** The dni texto. */
	static JTextField dniTexto =new JTextField();
	
	/** The telefono texto. */
	static JTextField telefonoTexto =new JTextField();
	
	/** The num dias extancia texto. */
	static JTextField numDiasExtanciaTexto =new JTextField();
	
	/** The fecha entrada calendar. */
	private JCalendar fechaEntradaCalendar  = new JCalendar();
	
	/** The fecha salida calendar. */
	private JCalendar fechaSalidaCalendar = new JCalendar();
	
	/** The dia de entrada. */
	static String diaDeEntrada ="";
	
	/** The dia de salida. */
	static String diaDeSalida ="";
	
	/**
	 * Instantiates a new datos usuario.
	 */
	public DatosUsuario() {
		
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
		fechaEntradaCalendar.setBounds(250,170,200,200);
		
		
		fechaSalida.setBounds(600,170,100,30);
		fechaSalidaCalendar.setBounds(750,170,200,200);
		
		numDiasEstancia.setBounds(100,400,150,30);
		numDiasExtanciaTexto.setBounds(250,400,300,30);
		
		/*FECHAS*/
		numDiasExtanciaTexto.setEditable(false);
		numDiasExtanciaTexto.setEnabled(false);
		numDiasExtanciaTexto.setBackground(Color.WHITE);
		
		fechaEntradaCalendar.setMinSelectableDate(new Date());
		
		/*Obtener fecha de entrada*/		
		Calendar calendario = new GregorianCalendar(
				fechaEntradaCalendar.getDate().getYear()+1900,
				fechaEntradaCalendar.getDate().getMonth(),
				fechaEntradaCalendar.getDate().getDay()+7);
		
		/*Cambiar fecha de salida*/
		fechaSalidaCalendar.setDate(calendario.getTime());
		
		/*Ajustar fecha minima de salida*/
		Date fechaMinSalida = new Date();
		fechaMinSalida.setYear(fechaEntradaCalendar.getDate().getYear());
		fechaMinSalida.setMonth(fechaEntradaCalendar.getDate().getMonth());
		fechaMinSalida.setDate(fechaEntradaCalendar.getDate().getDay()+7);
		
		/*Poner Fecha minima de salida*/
		fechaSalidaCalendar.setMinSelectableDate(fechaMinSalida);

		numDiasExtanciaTexto.setText("1");
		
		/*Acciones del JCalendar*/
		fechaSalidaCalendar.addPropertyChangeListener(this);
		fechaEntradaCalendar.addPropertyChangeListener(this);
		
		diaDeEntrada = fechaEntradaCalendar.getDate().toString();
		diaDeSalida = fechaSalidaCalendar.getDate().toString();
		
		telefonoTexto.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e) {
				if (telefonoTexto.getText().length() >= 9 )
	                   e.consume();
				if((e.getKeyChar()<'0' || e.getKeyChar()>'9')) 
					e.consume();
			}
		});
		
		dniTexto.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e) {
				
				if (dniTexto.getText().length() > 9 ) {
					e.consume();
				}
				if(dniTexto.getText().length()<8)
					if((e.getKeyChar()<'0' || e.getKeyChar()>'9')) 
						e.consume();
				
			}
		});
		
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

		this.add(fechaEntradaCalendar);
		this.add(fechaSalidaCalendar);
		this.add(numDiasExtanciaTexto);
		
	}


	/**
	 * Property change.
	 *
	 * @param evt the evt
	 */
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		if(evt.getSource() == fechaSalidaCalendar || evt.getSource() == fechaEntradaCalendar) {
		
			
			System.out.println(fechaSalidaCalendar.getDate());
			String[] datosInicio = fechaEntradaCalendar.getDate().toString().split(" ");
			String[] datosFin = fechaSalidaCalendar.getDate().toString().split(" ");
			
			int anyoInicio, mesInicio, diaInicio;
			int anyoFin, mesFin, diaFin;
			
			
			anyoInicio = Integer.parseInt(datosInicio[5]);
			mesInicio = fechaEntradaCalendar.getDate().getMonth()+1;
			diaInicio = Integer.parseInt(datosInicio[2]);
			

			
			anyoFin = Integer.parseInt(datosFin[5]);
			mesFin = fechaEntradaCalendar.getDate().getMonth()+1;
			diaFin = Integer.parseInt(datosFin[2]);
			
			
	        LocalDate inicio = LocalDate.of(anyoInicio, mesInicio, diaInicio); // 1 de enero 2019
	        LocalDate fin = LocalDate.of(anyoFin, mesFin, diaFin);// 1 de enero 2020
	        
	        
	        long dias = DAYS.between(inicio, fin);
	       
	        if(dias<=0) {
	        	 numDiasExtanciaTexto.setText("ERROR - NO PUEDE SALIR ANTES DE ENTRAR");
	        }else {
	        	 numDiasExtanciaTexto.setText(String.valueOf(dias));
	        	 DatosHabitacion.calculoImporteHabitacion();
	        }
	    			
		}
	
	}
	

}
