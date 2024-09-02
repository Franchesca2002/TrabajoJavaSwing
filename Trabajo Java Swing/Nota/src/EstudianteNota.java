import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudianteNota extend JFrame {
	
	private JTextField txtPrimerTrimestre;
    private JTextField txtSegundoTrimestre;
    private JTextField txtTercerTrimestre;
    private JLabel etiNotaFinal;
    private JLabel etiResultado;
    private JButton btnCalcular;
    
    public EstudianteNota() {
    	
    	setTitle("Calcular la Nota Final");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        
        iniciarComponentes();
    }
    
    private void iniciarComponentes() {
		// TODO Auto-generated method stub
		miPanel=new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.red);
		
		txtPrimerTrimestre = new JTextField();
        txtSegundoTrimestre = new JTextField();
        txtTercerTrimestre = new JTextField();
        etiNotaFinal = new JLabel("Nota Final:");
        etiResultado = new JLabel();
        btnCalcular = new JButton("Calcular");
        
        txtPrimerTrimestre.setBounds(150, 30, 100, 25);
        txtSegundoTrimestre.setBounds(150, 70, 100, 25);
        txtTercerTrimestre.setBounds(150, 110, 100, 25);
        
        etiNotaFinal.setBounds(30, 150, 100, 25);
        etiResultado.setBounds(150, 150, 100, 25);
        
        btnCalcular.setBounds(150, 190, 100, 30);
        
        miPanel.add(txtPrimerTrimestre);
        miPanel.add(txtSegundoTrimestre);
        miPanel.add(txtTercerTrimestre);
        miPanel.add(etiNotaFinal);
        miPanel.add(etiResultado);
        miPanel.add(btnCalcular);
        
        add(miPanel);
        
        

}
