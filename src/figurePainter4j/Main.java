package figurePainter4j;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;


//TODO make a nice example

public class Main {

	public static void main(String[] args) {
		Dimension dimension = new Dimension(1920, 1080);
		FPCanvas canvas = new FPCanvas(dimension, Color.BLACK);
		FPJFrame frame = new FPJFrame(canvas, dimension);
		canvas.initialize();
		FPRectangle rectangle1 = new FPRectangle(new Point(0, 500), new Dimension(1920,50), Color.WHITE);
		//FPRectangle rectangle2 = new FPRectangle(new Point(150, 250), new Dimension(100,200), Color.GREEN, true);
		
		canvas.paintFigure(rectangle1);
		//canvas.paintFigure(rectangle2);
		//canvas.repaint();
		
		//Zeichnung z = new Zeichnung();
		// z.zeichne();
		 try {
			Thread.sleep(1000);
			System.out.println(rectangle1.getLocation());
			rectangle1.setLocation(new Point(0, 600));
			System.out.println(rectangle1.getLocation());
			rectangle1.setSize(new Dimension(1920, 100));
			canvas.delete();
			frame.setTitle("new Title");
			canvas.paintFigure(rectangle1);
			//canvas.repaint();
			//z.inSchwarzWeissAendern();
			Thread.sleep(1000);
			canvas.delete();
			//canvas.repaint();
			//z.inFarbeAendern();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
}
