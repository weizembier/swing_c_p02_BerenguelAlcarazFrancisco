/**
 * DatosHabitacion.java
 * 1 dic. 2020 12:32:44
 */
package swing_c_p02_BerenguelAlcarazFrancisco;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosHabitacion.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class DatosHabitacion extends JPanel  implements ChangeListener{
	
	/** The habitacion. */
	private JLabel habitacion = new JLabel("Tipo de Habitacion");
	
	/** The num habita. */
	private JLabel numHabita = new JLabel("Numero de Habitaciones");
	
	/** The importe. */
	private JLabel importe = new JLabel("Importe");
	
	/** The ejemplo imagen. */
	private JLabel ejemploImagen = new JLabel("Imagenes de las habitaciones");
	
	/** The importe calculo. */
	static JTextField importeCalculo =new JTextField();
	
	/** The tipo habitacion. */
	static JComboBox tipoHabitacion;
	
	/** The num habitaciones. */
	static JSpinner numHabitaciones;
	
	/** The ninyos. */
	static JCheckBox ninyos = new JCheckBox("¿Niños?");
	
	/** The edad ninyo. */
	static JSlider edadNinyo;
	
	/** The edad. */
	private JLabel edad = new JLabel("Edad Niños");
	
	/** The extra. */
	private JLabel extra = new JLabel("Extra");
	
	/** The extra tipo. */
	static JTextField extraTipo =new JTextField();
	
	/** The ninyos panel. */
	JPanel ninyosPanel = new JPanel();
	
	/** The imagenes. */
	JPanel imagenes = new JPanel();
	
	/** The fotos. */
	private JLabel fotos = new JLabel();
	
	/** The suite. */
	private JRadioButton simple,doble,suite;
	
	/** The bg. */
	private ButtonGroup bg =new ButtonGroup();
	
	/**
	 * Instantiates a new datos habitacion.
	 */
	public DatosHabitacion() {
		this.setLayout(null);
		
		Color c = new Color(76,189,224);
		this.setBackground(c);
		ninyosPanel.setBackground(c);
		imagenes.setBackground(c);
		
		
		
		String[] listaHabitacion ={"Simple", "Doble", "Suite"};
		tipoHabitacion= new JComboBox(listaHabitacion);
		
		numHabitaciones=new JSpinner(new SpinnerNumberModel (1,1,50,1));
		
		habitacion.setBounds(100,10,150,30);
		tipoHabitacion.setBounds(250,10,200,30);
		tipoHabitacion.setBackground(Color.WHITE);
		
		numHabita.setBounds(100,50,150,30);
		numHabitaciones.setBounds(250,50,150,30);
		
		
		ninyos.setBounds(100,90,100,30);
		
		importe.setBounds(100,130,100,30);
		importeCalculo.setBounds(180,130,100,30);
		
		ninyosPanel.setLayout(null);
		edadNinyo=new JSlider(0,14);
		edadNinyo.setPaintTicks(true); 
		edadNinyo.setMajorTickSpacing(2);
		edadNinyo.setMinorTickSpacing(4);
		edadNinyo.setPaintLabels(true); 
		
		edad.setBounds(100,10,150,30);
		edadNinyo.setBounds(250,10,300,50);
		
		extra.setBounds(100,60,150,30);
		extraTipo.setBounds(250,60,150,30);
		
		extraTipo.setEditable(false);
		extraTipo.setEnabled(false);
		extraTipo.setBackground(Color.WHITE);
		
		importeCalculo.setEditable(false);
		importeCalculo.setEnabled(false);
		importeCalculo.setBackground(Color.WHITE);
		
		ninyosPanel.add(edad);
		ninyosPanel.add(edadNinyo);
		ninyosPanel.add(extra);
		ninyosPanel.add(extraTipo);
		
		
		ninyosPanel.setBounds(500,10,650,150);
		ninyosPanel.setBorder(BorderFactory.createLineBorder(new Color(112,58,190), 2));
		extraTipo.setText("Cama Supletoria Pequeña");
		
		ninyos.addChangeListener(this);
		edadNinyo.addChangeListener(new ChangeListener() {
			   
			public void stateChanged(ChangeEvent arg0) {
				int n= edadNinyo.getValue();
				if(n>=0 && n<=3) {
					extraTipo.setText("Cuna");
					calculoImporteHabitacion();
				}
					
				if(n>=4 && n<=10) {
					extraTipo.setText("Cama Supletoria Pequeña");
					calculoImporteHabitacion();
				}
					
				if(n>=11 && n<=14) {
					extraTipo.setText("Cama Supletoria Normal");
					calculoImporteHabitacion();
				}	
			}
		});
		
		
		simple=new JRadioButton("Simple");
		doble=new JRadioButton("Doble");
		suite=new JRadioButton("Suite");
		
		JPanel aux = new JPanel();
		aux.setLayout(new FlowLayout());
		aux.setBackground(c);
		
		
		
		aux.add(simple);
		simple.addChangeListener(this);
        bg.add(simple);
        
        aux.add(suite);
        suite.addChangeListener(this);
        bg.add(suite);
        
        aux.add(doble);
        doble.addChangeListener(this);
        bg.add(doble);
		
		imagenes.setBounds(100,250,400,350);
		fotos.setBounds(50,50,0,0);
		imagenes.add(fotos);
		imagenes.setBorder(BorderFactory.createLineBorder(new Color(112,58,190), 2));
		aux.setBorder(BorderFactory.createLineBorder(new Color(112,58,190), 2));
		ejemploImagen.setBounds(100,180,200,26);
		
		aux.setBounds(100,210,400,40);
		this.add(aux);
		this.add(imagenes);
		this.add(ejemploImagen);
		this.add(habitacion);
		this.add(tipoHabitacion);
		this.add(numHabita);
		this.add(numHabitaciones);
		this.add(ninyos);
		this.add(ninyosPanel);
		this.add(importe);
		this.add(importeCalculo);
		ninyosPanel.setVisible(false);
		calculoImporteHabitacion();
	}


	/**
	 * State changed.
	 *
	 * @param e the e
	 */
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		if(ninyos.isSelected()) {
			ninyosPanel.setVisible(true);
			calculoImporteHabitacion();
		}
			
		else {
			ninyosPanel.setVisible(false);
			calculoImporteHabitacion();
		}
		
		if(simple.isSelected()) {
			Image img = new ImageIcon(getClass().getResource("/img/habitacion1.jpg")).getImage();
			ImageIcon habitacion = new ImageIcon (img.getScaledInstance(300,300,Image.SCALE_SMOOTH)); 
			fotos.setIcon(habitacion);
		}
		if(doble.isSelected()) {
			Image img = new ImageIcon(getClass().getResource("/img/habitacion2.jpg")).getImage();
			ImageIcon habitacion = new ImageIcon (img.getScaledInstance(300,300,Image.SCALE_SMOOTH)); 
			fotos.setIcon(habitacion);
		}
		if(suite.isSelected()) {
			Image img = new ImageIcon(getClass().getResource("/img/habitacion3.jpg")).getImage();
			ImageIcon habitacion = new ImageIcon (img.getScaledInstance(300,300,Image.SCALE_SMOOTH)); 
			fotos.setIcon(habitacion);
		}
			
		
	
	}
	
	/**
	 * Calculo importe habitacion.
	 */
	public static void  calculoImporteHabitacion() {
		double importe=0;
		int tipoHabitacionPrecio = 0;
		int dias =0;
		int alquinerNumHabitacion = (int) numHabitaciones.getValue();
		try {
			dias = Integer.parseInt(DatosUsuario.numDiasExtanciaTexto.getText());
		}catch(Exception i) {
			dias=0;
		}
		int camaSupletoriaCuna=0;
		
		
		if(tipoHabitacion.getSelectedItem().equals("Simple")){
			tipoHabitacionPrecio = 50;
		}
		if(tipoHabitacion.getSelectedItem().equals("Doble")){
			tipoHabitacionPrecio = 75;
		}
		if(tipoHabitacion.getSelectedItem().equals("Suite")){
			tipoHabitacionPrecio = 125;
		}
		
		if(ninyos.isSelected())
			camaSupletoriaCuna=20;
		else
			camaSupletoriaCuna=0;
		
		importe = tipoHabitacionPrecio * dias * alquinerNumHabitacion + camaSupletoriaCuna;
		
		importeCalculo.setText(importe + " €");
		
	}

}
