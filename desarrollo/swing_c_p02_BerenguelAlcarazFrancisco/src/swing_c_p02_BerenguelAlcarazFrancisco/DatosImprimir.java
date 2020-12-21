/**
 * DatosImprimir.java
 * 1 dic. 2020 16:20:48
 */
package swing_c_p02_BerenguelAlcarazFrancisco;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

// TODO: Auto-generated Javadoc
/**
 * The Class DatosImprimir.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class DatosImprimir  extends JDialog {
	
	/** The dat usuario. */
	private DatosUsuarioImprimir datUsuario = new DatosUsuarioImprimir();
	
	/** The panel info. */
	private PanelInformacion panelInfo = new PanelInformacion();
	
	/** The dat habitacion. */
	private DatosHabitacionImprimir datHabitacion = new DatosHabitacionImprimir();
	
	/**
	 * Instantiates a new datos imprimir.
	 */
	public DatosImprimir() {
		JFrame frame = new JFrame();
		frame.setTitle("Añadir Registro");
		
		
		Color c = new Color(76,189,224);
		this.setBackground(c);
		
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
	   	
	    pestañas.addTab("Datos Cliente Imprimir",datUsuario);
	    pestañas.addTab("Datos Habitacion Imprimir", datHabitacion);
	    frame.add(pestañas);
	    frame.setVisible(true);
	}

}
