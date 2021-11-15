package grafos;
import java.awt.Graphics;

/**
 *
 * @author Bryan Saim
 */
public class Nodo {
    private int x,y;
    private static final int d=60;

    public Nodo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void Pintar(Graphics g){
        g.drawOval(this.x - d/2, this.y - d/2, d, d);
    }
}
