
package ico.fes.cifrado;

import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class CifradoSwing extends JFrame{
    private JTextArea mensaje;
    private JTextArea cifrado;
    private JTextArea mensaje2;
    private JTextArea descifrado;
    private JTextField recorrer;
    private JTextField recorrer2;
    private JButton boton1;
    private JButton boton2;
    private JLabel texto1;
    private JLabel texto2;
    private JLabel texto3;
    private JLabel texto4;
    private JLabel texto5;
    private JLabel texto6;
    
    
    
    private JPanel panel;
    public CifradoSwing() throws HeadlessException {
        setTitle("Cifrado Cesar");
        setSize(680, 700);
        setLocationRelativeTo(null);
        
        
        panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        texto1 = new JLabel("Ingrese la cantidad de desplazamiento");
        texto1.setBounds(10, 10, 220, 20);
        panel.add(texto1);
        
        texto2 = new JLabel("Ingrese un mensaje:");
        texto2.setBounds(10, 30, 200, 20);
        panel.add(texto2);
        
        texto3 = new JLabel("Mensaje cifrado:");
        texto3.setBounds(280, 30, 200, 20);
        panel.add(texto3);
        
        recorrer = new JTextField();
        recorrer.setBounds(230, 10, 30, 20);
        panel.add(recorrer);
        
        boton1 = new JButton("Cifrar");
        boton1.setBounds(550, 120, 75, 20);
        panel.add(boton1);
        
        mensaje = new JTextArea();
        mensaje.setBounds(10, 55, 255, 255);
        panel.add(mensaje);
        
        cifrado = new JTextArea();
        cifrado.setBounds(280, 55, 255, 255);
        panel.add(cifrado);
        
        texto4 = new JLabel("Ingrese la cantidad de desplazamiento");
        texto4.setBounds(10, 320, 220, 20);
        panel.add(texto4);
        
        texto5 = new JLabel("Ingrese un mensaje cifrado:");
        texto5.setBounds(10, 340, 200, 20);
        panel.add(texto5);
        
        texto6 = new JLabel("Mensaje descifrado:");
        texto6.setBounds(280, 340, 200, 20);
        panel.add(texto6);
        
        recorrer2 = new JTextField();
        recorrer2.setBounds(230, 320, 30, 20);
        panel.add(recorrer2);
        
        mensaje2 = new JTextArea();
        mensaje2.setBounds(10, 365, 255, 255);
        panel.add(mensaje2);
        
        descifrado = new JTextArea();
        descifrado.setBounds(280, 365, 255, 255);
        panel.add(descifrado);
        
        boton2 = new JButton("Descifrar");
        boton2.setBounds(550, 390, 90, 20);
        panel.add(boton2);
        
        
        
        setVisible(true);
        
        
        
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        
        this.boton1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "abcdefghijklmnñopqrstuvwxyz";
                String textoCodificado = "";
                char caracter;
               try {
                int nDesplazamiento = Integer.parseInt(recorrer.getText());
                
                for (int i = 0; i < mensaje.getText().length(); i++) {
                    caracter = mensaje.getText().charAt(i);
                    int posicion = letras.indexOf(caracter);
                    
                    if (posicion == -1) {
                        textoCodificado += caracter;
                    } else {
                        textoCodificado += letras.charAt((posicion + nDesplazamiento)
                                % letras.length());
                        
                    }
                    
                }
                
                
                
                cifrado.setText(textoCodificado);
            } catch (NumberFormatException ie) {
                JOptionPane.showMessageDialog(null,"Introduce un valor númerico "
                        + "entero en la cantidad de desplazamientos",
                          "Error de captura", JOptionPane.ERROR_MESSAGE);
            }
            }
            
        });
        
        
        
        this.boton2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String letras = "abcdefghijklmnñopqrstuvwxyz";
                
                String textoDescodificado = "";
                char caracter;
               try {
                int nDesplazamiento = Integer.parseInt(recorrer2.getText());
                
                for (int i = 0; i < mensaje2.getText().length(); i++) {
                    caracter = mensaje2.getText().charAt(i);
                    int posicion = letras.indexOf(caracter);
                    
                    if (posicion == -1) {
                        textoDescodificado += caracter;
                    } else {
                        if ((posicion - nDesplazamiento) < 0) {
                            textoDescodificado += letras.charAt(letras.length() +
                                    (posicion - nDesplazamiento));
                        } else{
                        textoDescodificado += letras.charAt((posicion - nDesplazamiento)
                                % letras.length());
                        }
                        
                    }
                }
                
                descifrado.setText(textoDescodificado);
            } catch (NumberFormatException ie) {
                JOptionPane.showMessageDialog(null,"Introduce un valor númerico "
                        + "entero en la cantidad de desplazamientos",
                          "Error de captura", JOptionPane.ERROR_MESSAGE);
            }
            }
            
        });
    }
    
    
}
