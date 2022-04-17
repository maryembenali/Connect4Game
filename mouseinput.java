package trial;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class mouseinput implements MouseListener{
	public static Boolean test=false;

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mx=e.getX();
		int my=e.getY();
		if (mx>300 && mx<500) {
			if (my>300 && my<380) {
				test=true;
			}
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
