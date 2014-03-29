package pucrs.alpro2;

/**
 * @author Julio Machado, Marcelo Cohen
 */
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;

public class PainelDesenho extends JComponent {

    private ArrayList<FiguraGeometrica> objetos;

    public PainelDesenho() {
        super();
        this.addMouseListener(new EventosMouse());
        objetos = new ArrayList<FiguraGeometrica>();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (FiguraGeometrica d : objetos) {
            d.desenhar(g2);
        }
    }
    
    private class EventosMouse extends MouseAdapter
    {
    	public void mousePressed(MouseEvent event) {
            Point2D pontoTela = event.getPoint();
            double larg = 100;
            double alt = 20;
            double cx = pontoTela.getX() - larg / 2.0;
            double cy = pontoTela.getY() - alt / 2.0;
            Retangulo retangulo = new Retangulo(cx, cy, larg, alt);
            objetos.add(retangulo);
            repaint();
        }
    }
}
