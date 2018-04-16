package figurePainter4j;

import java.awt.Dimension;
import javax.swing.JFrame;

public class FPJFrame extends JFrame {
	private static final long serialVersionUID = -1283063105125289793L;

	public FPJFrame(FPCanvas canvas, Dimension dimension) {
		this.setContentPane(canvas);
		this.setTitle("DUMMY");
		this.setPreferredSize(dimension);
		//this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setUndecorated(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.pack();
	}	
}
