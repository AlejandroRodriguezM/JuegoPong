import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MarcoJuego extends JFrame{

	PanelJuego panel;

	MarcoJuego()
	{
		panel = new PanelJuego();
		this.add(panel);
		this.setTitle("Juego pong");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
