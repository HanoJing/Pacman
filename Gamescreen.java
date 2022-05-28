import javax.swing.*;
import java.awt.*;

public class Gamescreen extends JPanel{

	private KeyboardFocusManager manager;
		
	private Spielfigur pacMan;
	
	// 0 -> barrier, 1 -> left border, 2 -> top border, 4 -> right border, 8 -> bottom border, 16 -> dots
	
	private int levelData[] = {
	    	
			19, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 22, 
	        17, 16, 16, 16, 16, 24, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        25, 24, 24, 24, 28, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        0,  0,  0,  0,  0,  0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        19, 18, 18, 18, 18, 18, 16, 16, 16, 16, 24, 24, 24, 24, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0,  0,  0,  0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0,  0,  0,  0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 24, 16, 16, 16, 16, 20, 0,  0,  0,  0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 20, 0, 17, 16, 16, 16, 16, 18, 18, 18, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 24, 24, 28, 0, 25, 24, 24, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        21, 0,  0,  0,  0,  0,  0,  0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 18, 18, 22, 0, 19, 18, 18, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,                            	        
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,	                                                                                                   
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20, 
	        17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
	        25, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 24, 28
	    };
	
    private int blockSize = 24;
    private int dotSize = 4;
  	private int anzBlocks = 28;
	private int mapSize = anzBlocks * blockSize;
		
	public Gamescreen(Frame f){
    	
    	this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    	this.manager.addKeyEventDispatcher(new KeyDispatcher(f, this));
    	   	
    	pacMan = new Spielfigur(200,200,30,30,380,300, Color.YELLOW);
    	
    }

    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	g.setColor(Color.BLACK);
    	g.fillRect(-1,-1, 1200, 730);
    	
    	drawMap(g);
      
    	pacMan.showSpielfigur(g);
    	
    }

	public Spielfigur getPacMan() {
		return pacMan;
	}
	
    public void drawMap(Graphics g) {
		
		int i = 0;
				
		 for(int y = 10; y < mapSize; y+=blockSize) {
			 for(int x = 10; x < mapSize; x+=blockSize) {
				 
				 g.setColor(Color.BLUE);
				 ((Graphics2D)g).setStroke(new BasicStroke(2));
				
		 		if(levelData[i] == 0) {                    // 0 -> barrier 
					g.drawRect(x, y, blockSize, blockSize);
				}
				 
		 		if((levelData[i] & 1) != 0){              // 1 -> left border 
		 			g.drawLine(x, y, x, y+blockSize-1);
		 		}
		 		
		 		if((levelData[i] & 2) != 0) {             // 2 -> top border
		 			g.drawLine(x, y, x+blockSize-1, y);
		 		}
		 		if ((levelData[i] & 4) != 0) {            // 4 -> right border
                    g.drawLine(x + blockSize - 1, y, x + blockSize - 1,
                            y + blockSize - 1);
                }

                if ((levelData[i] & 8) != 0) {            // 8 -> bottom border
                    g.drawLine(x, y + blockSize - 1, x + blockSize - 1, y + blockSize - 1);
                } 

                if ((levelData[i] & 16) != 0) {           // 16 -> dots
                    g.setColor(Color.WHITE);
                    g.fillOval(x + 10, y + 10, dotSize, dotSize);
                }
							
				 i++;
				
			}
			
		}
    }

     
     
     
     
}