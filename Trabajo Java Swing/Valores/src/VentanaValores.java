import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaValores extends JFrame {
	
	private JTextField txtNumero;
    private JButton btnBorrar;
    private StringBuilder numeros;
    JPanel miPanel;
    
    public VentaValores() {
    	
    	setTitle("Etiquetas y Número");
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
    		miPanel.setBackground(Color.blue);
    		
    		txtNumero = new JTextField();
            txtNumero.setBounds(50, 220, 300, 25);
            txtNumero.setEditable(false);
            
            btnBorrar = new JButton("Borrar");
            btnBorrar.setBounds(280, 220, 80, 25);
            
            miPanel.add(txtNumero);
            miPanel.add(btnBorrar);
            
            for (int i = 0; i < 10; i++) {
                JLabel etiqueta = new JLabel(String.valueOf(i));
                etiqueta.setBounds(50 + (i * 30), 30, 30, 30);
                etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
                etiqueta.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    		
    }

}
