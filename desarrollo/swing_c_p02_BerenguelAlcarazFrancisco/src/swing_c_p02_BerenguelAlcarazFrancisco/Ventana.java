/**
 * Ventana.java
 * 1 dic. 2020 7:40:46
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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.glass.events.KeyEvent;



// TODO: Auto-generated Javadoc
/**
 * The Class Ventana.
 *
 * @author Francisco Berenguel Alcaraz
 */
public class Ventana extends JFrame implements ActionListener{

	/** The menu barra. */
	private JMenuBar menuBarra=new JMenuBar();
	
	/** The archivo. */
	private JMenu archivo = new JMenu("Archivo");
		
		/** The salir. */
		private JMenuItem salir = new JMenuItem("Salir");
		
	/** The registro. */
	private JMenu registro = new JMenu("Registro");
		
		/** The alta. */
		private JMenuItem alta = new JMenuItem("Alta Reservas   (Alt+A)");
		
		/** The baja. */
		private JMenuItem baja = new JMenuItem("Baja Reservas   (Alt+B)");
	
	/** The ayuda. */
	private JMenu ayuda = new JMenu("Ayuda");
		
		/** The acerca de. */
		private JMenuItem acercaDe = new JMenuItem("Acerca de...");
		
	/** The alta botn. */
	private JButton altaBotn = new JButton();
	
	/** The baja botn. */
	private JButton bajaBotn = new JButton();
	
	/** The panel info. */
	private PanelInformacion panelInfo = new PanelInformacion();
	
	/**
	 * Instantiates a new ventana.
	 */
	public Ventana() {
		
		super("Hoteles");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		int heigth = pantalla.height;
		int width = pantalla.width;
		this.setSize(width/2, heigth/2);
		this.setLayout(new BorderLayout());
		
		
		Image ico = new ImageIcon(getClass().getResource("/img/icono.jpg")).getImage();									
		setIconImage(ico);
		
		this.setLocation(width/4, heigth/4); // LOCALIZACION DEL FRAME EN MEDIO DEL MONITOR
		this.setLocationRelativeTo(null); // POSICION RELATIVA NULL
		
		
		JPanel panelSup = new JPanel();
		panelSup.setLayout(new BorderLayout());
		
		panelSup.add(panelInfo, BorderLayout.SOUTH);
		panelSup.add(menuBarra, BorderLayout.NORTH);
		
		
		
		this.add(panelSup, BorderLayout.NORTH);
		menuBarra.add(archivo);
		archivo.add(salir) .addActionListener(this);
		
		menuBarra.add(registro);
		registro.add(alta) .addActionListener(this);
		registro.addSeparator();
		registro.add(baja) .addActionListener(this);
		
		menuBarra.add(ayuda);
		ayuda.add(acercaDe) .addActionListener(this);
		
		JPanel aux = new JPanel();
		aux.setLayout(new FlowLayout());
		aux.setSize(400, 400);
		
		Color c = new Color(76,189,224);
		aux.setBackground(c);
		
		
		Image img = new ImageIcon(getClass().getResource("/img/borrar.png")).getImage();
		ImageIcon icoBotonBorrar = new ImageIcon (img.getScaledInstance(100,100,Image.SCALE_SMOOTH)); 
		bajaBotn.setIcon(icoBotonBorrar);
		bajaBotn.setBackground(new Color(82,145,187));
	
		ImageIcon icoBotonAnyadir = new ImageIcon (getClass().getResource("/img/anyadir.png"));
		altaBotn.setIcon(icoBotonAnyadir);
		altaBotn.setBackground(new Color(82,145,187));
		
		altaBotn.setMinimumSize(new Dimension(20,20));
		altaBotn.setMaximumSize(new Dimension(150,150));
		altaBotn.setPreferredSize(new Dimension(220,220));
		
		bajaBotn.setMinimumSize(new Dimension(20,20));
		bajaBotn.setMaximumSize(new Dimension(150,150));
		bajaBotn.setPreferredSize(new Dimension(220,220));
		
		aux.add(altaBotn);
		aux.add(bajaBotn);
		
		altaBotn.addActionListener(this);
		bajaBotn.addActionListener(this);
	
		registro.setMnemonic(KeyEvent.VK_R);
		alta.setMnemonic(KeyEvent.VK_A);
		altaBotn.setMnemonic(KeyEvent.VK_A);
		baja.setMnemonic(KeyEvent.VK_B);
		bajaBotn.setMnemonic(KeyEvent.VK_B);
		
		panelSup.setVisible(true);
		aux.setVisible(true);
		
		
		
		
		this.add(aux, BorderLayout.CENTER);
		this.setVisible(true);
		
	}

	/**
	 * Action performed.
	 *
	 * @param e the e
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource() == salir) {
			System.exit(0);
		}
		
		if(e.getSource() == baja || e.getSource() == bajaBotn) {
			JOptionPane.showMessageDialog(null, "ERROR: OPCION EN DESARROLLO","Borrar Registro", JOptionPane.ERROR_MESSAGE);
		}
		
		
		
		if(e.getSource() == alta || e.getSource() == altaBotn) {
			PanelDatos a = new PanelDatos();
		
		}
		
		
		if(e.getSource() == acercaDe) {
			JOptionPane.showMessageDialog(null, "APLICACION PARA GESTIONAR HOTELES\nVersion: 1.0\nAutor: Francisco Berenguel Alcaraz","Acerca De...", JOptionPane.INFORMATION_MESSAGE);
		
		}
	}
}
