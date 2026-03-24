/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daw;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author jfervic933
 */
public class Panel extends JPanel {

    // Tamaño del panel. Constantes
    public static final int ANCHO_PANEL = 600;
    public static final int ALTO_PANEL = 200;

    // Atributos del panel
    private JButton btnGenerar, btnCerrar;
    private JLabel lblUrl, lblFichero, extensionFichero;
    String [] opciones = {"jpg","png"};
    private JComboBox<String> desplegable = new JComboBox<>(opciones);
    private JTextField tfUrl, tfFichero;
    private String nombreFichero;
    private JRadioButton rbJpg,rbPng;
    private ButtonGroup grupoButton;

    // Constructor 
    public Panel() {
        // Establece el layout del panel
        this.setLayout(new FlowLayout());
        // Establece el color del fondo del panel
        this.setBackground(Color.gray);
        // Establece el tamaño del panel
        this.setSize(ANCHO_PANEL, ALTO_PANEL);
        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // Añade URL Label
        lblUrl = new JLabel("Introduce el texto: ");
        this.add(lblUrl);

        // Añade área de texto para la URL
        // Ancho de unos 40 caracteres aprox
        tfUrl = new JTextField(40);
        this.add(tfUrl);

        // Añade Fichero Label
        lblFichero = new JLabel("Nombre del fichero: ");
        this.add(lblFichero);

        // Añade área de texto para el nombre del fichero
        tfFichero = new JTextField(40);
        this.add(tfFichero);

        extensionFichero = new JLabel("Entension fichero:");
        this.add(extensionFichero);

        grupoButton = new ButtonGroup();

        rbJpg = new JRadioButton("jpg");
        grupoButton.add(rbJpg);
        this.add(rbJpg);

        rbPng = new JRadioButton("png");
        grupoButton.add(rbPng);
        this.add(rbPng);


        // this.add(desplegable);
        // Añade el botón generar
        btnGenerar = new JButton("Generar código QR");
        this.add(btnGenerar);
        // Comportamiento del botón generar
        btnGenerar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                // Si el contenido de los textField no está vacío
                if (!tfUrl.getText().isEmpty()&&!tfFichero.getText().isEmpty()){
                    // Genera el fichero con la imagen del QR
                    String extension = (String) desplegable.getSelectedItem();
                    
                    // String extension;
                    // if (rbJpg.isSelected()) {
                    //     extension = "jpg";
                    // } else {
                    //     extension = "png";
                    // }
                    // El fichero se genera en la raíz del proyecto
                    QR.escribirQR(tfUrl.getText(), tfFichero.getText(), extension);
                    
                    new VentanaResultado(tfFichero.getText());
                } else {
                    JOptionPane.showMessageDialog(null, "No puede haber campos vacíos.");
                }
            }
        });
        // Añade botón cerrar
        btnCerrar = new JButton("Salir");
        this.add(btnCerrar);
        // Comportamiento del botón Cerrar
        btnCerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }

}