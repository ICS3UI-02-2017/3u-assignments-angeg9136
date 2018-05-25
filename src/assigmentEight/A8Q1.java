package assigmentEight;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import javax.swing.Timer;

/**
 *
 * @author angeg9136
 */
public class A8Q1 extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;

    //Title of the window
    String title = "a hand some boy";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    
    //make peach color for the mouth
    Color peach = new Color(255, 204, 153);
    //make brown color for the hair
    Color brown = new Color(102, 51, 0);
    //make sun ray color
    Color sunray = new Color(255, 153, 0);
    //make a dark green color for the grass
    Color grass = new Color(0, 102, 0);
    //make the background sky a nice color
    Color sky = new Color(0, 153, 255);
    
    
    
    //make thicker lines for sun rays
    BasicStroke thickerLine = new BasicStroke(15);
    //make a normal line for hair
    BasicStroke normal = new BasicStroke(3);
    
    //make a variable to store eyebrows to move up and down
    int eyebrow = 180;
    int eyebrow2 = 180;
    
    //make a variable to store mouth to move side to side
    int mouth = 400;
    
    //make a variable for his hair so it can move back & fourth
    int hair = 300;
    
      

    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public A8Q1(){
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();
        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
        
        gameTimer = new Timer(desiredTime,this);
        gameTimer.setRepeats(true);
        gameTimer.start();
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        //make a nice sky in the background
        g.setColor(sky);
        g.fillRect(1, 2, 6000, 10000);
        
        //make the face and color it grey
        g.setColor(Color.gray);
        g.fillOval(300, 100, 300, 350);
        
        //make eyes colored blue
        g.setColor(Color.BLUE);
        g.fillOval(380, 200, 50, 20);
        g.setColor(Color.BLUE);
        g.fillOval(500, 200, 50, 20);
        
        //add pupils
        g.setColor(Color.WHITE);
        g.fillOval(515, 205, 10, 5);
        g.fillOval(395, 210, 11, 4);
        
        //add eyebrows and make them black
        g.setColor(Color.BLACK);
        g.fillArc(360,eyebrow,50,20,30,180);
        g.fillArc(515, eyebrow2, 50, 20, 30, 180);
        
        //make a nose
        g.setColor(Color.CYAN);
        g.fillArc(450, 250, 80, 20, 50, 150);
        
        //make the sun
        g.setColor(sunray);
        g.fillArc(1,1,200,200,450,450);
        
        //make mouth
        g.setColor(peach);
        g.fillArc(mouth, 280, 200, 50, 180, 90);
        
        //make some radical hair
        g.setColor(brown);
        g.fillRect(300, 100, 300, 50);
        
        //make sun rays
        //color them orange ish
        g2d.setColor(sunray);
        g2d.setStroke(thickerLine);
        g.drawLine(100,100, 270,20);
        g2d.setStroke(thickerLine);
        g.drawLine(100,100, 260, 200);
        g2d.setStroke(thickerLine);
        g.drawLine(70,20, 150, 250);
        g2d.setStroke(thickerLine);
        g.drawLine(50,60, 50, 250);
        
        //make some strands of hair outside the big patch of hair
        g2d.setColor(brown);
        g2d.setStroke(normal);
        //(xy, xy)
        g.drawLine(500,110,400,200);
        g.drawLine(500,110,350,hair);
        
       
        
           
     
        
        
		
		
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        //make a strand of hair move back and forth
        hair = hair + 1;
        //if the strand of hair is greater than 370 then make it reset and go back up 
        //slightly, makingi it a back and fourth motion
        if(hair > 370){
                hair = hair -80;}
        
        //make him raise his left eyebrow up and down
        eyebrow = eyebrow + 1;
        if(eyebrow >185){
            eyebrow = eyebrow -20;}
        //make him raise his right eyebrow up and down
        eyebrow2 = eyebrow2 + 1;
        if(eyebrow2 >185){
            eyebrow2 = eyebrow2 -20;}
        
        //make him move his mouth side to side
        mouth = mouth +2;
        if(mouth >425){
            mouth = mouth -30;
        }
            
        }
      
       
        
        
    

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {

        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {

        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {

        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {

        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {

        // if a key has been pressed down
        @Override
        public void keyPressed(KeyEvent e) {

        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {

        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        preSetup();
        gameLoop();
        repaint();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        A8Q1 game = new A8Q1();
    }
}

