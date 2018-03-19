import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelHora extends JPanel
{
	
		    private JTextField txtHora;
			public PanelHora()
			{	
				setLayout(new GridLayout(0,3));
				TitledBorder borderHora = BorderFactory.createTitledBorder("Hora Actual");
				borderHora.setTitleColor(Color.BLUE);
				
				setBorder(borderHora);
				
				txtHora = new JTextField ("6:00");
				add(txtHora);
				
				txtHora.setEditable(false);
				txtHora.setBackground(Color.GRAY);
             }
}
