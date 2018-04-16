package figurePainter4j;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Rectangle;

public class FPRectangle extends Rectangle implements IFPFigure{
	private static final long serialVersionUID = 4201974569879739645L;

	private Color color;
	private boolean filled;
	
	public FPRectangle(Point position, Dimension dimension, Color color, boolean filled) {
		super(position, dimension);
		this.color = color;
		this.filled = filled;
	}
	
	public FPRectangle(Point position, Dimension dimension, Color color) {
		this(position, dimension, color, false);
	}
	
	public Color getColor() {
		return this.color;
	}
	
	public boolean paintFilled() {
		return this.filled;
	}
	
	public void setColor(Color color) {
		this.color =color;
	}
}
