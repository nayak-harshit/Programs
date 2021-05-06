package Snake;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;


import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {

	static final int ScreenWidth = 600;
	static final int ScreenHeight = 600;
	static final int UnitSize = 25;
	static final int GameUnits = (ScreenWidth*ScreenHeight)/UnitSize;
	static final int delay = 75;
	final int x[] = new int[GameUnits];
	final int y[] = new int[GameUnits];
	int bodyParts = 6;
	int appleEaten,appleX, appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	GamePanel(){
		random = new Random();
		this.setPreferredSize(new Dimension(ScreenWidth,ScreenHeight));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
	}
	
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(delay,this);
		timer.start();
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		if(running) {
			/*for(int i=0; i<ScreenHeight/UnitSize; i++) {
				g.drawLine(i*UnitSize, 0, i*UnitSize, ScreenHeight);
				g.drawLine(0, i*UnitSize, ScreenWidth, i*UnitSize);
			}*/
			g.setColor(Color.red);
			g.fillOval(appleX,appleY,UnitSize,UnitSize);
		
			for(int i =0; i<bodyParts; i++) {
				if(i==0) {
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UnitSize, UnitSize);
				}
				else {
					g.setColor(new Color(45,180,0));
					//g.setColor(new Color(random.nextInt(255),random.nextInt(255),random.nextInt(255)));// for random colors...
					g.fillRect(x[i], y[i], UnitSize, UnitSize);
				}
			}
			g.setColor(Color.red);
			g.setFont(new Font("Ink Free", Font.BOLD, 40));
			FontMetrics metrices = getFontMetrics(g.getFont());
			g.drawString("Score: "+appleEaten, (ScreenWidth- metrices.stringWidth("Score: "+appleEaten))/2, g.getFont().getSize());
			
		}
		else {
			gameOver(g);
		}
	}
	
	public void move() {
		for(int i =bodyParts; i>0; i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		
		switch(direction) {
		case 'U' :
			y[0] = y[0]-UnitSize;
			break;
		case 'D' :
			y[0] = y[0]+UnitSize;
			break;
		case 'L' :
			x[0] = x[0]-UnitSize;
			break;	
		case 'R' :
			x[0] = x[0]+UnitSize;
			break;
		}
		
	}
	
	public void newApple() {
		appleX =random.nextInt((int)(ScreenWidth/UnitSize))*UnitSize;
		appleY =random.nextInt((int)(ScreenHeight/UnitSize))*UnitSize;
		
	}
	public void checkApple() {
		if((x[0] == appleX)&& (y[0] == appleY)) {
			bodyParts++;
			appleEaten++;
			newApple();	
		}
	}
	
	public void checkCollisions() {
		// collision for body
		for(int i =bodyParts; i>0; i--) {
			if((x[0] == x[i])&&(y[0]==y[i])) {
				running = false;
			}
		}
		// collision for left border
		if(x[0]<0) {
			running = false;
		}
		// collision for right border
		if(x[0]>ScreenWidth) {
			running = false;
		}
		// collision for top border
		if(y[0]<0) {
			running = false;
		}
		// collision for bottom border
		if(y[0]> ScreenHeight) {
			running = false;
		}
		
		if(!running) {
			timer.stop();
		}
	}
	
	public void gameOver(Graphics g) {
		//game over
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 75));
		FontMetrics metrices = getFontMetrics(g.getFont());
		g.drawString("Game Over!!", (ScreenWidth- metrices.stringWidth("Game Over!!"))/2, ScreenHeight/2);
		
		//score
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free", Font.BOLD, 40));
		FontMetrics metrices2 = getFontMetrics(g.getFont());
		g.drawString("Score: "+appleEaten, (ScreenWidth- metrices2.stringWidth("Score: "+appleEaten))/2, g.getFont().getSize());
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(running) {
			move();
			checkApple();
			checkCollisions();
			
		}
		repaint();
		
		
	}
	
	public class MyKeyAdapter extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
				
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
				
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
				
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}

}
