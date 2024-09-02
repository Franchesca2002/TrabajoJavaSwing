import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaMouse extends JFrame {
	
	private JLabel etiPal1;
    private JLabel etiPal2;
    private JLabel etiPal3;
    private JLabel etiPal4;
    private JLabel etiOcultar;
    
    public VentanaMouse() {
    	
    	setTitle("Ventana Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        iniciarComponntes() {
        	
        	
        }
        
        private void iniciarComponentes() {
    		// TODO Auto-generated method stub
    	miPanel=new JPanel();
    	miPanel.setLayout(null);
    	miPanel.setBackground(Color.grey);
    		
    	etiPal1 = new JLabel("Palabra 1");
        etiPal2 = new JLabel("Palabra 2");
        etiPal3 = new JLabel("Palabra 3");
        etiPal4 = new JLabel("Palabra 4");
        etiOcultar = new JLabel("Ocultar");

        etiPal1.setBounds(50, 30, 100, 30);
        etiPal2.setBounds(50, 70, 100, 30);
        etiPal3.setBounds(50, 110, 100, 30);
        etiPal4.setBounds(50, 150, 100, 30);
        
        etiOcultar.setBounds(200, 50, 150, 100);
        etiOcultar.setOpaque(true);
        etiOcultar.setBackground(Color.YELLOW);
        etiOcultar.setHorizontalAlignment(JLabel.CENTER);
        etiOcultar.setVerticalAlignment(JLabel.CENTER);
        etiOcultar.setFont(new Font("Arial", Font.BOLD, 16));
        
        miPanel.add(etiPal1);
        miPanel.add(etiPal2);
        miPanel.add(etiPal3);
        miPanel.add(etiPal4);
        miPanel.add(etiOcultar);add(etiPal1);
        miPanel.add(etiPal2);
        miPanel.add(etiPal3);
        miPanel.add(etiPal4);
        miPanel.add(etiOcultar);
        
        add(miPanel);
    }
        @Override
    	public void actionPerformed(ActionEvent e) {
    		// TODO Auto-generated method stub
        }

}
