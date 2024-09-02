import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaColores extends{
	
	private JLabel etiTexto;
    private JButton btnAzul;
    private JButton btnRojo;
    private JButton btnVerde;
    private JButton btnFondoAzul;
    private JButton btnFondoRojo;
    private JButton btnFondoVerde;
    private JButton btnTransparente;
    private JButton btnOpaca;
    JPanel miPanel;
    
    public VentanaColores() {
    	
    	setTitle("Ventana Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        iniciarComponentes() ;
        	
        }
}
   private void iniciarComponentes() {
	  // TODO Auto-generated method stub
	    miPanel=new JPanel();
	    miPanel.setLayout(null);
	    miPanel.setBackground(Color.blue);
	    
        etiTexto = new JLabel("Texto de Prueba");
        etiTexto.setOpaque(true); 
        etiTexto.setBackground(Color.WHITE);
        etiTexto.setForeground(Color.BLACK); 
        etiTexto.setBounds(50, 50, 300, 30);
        
        btnAzul = new JButton("Azul");
        btnRojo = new JButton("Rojo");
        btnVerde = new JButton("Verde");
        btnFondoAzul = new JButton("Fondo Azul");
        btnFondoRojo = new JButton("Fondo Rojo");
        btnFondoVerde = new JButton("Fondo Verde");
        btnTransparente = new JButton("Transparente");
        btnOpaca = new JButton("Opaca");
        
        btnAzul.setBounds(50, 100, 120, 30);
        btnRojo.setBounds(180, 100, 120, 30);
        btnVerde.setBounds(310, 100, 120, 30);
        btnFondoAzul.setBounds(50, 150, 120, 30);
        btnFondoRojo.setBounds(180, 150, 120, 30);
        btnFondoVerde.setBounds(310, 150, 120, 30);
        btnTransparente.setBounds(50, 200, 120, 30);
        btnOpaca.setBounds(180, 200, 120, 30);

        miPanel.add(etiTexto);
        miPanel.add(btnAzul);
        miPanel.add(btnRojo);
        miPanel.add(btnVerde);
        miPanel.add(btnFondoAzul);
        miPanel.add(btnFondoRojo);
        miPanel.add(btnFondoVerde);
        miPanel.add(btnTransparente);
        miPanel.add(btnOpaca);
        
        add(miPanel);
        
       }

   @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
}

   }