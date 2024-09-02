import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
	
	private JTextField txtNombre;
    private JTextField txtCiudad;
    private JLabel txtFrase;
    private JButton btnAceptar;
    private JButton btnDesactivar;
    private JButton btnActivar;
    JPanel miPanel;
    
    public VentanaPrincipal() {
    	
    	setTitle("Ventana Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        iniciarComponentes() {
        	
        	
        }
        
        private void iniciarComponentes() {
        	
        	miPanel=new JPanel();
    		miPanel.setLayout(null);
    		miPanel.setBackground(Color.blue);
    		
    		txtNombre = new JTextField();
            txtCiudad = new JTextField();
            txtFrase = new JLabel(" ");
            btnAceptar = new JButton("Aceptar");
            btnDesactivar = new JButton("Desactivar");
            btnActivar = new JButton("Activar");
            
            txtNombre.setBounds(50, 30, 300, 25);
            txtCiudad.setBounds(50, 70, 300, 25);
            txtFrase.setBounds(50, 180, 300, 25);
            btnAceptar.setBounds(50, 110, 100, 25);
            btnDesactivar.setBounds(160, 110, 100, 25);
            btnActivar.setBounds(270, 110, 100, 25);
            
            miPanel.add(txtNombre);
            miPanel.add(txtCiudad);
            miPanel.add(txtFrase);
            miPanel.add(btnAceptar);
            miPanel.add(btnDesactivar);
            miPanel.add(btnActivar);
            
            add(miPanel);
    		
    		}
        @Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
    		
    }

}
