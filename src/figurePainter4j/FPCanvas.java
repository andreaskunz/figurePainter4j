package figurePainter4j;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;

import javax.swing.JComponent;

public class FPCanvas extends JComponent {
	private static final long serialVersionUID = -296696660741838653L;

	private Dimension dimension;
	private Image image;
	private Graphics2D graphic;
	private Color backgroundColor;
	
	public FPCanvas(Dimension dimension, Color backgroundColor) {
		this.dimension = dimension;
		this.backgroundColor = backgroundColor;
	}	
	
	
	public void initialize() {
		this.setSize(dimension);
		image = this.createImage(dimension.width, dimension.height);
		graphic = (Graphics2D) image.getGraphics();
		graphic.setColor(backgroundColor);
		graphic.fillRect(0, 0, dimension.width, dimension.height);
	}
	
	
	public void paintFigure(IFPFigure figure) {
		if (figure instanceof Shape) { // check if it is save to cast. 
			Color original = graphic.getColor();
			graphic.setColor(figure.getColor());
			if (figure.paintFilled()) {
				graphic.draw((Shape) figure);
			
			}else {
				graphic.fill((Shape) figure);
			}
			graphic.setColor(original);
			this.repaint();
		}
	}
	
	
	public void delete() {
		Color original = graphic.getColor();
		graphic.setColor(backgroundColor);
		graphic.fill(new Rectangle(0, 0, dimension.width, dimension.height));
		graphic.setColor(original);
		this.repaint();
	}
	
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, null);
	}
}
