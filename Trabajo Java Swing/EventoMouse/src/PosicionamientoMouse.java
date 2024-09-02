import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PosicionamientoMouse extends JFrame {
	
	private JLabel etiNombre;
    private JButton btnEsquina;
    private JButton btnCentro;
    private JButton btnAgrandar;
    private JButton btnAchicar;
    JPanel miPanel;
    
    private final int BUTTON_WIDTH = 100;
    private final int BUTTON_HEIGHT = 30;
    private final int LABEL_WIDTH = 150;
    private final int LABEL_HEIGHT = 40;

    public PosicionamientoMouse() {
    	
    setTitle("Ventana Principal");
    setSize(400, 300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
    setLayout(null);
    
    iniciarComponentes() {
    	
    	
    }
    
    private void iniciarComponentes() {
		// TODO Auto-generated method stub
	miPanel=new JPanel();
	miPanel.setLayout(null);
	miPanel.setBackground(Color.pink);
	
	etiNombre = new JLabel("Mi Nombre");
    etiNombre.setOpaque(true);
    etiNombre.setBackground(Color.CYAN);
    etiNombre.setPreferredSize(new Dimension(LABEL_WIDTH, LABEL_HEIGHT));
    etiNombre.setSize(LABEL_WIDTH, LABEL_HEIGHT);
    etiNombre.setLocation(50, 50);
    
    btnEsquina = new JButton("Esquina");
    btnCentro = new JButton("Centro");
    btnAgrandar = new JButton("Agrandar");
    btnAchicar = new JButton("Achicar");
    
    btnEsquina.setBounds(50, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
    btnCentro.setBounds(160, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
    btnAgrandar.setBounds(270, 200, BUTTON_WIDTH, BUTTON_HEIGHT);
    btnAchicar.setBounds(50, 240, BUTTON_WIDTH, BUTTON_HEIGHT);
    
    miPanel.add(etiNombre);
    miPanel.add(btnEsquina);
    miPanel.add(btnCentro);
    miPanel.add(btnAgrandar);
    miPanel.add(btnAchicar);
    
    add(miPanel);

	}
    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
}

    
    }