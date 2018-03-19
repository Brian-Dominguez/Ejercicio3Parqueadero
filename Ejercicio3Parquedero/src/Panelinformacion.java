import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Panelinformacion extends JPanel
{
		private InterfazParqueaderoCarro Principal;
		
		//Atributos
		private JLabel labValor;
		private JTextField txtValor;
		private JLabel labPuesto;
		private JTextField txtPuesto;
		
		public Panelinformacion(InterfazParqueaderoCarro v)
		{
			Principal=v;
			setLayout(new GridLayout(2,6));
			setPreferredSize(new Dimension(0,80));
			
			TitledBorder border = BorderFactory.createTitledBorder("Información");
			border.setTitleColor(Color.BLUE);
			setBorder(border);
			
			labValor = new JLabel("Valor en caja");
			txtValor = new JTextField("$ 0");
			labPuesto = new JLabel("Puestos vacios");
			txtPuesto = new JTextField("# 0");
						
			txtValor.setEditable(false);
			txtValor.setForeground(Color.BLUE);
			txtValor.setBackground(Color.WHITE);
			txtPuesto.setEditable(false);
			txtPuesto.setForeground(Color.BLUE);
			txtPuesto.setBackground(Color.WHITE);
			
			add(new JLabel(""));
			add(new JLabel(""));
			add(labValor);
			add(txtValor);
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(new JLabel(""));
			add(labPuesto);
			add(txtPuesto);
			add(new JLabel(""));
			add(new JLabel(""));
			
		}

	}
