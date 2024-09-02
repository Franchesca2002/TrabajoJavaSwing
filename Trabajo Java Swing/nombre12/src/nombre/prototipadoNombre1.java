package nombre;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class prototipadoNombre1 extends JFrame implements ActionListener  {
	
	private JLabel etiNombre;
	private JLabel etiCiudad;
	private JButton ocultarNombreButton;
	private JButton visualizarNombreButton;
	private JButton ocultarCiudadButton;
	private JButton visualizarCiudadButton;
	JPanel miPanel;
	
	public prototipadoNombre1() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setTitle("Franchesca me mintió");
		setLocationRelativeTo(null);
		
		
		iniciarComponentes();
	
		
	
	}
	

	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		miPanel=new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.red);
		
		etiNombre= new JLabel("Nombre:");
		etiNombre.setBounds(13,30,120,30);
		miPanel.add(etiNombre);
		
		etiCiudad= new JLabel("Ciudad:");
		etiCiudad.setBounds(80,30,120,30);
		miPanel.add(etiCiudad);
		
		ocultarNombreButton= new JButton("Ocultar Nombre");
		ocultarNombreButton.setBounds(10,70,150,30);
		miPanel.add(ocultarNombreButton);
		
		visualizarNombreButton= new JButton("visualizar Nombre");
		visualizarNombreButton.setBounds(80,170,120,25);
		miPanel.add(visualizarNombreButton);
		
		ocultarCiudadButton= new JButton("Ocultar Ciudad");
		ocultarCiudadButton.setBounds(150,200,120,35);
		miPanel.add(ocultarCiudadButton);
		
		visualizarCiudadButton= new JButton("visualizar Ciudad");
		visualizarCiudadButton.setBounds(240,140,110,15);
		miPanel.add(visualizarCiudadButton);
		
		add(miPanel);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	
	
	
	

}
