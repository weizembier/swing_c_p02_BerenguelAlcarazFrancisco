/**
 * PanelDatos.java
 * 1 dic. 2020 9:34:32
 */
package swing_c_p02_BerenguelAlcarazFrancisco;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

// TODO: Auto-generated Javadoc
/**
 * The Class PanelDatos.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class PanelDatos extends JDialog implements ActionListener{
	
	/** The dat usuario. */
	private DatosUsuario datUsuario = new DatosUsuario();
	
	/** The panel info. */
	private PanelInformacion panelInfo = new PanelInformacion();
	
	/** The dat habitacion. */
	private DatosHabitacion datHabitacion = new DatosHabitacion();
	
	/** The nuevo. */
	private JButton nuevo = new JButton();
	
	/** The guardar. */
	private JButton guardar = new JButton();
	
	/** The imprimir. */
	private JButton imprimir = new JButton();
	
	/**
	 * Instantiates a new panel datos.
	 */
	public PanelDatos() {
		
		JFrame frame = new JFrame();
		frame.setTitle("Añadir Registro");
		
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int heigth = pantalla.height;
		int width = pantalla.width;
		frame.setSize(width, heigth);
		frame.setLocation(width/4, heigth/4); // LOCALIZACION DEL FRAME EN MEDIO DEL MONITOR
		frame.setLocationRelativeTo(null); // POSICION RELATIVA NULL
		Image ico = new ImageIcon(getClass().getResource("/img/icono.jpg")).getImage();									
		frame.setIconImage(ico);
		frame.setLayout(new BorderLayout());
		JTabbedPane pestañas=new JTabbedPane();
		 
		

	        
	    frame.add(panelInfo, BorderLayout.NORTH);
	    panelInfo.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
	

	    JPanel auxBotones = new JPanel();
		auxBotones.setLayout(new FlowLayout());
			
		Image imgNuevo = new ImageIcon(getClass().getResource("/img/nuevo.png")).getImage();
		ImageIcon icoBotonNuevo = new ImageIcon (imgNuevo.getScaledInstance(50,50,Image.SCALE_SMOOTH)); 
		nuevo.setIcon(icoBotonNuevo);
			
		Image imgGuardar = new ImageIcon(getClass().getResource("/img/guardar.png")).getImage();
		ImageIcon icoBotonGuardar = new ImageIcon (imgGuardar.getScaledInstance(50,50,Image.SCALE_SMOOTH)); 
		guardar.setIcon(icoBotonGuardar);
			
		Image imgImprimir = new ImageIcon(getClass().getResource("/img/imprimir.png")).getImage();
		ImageIcon icoBotonImprimir= new ImageIcon (imgImprimir.getScaledInstance(50,50,Image.SCALE_SMOOTH)); 
		imprimir.setIcon(icoBotonImprimir);
			
		nuevo.setIcon(icoBotonNuevo);
		guardar.setIcon(icoBotonGuardar);
		imprimir.setIcon(icoBotonImprimir);
			
		auxBotones.add(nuevo);
		auxBotones.add(guardar);
		auxBotones.add(imprimir);
			
		frame.add(auxBotones, BorderLayout.SOUTH);
	   	
		Color c = new Color(76,189,224);
		auxBotones.setBackground(c);
	   	
	   	
	    pestañas.addTab("Datos Cliente", datUsuario);
	    pestañas.addTab("Datos Habitacion", datHabitacion);
  
	    frame.add(pestañas);

	    frame.setVisible(true);
	    
	    guardar.addActionListener(this);
	    nuevo.addActionListener(this);
	    imprimir.addActionListener(this);
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource() == nuevo) {
			DatosUsuario.nombreTexto.setText("");
			DatosUsuario.apellidoTexto.setText("");
			DatosUsuario.dniTexto.setText("");
			DatosUsuario.telefonoTexto.setText("");
			DatosUsuario.numDiasExtanciaTexto.setText("1");
			
			DatosHabitacion.extraTipo.setText("");
			DatosHabitacion.ninyos.setSelected(false);
		}
		
		if(e.getSource() == guardar) {
			JOptionPane.showMessageDialog(null, "REGISTRO GUARDADO","Hoteles", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(e.getSource() == imprimir) {
			DatosImprimir im = new DatosImprimir();
		}
	}

}
