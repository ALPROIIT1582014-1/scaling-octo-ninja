/**
 * A classe <code>FiguraGeometrica</code>
 * 
 * @author Julio Machado, Marcelo Cohen
 * @author marco.mangan@pucrs.br
 */
package pucrs.alpro2;

import java.awt.Graphics2D;

public abstract class FiguraGeometrica {

	private double posX;
	private double posY;

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public FiguraGeometrica(double x, double y) {
		posX = x;
		posY = y;
	}

	/**
	 * 
	 * @param g
	 */
	public abstract void desenhar(Graphics2D g);

	/**
	 * 
	 * @return
	 */
	public double getPosX() {
		return posX;
	}

	/**
	 * 
	 * @return
	 */
	public double getPosY() {
		return posY;
	}

	/**
	 * 
	 * @param x
	 * @param y
	 */
	public void deslocar(double x, double y) {
		posX += x;
		posY += y;
	}
}
