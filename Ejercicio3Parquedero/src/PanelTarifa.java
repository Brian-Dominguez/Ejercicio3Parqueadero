import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelTarifa extends JPanel
{
	    
		private JButton btnIngresar;
		private JButton btnSalir;
		private JButton btnAvanzar;
		private JButton btnOpc1;
		private JButton btnOpc2;
		private PanelHora panelHora;
		
		public PanelTarifa()
		{
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			panelHora = new PanelHora();
			add(panelHora,BorderLayout.NORTH);
			
			setLayout(new GridLayout(5,7));
			
			btnIngresar = new JButton("Ingresar");
			btnSalir = new JButton("Salir");
			btnAvanzar = new JButton("Avanzar");
			btnOpc1 = new JButton("Opción 1");
			btnOpc2 = new JButton("Opción 2");
			
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(btnIngresar);
			add(btnSalir);
			add(btnAvanzar);
			add(btnOpc1);
			add(btnOpc2);
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
	
		}
	}
