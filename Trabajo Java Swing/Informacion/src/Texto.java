import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.FlowLayout;

public class Texto  extends JFrame {
	
	private JTextField txtTexto;
    private JLabel etiTexto1;
    private JLabel etiTexto2;
    private JButton btnTraspasa1;
    private JButton btnTraspasa2;
    
    public Texto() {
    	
    setTitle("Texto");
    setSize(300, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    
    inicializarComponentes() {
    	
    miPanel=new JPanel();
	miPanel.setLayout(null);
	miPanel.setBackground(Color.orange);
    	
    txtTexto = new JTextField(20);
    etiTexto1 = new JLabel("");
    etiTexto2 = new JLabel("");
    btnTraspasa1 = new JButton("Traspasa 1");
    btnTraspasa2 = new JButton("Traspasa 2");
    
    add(miPanel);
    
    }
    @override
    public void ActionPerformed(ActionEvent e) {
    	
    }
	
	

}
