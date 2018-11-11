package guiExamples;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class VentanaResultados extends JFrame implements ActionListener{

	
	//Datos
    private Object[][] datos = {{"", ""}};
    // Nombres de las columnas 
    private static final String[] Columnas = {"Familia", "Precio por d�a"};
    
	private static final String birdString = "bird";
	private static final String catString = "cat";
	private static final String dogString = "dog";
	private static final String rabbitString = "rabbit";
	private static final String pigString = "pig";
	
	private Container cp;
	
	public VentanaResultados() {

		this.initialize();
		
        setSize(500, 300);
        setVisible(true);
    }
	
	private void initialize(){
		
		
		//set layout to content pane
        cp = getContentPane();
        cp.setLayout(new BorderLayout());
        
        //Create the table
        JTable tabla = new JTable(datos, Columnas);
        tabla.setFont(new Font("Arial", Font.BOLD, 18));
        tabla.setRowHeight(24);
        JScrollPane jsp = new JScrollPane(tabla); // ,ver , hor) ;
        
	    //Create the radio buttons.
	    JRadioButton birdButton = new JRadioButton(birdString);
	    birdButton.setMnemonic(KeyEvent.VK_B);
	    birdButton.setActionCommand(birdString);
	    birdButton.setSelected(true);

	    JRadioButton catButton = new JRadioButton(catString);
	    catButton.setMnemonic(KeyEvent.VK_C);
	    catButton.setActionCommand(catString);

	    JRadioButton dogButton = new JRadioButton(dogString);
	    dogButton.setMnemonic(KeyEvent.VK_D);
	    dogButton.setActionCommand(dogString);

	    JRadioButton rabbitButton = new JRadioButton(rabbitString);
	    rabbitButton.setMnemonic(KeyEvent.VK_R);
	    rabbitButton.setActionCommand(rabbitString);

	    JRadioButton pigButton = new JRadioButton(pigString);
	    pigButton.setMnemonic(KeyEvent.VK_P);
	    pigButton.setActionCommand(pigString);

	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(birdButton);
	    group.add(catButton);
	    group.add(dogButton);
	    group.add(rabbitButton);
	    group.add(pigButton);

	    //Register a listener for the radio buttons.
	    birdButton.addActionListener(this);
	    catButton.addActionListener(this);
	    dogButton.addActionListener(this);
	    rabbitButton.addActionListener(this);
	    pigButton.addActionListener(this);
	    
	    
	    
	    //Add compoenents to content pane
        cp.add(jsp, BorderLayout.CENTER);
	    JPanel radioPanel = new JPanel(new GridLayout(0, 1));
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        cp.add(radioPanel, BorderLayout.SOUTH);
        
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println(e.getActionCommand());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VentanaResultados vr = new VentanaResultados(); 
	}

}
