package game.altamash.snake;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
class Key_Control extends KeyAdapter
{
	public void keyPressed(KeyEvent e)
	{
		int key=e.getKeyCode();
		if(key==KeyEvent.VK_RIGHT && !Game_Screen.moveLeft)
		{
			Game_Screen.moveUp=false;
			Game_Screen.moveDown=false;
			Game_Screen.moveRight=true;
		}
		if(key==KeyEvent.VK_LEFT && !Game_Screen.moveRight)
		{
			Game_Screen.moveUp=false;
			Game_Screen.moveDown=false;
			Game_Screen.moveLeft=true;
		}
		if(key==KeyEvent.VK_UP && !Game_Screen.moveDown)
		{
			Game_Screen.moveUp=true;
			Game_Screen.moveLeft=false;
			Game_Screen.moveRight=false;
		}
		if(key==KeyEvent.VK_DOWN && !Game_Screen.moveUp)
		{
			Game_Screen.moveDown=true;
			Game_Screen.moveLeft=false;
			Game_Screen.moveRight=false;
		}
	}
}