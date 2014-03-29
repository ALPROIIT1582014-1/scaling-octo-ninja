/**
 * @author Julio Machado
 */
package pucrs.alpro2;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class Retangulo extends FiguraGeometrica {

    private double largura;
    private double altura;

    public Retangulo(double x, double y, double l, double a) {
        super(x, y);
        largura = l;
        altura = a;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void desenhar(Graphics2D g2) {
        Rectangle2D.Double retangulo = new Rectangle2D.Double(this.getPosX(), this.getPosY(), largura, altura);
        g2.draw(retangulo);
    }
}
