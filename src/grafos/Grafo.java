package grafos;

import javax.swing.JFrame;

/**
 *
 * @author Bryan Saim
 */
public class Grafo {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Grafo");
        ventana.add(new Lienzo());
        ventana.setSize(600,600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    
}
