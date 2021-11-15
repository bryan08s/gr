package grafos;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;
import javax.swing.JPanel;
/**
 *
 * @author Bryan Saim
 */
public class Lienzo extends JPanel implements MouseListener{
     private Vector<Nodo> vectorNodos;
    
    public Lienzo(){
        this.vectorNodos=new Vector<>();
        this.addMouseListener(this);
    }
    
    @Override
    public void paint(Graphics g){
        for(Nodo nodos: vectorNodos){
            nodos.Pintar(g);
        }
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getButton() == MouseEvent.BUTTON1){
            this.vectorNodos.add(new Nodo(e.getX(), e.getY()));
            repaint();
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {
        
    }

    @Override
    public void mouseExited(MouseEvent me) {
        
    }
    
    
}
