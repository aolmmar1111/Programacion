package calculadora;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 * @author Alejandro
 */

public class PanelPrincipal extends JPanel implements ActionListener{
    
	// Atributos de la clase (privados)
	private PanelBotones botonera;
	private JTextArea areaTexto;
	private int tipoOperacion;
	private boolean nuevaEntrada;
	private double total = 0;
	private int i = 0;
    
	// Constructor
	public PanelPrincipal(){
    		initComponents();
    		tipoOperacion = -1; // No hay operaciones en la calculadora
	}
    
	// Se inicializan los componentes gráficos y se colocan en el panel
	private void initComponents(){
    		// Creamos el panel de botones
    		botonera = new PanelBotones();
    		// Creamos el área de texto
    		areaTexto = new JTextArea(10,50);
    		areaTexto.setEditable(false);
    		areaTexto.setBackground(Color.white);
   
    		//Establecemos layout del panel principal
    		this.setLayout(new BorderLayout());
    		// Colocamos la botonera y el área texto
    		this.add(areaTexto, BorderLayout.NORTH);
    		this.add(botonera, BorderLayout.SOUTH);
			// Añadir
			for (JButton boton: this.botonera.getgrupoBotones()){
            	boton.addActionListener(this);
        	}

	}

  	@Override
    public void actionPerformed(ActionEvent ae) {
	// Se obtiene el objeto que desencadena el evento
		String comando = ae.getActionCommand();
	// Si es un botón

		if (comando.matches("[0-9]")) {
			if (nuevaEntrada) {
				areaTexto.setText(comando);
			} else {
				areaTexto.append(comando);
			}	
		} else if (nuevaEntrada) {
			
		} {

		}



		System.out.println(total);
	}
}
