import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelParqueadero extends JPanel 
{

		private InterfazParqueaderoCarro Principal;
		
		//Atributos
		
		private JButton btn1,btn2, btn3,btn4, btn5,btn6, btn7,btn8, btn9,btn10, btn11,btn12, btn13,btn14, btn15,btn16,
		 btn17,btn18, btn19,btn20, btn21,btn22, btn23,btn24, btn25,btn26, btn27,btn28, btn29,btn30, btn31,btn32,btn33,
		 btn34,btn35, btn36,btn37, btn38,btn39, btn40,btn41, btn42,btn43, btn44,btn45, btn46,btn47, btn48,btn49, btn50,
		 btn51,btn52, btn53,btn54, btn55,btn56, btn57,btn58, btn59,btn60, btn61,btn62, btn63,btn64, btn65,btn66, btn67,
		 btn68,btn69, btn70,btn71, btn72,btn73, btn74,btn75, btn76,btn77, btn78,btn79, btn80,btn81, btn82,btn83, btn84,
		 btn85,btn86, btn87;
		
		public PanelParqueadero(InterfazParqueaderoCarro v)
		{
			Principal=v;
			setLayout(new GridLayout(5,18));
			setPreferredSize(new Dimension(0,130));
			
			TitledBorder border = BorderFactory.createTitledBorder("Parqueadero");
			border.setTitleColor(Color.BLUE);
			setBorder(border);
			
			
			btn1 = new JButton("1");   btn2 = new JButton("2");   btn3 = new JButton("3");  btn4 = new JButton("4");
			btn5 = new JButton("5");   btn6 = new JButton("6");   btn7 = new JButton("7");  btn8 = new JButton("8");
			btn9 = new JButton("9");   btn10 = new JButton("10"); btn11 = new JButton("11"); btn12 = new JButton("12");
			btn13 = new JButton("13"); btn14 = new JButton("14"); btn15 = new JButton("15"); btn16 = new JButton("16");
			btn17 = new JButton("17"); btn18 = new JButton("18"); btn19 = new JButton("19"); btn20 = new JButton("20");
			btn21 = new JButton("21"); btn22 = new JButton("22"); btn23 = new JButton("23"); btn24 = new JButton("24");
			btn25 = new JButton("25"); btn26 = new JButton("26"); btn27 = new JButton("27"); btn28 = new JButton("28");
			btn29 = new JButton("29"); btn30 = new JButton("30"); btn31 = new JButton("31"); btn32 = new JButton("32");
			btn33 = new JButton("33"); btn34 = new JButton("34"); btn35 = new JButton("35"); btn36 = new JButton("36");
			btn37 = new JButton("37"); btn38 = new JButton("38"); btn39 = new JButton("39"); btn40 = new JButton("40");
			btn41 = new JButton("41"); btn42 = new JButton("42"); btn43 = new JButton("43"); btn44 = new JButton("44");
			btn45 = new JButton("45"); btn46 = new JButton("46"); btn47 = new JButton("47"); btn48 = new JButton("48");
			btn49 = new JButton("49"); btn50 = new JButton("50"); btn51 = new JButton("51"); btn52 = new JButton("52");
			btn53 = new JButton("53"); btn54 = new JButton("54"); btn55 = new JButton("55"); btn56 = new JButton("56");
			btn57 = new JButton("57"); btn58 = new JButton("58"); btn59 = new JButton("59"); btn60 = new JButton("60");
			btn61 = new JButton("61"); btn62 = new JButton("62"); btn63 = new JButton("63"); btn64 = new JButton("64");
			btn65 = new JButton("65"); btn66 = new JButton("66"); btn67 = new JButton("67"); btn68 = new JButton("68");
			btn69 = new JButton("69"); btn70 = new JButton("70"); btn71 = new JButton("71"); btn72 = new JButton("72");
			btn73 = new JButton("73"); btn74 = new JButton("74"); btn75 = new JButton("75"); btn76 = new JButton("76");
			btn77 = new JButton("77"); btn78 = new JButton("78"); btn79 = new JButton("79"); btn80 = new JButton("80");
			btn81 = new JButton("81"); btn82 = new JButton("82"); btn83 = new JButton("83"); btn84 = new JButton("84");
			btn85 = new JButton("85"); btn86 = new JButton("86"); btn87 = new JButton("87"); 
			
			add(btn1); add(btn2); add(btn3); add(btn4); add(btn5); add(btn6); add(btn7); add(btn8); add(btn9); add(btn10); 
			add(btn11); add(btn12); add(btn13); add(btn14); add(btn15); add(btn16); add(btn17); add(btn18); add(btn19); add(btn20);
			add(btn21); add(btn22); add(btn23); add(btn24); add(btn25); add(btn26); add(btn27); add(btn28); add(btn29); add(btn30);
			add(btn31); add(btn32); add(btn33); add(btn34); add(btn35); add(btn36); add(btn37); add(btn38); add(btn39); add(btn40);
			add(btn41); add(btn42); add(btn43); add(btn44); add(btn45); add(btn46); add(btn47); add(btn48); add(btn49); add(btn50);
			add(btn51); add(btn52); add(btn53); add(btn54); add(btn55); add(btn56); add(btn57); add(btn58); add(btn59); add(btn60);
			add(btn61); add(btn62); add(btn63); add(btn64); add(btn65); add(btn66); add(btn67); add(btn68); add(btn69); add(btn70);
			add(btn71); add(btn72); add(btn73); add(btn74); add(btn75); add(btn76); add(btn77); add(btn78); add(btn79); add(btn80);
			add(btn81); add(btn82); add(btn83); add(btn84); add(btn85); add(btn86); add(btn87); 
			
		}
		
	}
