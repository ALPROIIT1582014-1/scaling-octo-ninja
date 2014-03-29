/**
 * @author Julio Machado, Marcelo Cohen
 */
package pucrs.alpro2;

import java.awt.Graphics2D;

public abstract class FiguraGeometrica {

    private double posX;
    private double posY;

    public FiguraGeometrica(double x, double y) {
        posX = x;
        posY = y;
    }
    
    public abstract void desenhar(Graphics2D g);

    public double getPosX() {
        return posX;
    }

    public double getPosY() {
        return posY;
    }

    public void deslocar(double x, double y) {
        posX += x;
        posY += y;
    }
}
