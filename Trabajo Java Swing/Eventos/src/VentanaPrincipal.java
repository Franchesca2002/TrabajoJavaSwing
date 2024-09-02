import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.FlowLayout;

public class VentanaPrincipal extends JFrame {
	
	 private JTextField txtTexto;
	 private JLabel etiTexto;
	 private JButton btnVaciar;
	 
	 public VentanaPrincipal() {
		 
	 setTitle("Ventana Principal");
	 setSize(300, 150);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 setLayout(new FlowLayout());
	 
	 InicializacionComponentes() {
		 
	txtTexto = new JTextField(20);
	etiTexto = new JLabel("");
	btnVaciar = new JButton("Vaciar");
	
	
	add(txtTexto);
    add(etiTexto);
    add(btnVaciar);
    
    setVisible(true);
	
	 }
	 }

}
