import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JPanel;

public class PanelJuego extends JPanel implements Runnable{

	static final int ANCHURA_JUEGO = 1200;
	static final int ALTURA_JUEGO = (int)(ANCHURA_JUEGO * (0.5555));
	static final Dimension TAMANIO_PANTALLA = new Dimension(ANCHURA_JUEGO,ALTURA_JUEGO);
	static final int DIAMETRO_BOLA = 20;
	static final int ANCHURA_PALA = 25;
	static final int ALTURA_PALA = 100;
	Thread hiloJuego;
	Image imagen;
	Graphics graficos;
	Random aleatorio;
	Pala pala1;
	Pala pala2;
	Bola bola;
	Puntuacion puntuacion;

	PanelJuego()
	{
		nuevaPala();
		bolaNueva();
		puntuacion = new Puntuacion(ANCHURA_JUEGO,ALTURA_JUEGO);
		this.setFocusable(true);
		this.addKeyListener(new AL());
		this.setPreferredSize(TAMANIO_PANTALLA);

		hiloJuego = new Thread(this);
		hiloJuego.start();

	}

	public void bolaNueva()
	{

	}

	public void nuevaPala()
	{
		pala1 = new Pala(0,(ANCHURA_JUEGO/2) - (ALTURA_PALA/2),ANCHURA_PALA,ALTURA_PALA,1);
		pala2 = new Pala(ANCHURA_JUEGO-ANCHURA_PALA,(ANCHURA_JUEGO/2) - (ALTURA_PALA/2),ANCHURA_PALA,ALTURA_PALA,2);

	}

	public void pintar(Graphics g)
	{
		imagen = createImage(getWidth(),getHeight());
		graficos = imagen.getGraphics();
		dibujar(graficos);
		g.drawImage(imagen,0,0,this);

	}

	public void dibujar(Graphics g)
	{
		pala1.dibujar(g);
		pala2.dibujar(g);

	}

	public void mover()
	{

	}

	public void comprobarColision()
	{

	}

	@Override
	public void run()
	{
		long ultimoMomento = System.nanoTime();
		double totalTics = 60.0;
		double ns = 1000000000 / totalTics;
		double delta = 0;

		while(true)
		{
			long ahora = System.nanoTime();
			delta += (ahora - ultimoMomento)/ns;
			ultimoMomento = ahora;

			if(delta >= 1)
			{
				mover();
				comprobarColision();
				repaint();
				delta--;
			}
		}


	}

	public class AL extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e)
		{

		}
		public void keyRelease(KeyEvent e)
		{

		}
	}

}
