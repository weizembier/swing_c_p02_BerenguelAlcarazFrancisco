/**
 * PanelInformacion.java
 * 1 dic. 2020 9:15:15
 */
package swing_c_p02_BerenguelAlcarazFrancisco;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

// TODO: Auto-generated Javadoc
/**
 * The Class PanelInformacion.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class PanelInformacion extends JPanel{
	
	/** The logo. */
	private JLabel logo = new JLabel();
	
	/** The nombre empresa. */
	private JLabel nombreEmpresa = new JLabel(" FB Hoteles Almeria");
	
	/**
	 * Instantiates a new panel informacion.
	 */
	public PanelInformacion() {
	
		Image ico = new ImageIcon(getClass().getResource("/img/icono.jpg")).getImage();								
		ImageIcon icoScale = new ImageIcon (ico.getScaledInstance(100,100,Image.SCALE_SMOOTH));
		logo.setIcon(icoScale);
		
		
		Color c = new Color(1,52,115);
		
		this.setBackground(c);

		nombreEmpresa.setForeground(Color.WHITE);
		Font fuente = new Font("Arial", Font.BOLD, 50);
		nombreEmpresa.setFont(fuente);
		
		
		this.add(logo);
		this.add(nombreEmpresa);
		
		
		
		this.setVisible(true);
		
	}

}
