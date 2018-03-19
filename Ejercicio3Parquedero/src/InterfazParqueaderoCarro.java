import java.awt.BorderLayout;
import java.awt.*;
import javax.swing.*;

public class InterfazParqueaderoCarro extends JFrame
{
	private PanelParqueadero panelParqueadero;
	private PanelTarifa panelTarifa;
	
	private Panelinformacion panelinformacion;
	
	
	public InterfazParqueaderoCarro () throws Exception
	{
		setTitle( "Parqueadero a $1200");
		setSize(880,430);
		setResizable(false);
		setDefaultCloseOperation( EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		panelParqueadero = new PanelParqueadero(null);
		add(panelParqueadero,BorderLayout.NORTH);
		
		panelTarifa = new PanelTarifa();
		add(panelTarifa,BorderLayout.CENTER);
		
		panelinformacion = new Panelinformacion(null);
		add(panelinformacion,BorderLayout.SOUTH);
	}
	
	public static void main (String[] args) throws Exception
	{
		InterfazParqueaderoCarro Vent = new InterfazParqueaderoCarro();
		Vent.setVisible(true);
	}

}
