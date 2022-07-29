import java.awt.*;
import java.awt.event.*;

public class Pala extends Rectangle{

	int id;
	int yVelocidad;
	Pala(int x,int y,int ANCHURA_PALA,int ALTURA_PALA,int id)
	{
		super(x,y,ANCHURA_PALA,ALTURA_PALA);
		this.id = id;
	}

	public void teclaMantenida(KeyEvent e)
	{

	}

	public void keyPressed(KeyEvent e)
	{

	}

	public void keyRelease(KeyEvent e)
	{

	}

	public void setYDirection(int yDirection)
	{

	}

	public void mover() {

	}

	public void dibujar(Graphics g)
	{
		if(id==1)
		{
			g.setColor(Color.BLUE);
		}
		else
		{
			g.setColor(Color.red);
		}
		g.fillRect(x, y, width, height);
	}


}
