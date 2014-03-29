package pucrs.alpro2;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

public class Circulo extends FiguraGeometrica {

	private double raio;

	public Circulo(double x, double y, double raio) {
		super(x, y);
		this.raio = raio;
	}

	@Override
	public void desenhar(Graphics2D g) {
		// TODO Auto-generated method stub
		Shape s = new Ellipse2D.Double(getPosX(), getPosY(), raio/2, raio/2);
		g.draw(s);
		
	}

}
