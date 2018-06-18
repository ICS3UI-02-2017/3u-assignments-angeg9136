package game;

import java.awt.BasicStroke;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Rectangle;
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
public class finalAssignment extends JComponent implements ActionListener {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 800;

    //Title of the window
    String title = "Space Operation";

    // sets the framerate and delay for our game
    // this calculates the number of milliseconds per frame
    // you just need to select an approproate framerate
    int desiredFPS = 60;
    int desiredTime = Math.round((1000 / desiredFPS));
    
    // timer used to run the game loop
    // this is what keeps our time running smoothly :)
    Timer gameTimer;
    
    //create int for first enemy
    int enemy1A = 400;
    int enemy1B = 400;
    int enemy1C = 30;
    int enemy1D = 30;
   
    //create int for second enemy
    int enemy2A = 200;
    int enemy2B = 300;
    int enemy2C = 20;
    int enemy2D = 20;
    
    //create int for third enemy
    int enemy3A = 350;
    int enemy3B = 600;
    int enemy3C = 50;
    int enemy3D = 50;
    
    //create int for fourth enemy
    int enemy4A = 200;
    int enemy4B = 150;
    int enemy4C = 40;
    int enemy4D = 40;
    
    //create int for fifth enemy
    int enemy5A = 100;
    int enemy5B = 50;
    int enemy5C = 50;
    int enemy5D = 50;
    
    //create int for sixth enemy
    int enemy6A = 200;
    int enemy6B = 150;
    int enemy6C = 25;
    int enemy6D = 25;
    
    //create int for seventh enemy
    int enemy7A = 50;
    int enemy7B = 150;
    int enemy7C = 25;
    int enemy7D = 25;
    
    //create int for eigth of enemy
    int enemy8A = 500;
    int enemy8B = 720;
    int enemy8C = 60;
    int enemy8D = 60;
    
    //create win box
    int win1 = 0;
    int win2 = 0;
    int win3 = 30;
    int win4 = 30;
    
    //set a purple space sky color for my background
    Color purple = new Color(81, 40, 136);
    //create another color for play again button
    Color play = new Color(0, 0, 102);
    
    //create a small dot for stars
    BasicStroke dot = new BasicStroke(3);
   
    //create a color for the enemies
    Color badguy = new Color(206, 214, 199);
    
    //make the variables for enemies
    Rectangle enemy = new Rectangle(enemy1A, enemy1B, enemy1C, enemy1D);
    Rectangle enemy2 = new Rectangle(enemy2A, enemy2B, enemy2C, enemy2D);
    Rectangle enemy3 = new Rectangle(enemy3A, enemy3B, enemy3C, enemy3D);
    Rectangle enemy4 = new Rectangle(enemy4A, enemy4B, enemy4C, enemy4D);
    Rectangle enemy5 = new Rectangle(enemy5A, enemy5B, enemy5C, enemy5D);
    Rectangle enemy6 = new Rectangle(enemy6A, enemy6B, enemy6C, enemy6D);
    Rectangle enemy7 = new Rectangle(enemy7A, enemy7B, enemy7C, enemy7D);
    Rectangle enemy8 = new Rectangle(enemy8A, enemy8B, enemy8C, enemy8D);
    //make win box
    Rectangle winBox = new Rectangle(win1, win2, win3, win4);
    
    //make integers for the first enemy for bounce off angles and speed
    int enemyAngle = 4;
    int enemySpeed = 7;
    //make integers for the second enemy for bounce off angles and speed
    int enemy2Angle = 90;
    int enemy2Speed = 3;
    //make integers for the third enemy for bounce off angles and speed
    int enemy3Angle = 45;
    int enemy3Speed = 5;
    //make integers for the fourth enemy for bounce off angles and speed
    int enemy4Angle = 45;
    int enemy4Speed = 4;
    //make integers for the fifth enemy for bounce off angles and speed
    int enemy5Angle = 45;
    int enemy5Speed = 2;
    //make integers for the sixth enemy for bounce off angles and speed
    int enemy6Angle = 120;
    int enemy6Speed = 6;
    //make integers for the seventh enemy for bounce off angles and speed
    int enemy7Angle = 83;
    int enemy7Speed = 6;
    //make integers for the eigth enemy for bounce off angles and speed
    int enemy8Angle = 75;
    int enemy8Speed = 5;
    
    //create mouse x and y coords
    int mouseX = 0;
    int mouseY = 0;
   
    //make the kill count
    int kills = 0;
 
    //amount of clicks for game
    int numberOfClicks =0;
    
    //variables for background
    int back1 = 0;
    int back2 = 0;
    int back3 = 2000;
    int back4 = 2000;
    
    //make rectangle that contains background
    Rectangle background = new Rectangle (back1, back2, back3, back4);
    
    // GAME VARIABLES END HERE    
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public finalAssignment(){
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
        
        //new font
        Font big = new Font("Arial", Font.BOLD, 30);
        //font for kill count
        Font score = new Font("Arial", Font.BOLD, 20);
                
        
        //make the background and color it a space theme of purple
        g.setColor(Color.BLACK);
        g.fillRect(back1, back2, back3, back4);
        
        //make some tiny stars in the background
        g.setColor(Color.WHITE);
        //set it to "dot" to make it very small
        g2d.setStroke(dot);
        //draw stars
        g.drawLine(200, 200, 200, 200);
        g.drawLine(550, 550, 550, 550);
        g.drawLine(770, 432, 770, 432);
        g.drawLine(400, 400, 400, 400);
        g.drawLine(105, 105, 105, 105);
        g.drawLine(690, 320, 690, 320);
        g.drawLine(150, 200, 150, 200);
        g.drawLine(200, 700, 200, 700);
        g.drawLine(263, 590, 263, 590);
        g.drawLine(120, 400, 120, 400);
        g.drawLine(533, 106, 533, 106);
        g.drawLine(333, 720, 333, 720);
        g.drawLine(444, 111, 444, 111);
        g.drawLine(259, 777, 259, 777);
        g.drawLine(621, 353, 621, 353);
        
        //set color to the enemy color
        g.setColor(badguy);
        //make the enemies small and big and they are squares
        g.fillRect(enemy.x, enemy.y, enemy.width, enemy.height);
        //multicolored
        g.setColor(purple);
        g.fillRect(enemy2.x, enemy2.y, enemy2.width, enemy2.height);
        g.fillRect(enemy3.x, enemy3.y, enemy3.width, enemy3.height);
        g.fillRect(enemy4.x, enemy4.y, enemy4.width, enemy4.height);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(enemy5.x, enemy5.y, enemy5.width, enemy5.height);
        g.fillRect(enemy6.x, enemy6.y, enemy6.width, enemy6.height);
        g.fillRect(enemy7.x, enemy7.y, enemy7.width, enemy7.height);
        g.fillRect(enemy8.x, enemy8.y, enemy8.width, enemy8.height);
        //change color
        g.setColor(Color.WHITE);
        //set font for kills
        g.setFont(score);
        //make the amount of kills visible
        g.drawString("Kills: " + String.valueOf(kills), WIDTH/2, 100);
        //this is where you can choose to play again if win
        if(kills ==8){
            g.setColor(play);
            g.fillRect(win1, win2, win3, win4);
            g.setColor(Color.WHITE);
            //say they won
            g.setFont(big);
            g.drawString("Congratulations, you win!",250, 400);
            g.drawString("If you want to play again click this button!", 100, 30);
            g.drawString("<----",30, 30);}
        
        //output amount of clicks used
        //smaller font
        g.setFont(score);
        g.drawString("Amount of clicks: " + String.valueOf(numberOfClicks),500,790);
        
        //end of drawing
    
    }
    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here

    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void gameLoop() {
        checkForCollision();
        enemyMove();
        restartGame();
    }

    
    
    private void enemyMove() {
    //these are for when they go off the screen to come back on    
    //make first enemy move at a set speed from the variable enemySpeed
    if(enemy.x >0){
        enemy.x = enemy.x + enemySpeed;}
    //make him come back on the screen if not shot down    
    if(enemy.x >WIDTH){
        //take away the entire width so it looks as if he is circling the screen
        enemy.x = enemy.x -800;}
    
    //make second enemy go at a set speed from the vairable enemy2Speed
    if(enemy2.y >0){
        enemy2.y = enemy2.y +enemy2Speed;}
    //make him come back on the screen if not shot down
    if(enemy2.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy2.y = enemy2.y -800;}
    
    //make third enemy go at a set speed from the vairable enemy3Speed
    if(enemy3.y >0){
        enemy3.y = enemy3.y +enemy3Speed;}
    //make him come back on the screen if not shot down
    if(enemy3.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy3.y = enemy3.y -800;}
    
    //make fourth enemy go at a set speed from the vairable enemy4Speed
    if(enemy4.y >0){
        enemy4.y = enemy4.y +enemy4Speed;}
    //make him come back on the screen if not shot down
    if(enemy4.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy4.y = enemy4.y -800;}
    
    //make fifth enemy go at a set speed from the vairable enemy5Speed
    if(enemy5.y >0){
        enemy5.y = enemy5.y +enemy5Speed;}
    //make him come back on the screen if not shot down
    if(enemy5.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy5.y = enemy5.y -800;}
    
    //make sixth enemy go at a set speed from the vairable enemy6Speed
    if(enemy6.y >0){
        enemy6.y = enemy6.y +enemy6Speed;}
    //make him come back on the screen if not shot down
    if(enemy6.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy6.y = enemy6.y -800;}
    
    //make seventh enemy go at a set speed from the vairable enemy7Speed
    if(enemy7.y >0){
        enemy7.y = enemy7.y +enemy7Speed;}
    //make him come back on the screen if not shot down
    if(enemy7.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy7.y = enemy7.y -800;}
    
    //make eigth enemy go at a set speed from the vairable enemy8Speed
    if(enemy8.y >0){
        enemy8.y = enemy8.y +enemy8Speed;}
    //make him come back on the screen if not shot down
    if(enemy8.y >HEIGHT){
        //take away the entire height so it looks as if he is circling the screen
        enemy8.y = enemy8.y -800;}
    
    //we have what is above and what  is below so that they move in a more random pattern
    //with both they will sometimes bounce off angles and sometimes leave the screen
    
    //create a variable for the angle he will bounce at 
     double newAngle8 = Math.toRadians(enemy8Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy8X = enemy8Speed*Math.cos(newAngle8);
     double enemy8Y = enemy8Speed*Math.sin(newAngle8);
     //move him
     enemy8.x = enemy8.x + (int)enemy8X;
     enemy8.y = enemy8.y + (int)enemy8Y;
     
     //create a variable for the angle he will bounce at 
     double newAngle7 = Math.toRadians(enemy7Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy7X = enemy7Speed*Math.cos(newAngle7);
     double enemy7Y = enemy7Speed*Math.sin(newAngle7);
     //move him
     enemy7.x = enemy7.x + (int)enemy7X;
     enemy7.y = enemy7.y + (int)enemy7Y;
     
    //create a variable for the angle he will bounce at 
     double newAngle6 = Math.toRadians(enemy6Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy6X = enemy6Speed*Math.cos(newAngle6);
     double enemy6Y = enemy6Speed*Math.sin(newAngle6);
     //move him
     enemy6.x = enemy6.x + (int)enemy6X;
     enemy6.y = enemy6.y + (int)enemy6Y;
    
    //create a variable for the angle he will bounce at 
     double newAngle5 = Math.toRadians(enemy5Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy5X = enemy5Speed*Math.cos(newAngle5);
     double enemy5Y = enemy5Speed*Math.sin(newAngle5);
     //move him
     enemy5.x = enemy5.x + (int)enemy5X;
     enemy5.y = enemy5.y + (int)enemy5Y;
     
    //create a variable for the angle he will bounce at
     double newAngle4 = Math.toRadians(enemy4Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy4X = enemy4Speed*Math.cos(newAngle4);
     double enemy4Y = enemy4Speed*Math.sin(newAngle4);
     //move him
     enemy4.x = enemy4.x + (int)enemy4X;
     enemy4.y = enemy4.y + (int)enemy4Y;
     
     //create a variable for the angle he will bounce at 
     double newAngle3 = Math.toRadians(enemy3Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy3X = enemy3Speed*Math.cos(newAngle3);
     double enemy3Y = enemy4Speed*Math.sin(newAngle3);
     //move him
     enemy3.x = enemy3.x + (int)enemy3X;
     enemy3.y = enemy3.y + (int)enemy3Y;
     
     //create a variable for the angle he will bounce at 
     double newAngle2 = Math.toRadians(enemy2Angle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemy2X = enemy2Speed*Math.cos(newAngle2);
     double enemy2Y = enemy2Speed*Math.sin(newAngle2);
     //move him
     enemy2.x = enemy2.x + (int)enemy2X;
     enemy2.y = enemy2.y + (int)enemy2Y;
     
     //create a variable for the angle he will bounce at 
     double newAngle = Math.toRadians(enemyAngle);    
     //make new variables and use trig to calculate how much we are moving him
     double enemyX = enemySpeed*Math.cos(newAngle);
     double enemyY = enemySpeed*Math.sin(newAngle);
     //move him
     enemy.x = enemy.x + (int)enemyX;
     enemy.y = enemy.y + (int)enemyY;
    }
   
    private void checkForCollision() {
        //make enemy8 bounce off bottom or top or side to side
        //top/bottom
        if(enemy8.x < 0){
            enemy8Angle = enemy8Angle +90;}
        if(enemy8.x + enemy8.width > WIDTH){
            enemy8Angle = enemy8Angle +45;}
        //side to side
        if(enemy8.y < 0){
            enemy8Angle = enemy8Angle +45;}
        if(enemy8.y + enemy8.height  >HEIGHT){
            enemy8Angle = enemy8Angle + 45;}
        
        
        //make enemy7 bounce off bottom or top or side to side
        //top/bottom
        if(enemy7.x < 0){
            enemy7Angle = enemy7Angle +45;}
        if(enemy7.x + enemy7.width > WIDTH){
            enemy7Angle = enemy7Angle +45;}
        //side to side
        if(enemy7.y < 0){
            enemy7Angle = enemy7Angle +45;}
        if(enemy7.y + enemy7.height  >HEIGHT){
            enemy7Angle = enemy7Angle + 45;}
        
        
        //make enemy6 bounce off bottom or top or side to side
        //top/bottom
        if(enemy6.x < 0){
            enemy6Angle = enemy6Angle +10;}
        if(enemy6.x + enemy6.width > WIDTH){
            enemy6Angle = enemy6Angle +20;}
        //side to side
        if(enemy6.y < 0){
            enemy6Angle = enemy6Angle +45;}
        if(enemy6.y + enemy6.height  >HEIGHT){
            enemy6Angle = enemy6Angle + 45;}
        
        
        //make enemy5 bounce off bottom or top or side to side
        //top/bottom
        if(enemy5.x < 0){
            enemy5Angle = enemy5Angle +45;}
        if(enemy5.x + enemy5.width > WIDTH){
            enemy5Angle = enemy5Angle +45;}
        //side to side
        if(enemy5.y < 0){
            enemy5Angle = enemy5Angle +45;}
        if(enemy5.y + enemy5.height  >HEIGHT){
            enemy5Angle = enemy5Angle + 45;}
        
        
        //make enemy4 bounce off bottom or top or side to side
        //top/bottom
        if(enemy4.x < 0){
            enemy4Angle = enemy4Angle +45;}
        if(enemy4.x + enemy4.width > WIDTH){
            enemy4Angle = enemy4Angle +45;}
        //side to side
        if(enemy4.y < 0){
            enemy4Angle = enemy4Angle +45;}
        if(enemy4.y + enemy4.height  >HEIGHT){
            enemy4Angle = enemy4Angle + 45;}
        
        
        //make enemy3 bounce off bottom or top or side to side
        //top/bottom
        if(enemy3.x < 0){
            enemy3Angle = enemy3Angle +45;}
        if(enemy3.x + enemy3.width > WIDTH){
            enemy3Angle = enemy3Angle +45;}
        //side to side
        if(enemy3.y < 0){
            enemy3Angle = enemy3Angle +45;}
        if(enemy3.y + enemy3.height  >HEIGHT){
            enemy3Angle = enemy3Angle + 45;}
 
        
        //make enemy2 bounce off bottom or top or side to side
        //top/bottom
        if(enemy2.x < 0){
            enemy2Angle = enemy2Angle +45;}
        if(enemy2.x + enemy2.width > WIDTH){
            enemy2Angle = enemy2Angle +45;}
        //side to side
        if(enemy2.y < 0){
            enemy2Angle = enemy2Angle +45;}
        if(enemy2.y + enemy2.height  >HEIGHT){
            enemy2Angle = enemy2Angle + 45;}
        
        
        //make enemy1 bounce off bottom or top or side to side
        //top/bottom
        if(enemy.x < 0){
            enemyAngle = enemyAngle +45;}
        if(enemy.x + enemy.width > WIDTH){
            enemyAngle = enemyAngle +45;}
        //side to side
        if(enemy.y < 0){
            enemyAngle = enemyAngle +45;}
        if(enemy.y + enemy.height  >HEIGHT){
            enemyAngle = enemyAngle + 45;}
    }
    //restarting game
    private void restartGame() {
        if(numberOfClicks >=20){
              //reset kills
              kills = 0;
              //reset all enemies to dif positions
              enemy.x = 700;
              enemy.y = 400;
              enemy.width = 30;
              enemy.height = 30;
              enemy2.x = 600;
              enemy2.y = 200;
              enemy2.width = 20;
              enemy2.height = 20;
              enemy3.x = 350;
              enemy3.y = 5;
              enemy3.width = 50;
              enemy3.height = 50;
              enemy4.x = 200;
              enemy4.y = 682;
              enemy4.width = 40;
              enemy4.height = 40;
              enemy5.x = 500;
              enemy5.y = 200;
              enemy5.width = 50;
              enemy5.height = 50;
              enemy6.x = 200;
              enemy6.y = 150;
              enemy6.width = 25;
              enemy6.height = 25;
              enemy7.x = 50;
              enemy7.y = 150;
              enemy7.width = 25;
              enemy7.height = 25;
              enemy8.x = 500;
              enemy8.y = 720;
              enemy8.width = 60;
              enemy8.height = 60;
              //set amount of clicks to 0
              numberOfClicks =0;}
    }
        
    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
    
        // if a mouse button has been pressed down
        @Override
        public void mousePressed(MouseEvent e) {
        //get mouse x and y coordinates
        int mouseX = e.getX();
        int mouseY = e.getY();
        
        //hitbox for enemy 1
        if(enemy.contains(mouseX, mouseY)){
            enemy.height = enemy.height -1000;
            kills = kills +1;}
        
        //hitbox for enemy 2
        if(enemy2.contains(mouseX, mouseY)){
            enemy2.height = enemy2.height -1000;
            kills = kills +1;}
        
        //hitbox for enemy 3
        if(enemy3.contains(mouseX, mouseY)){
            enemy3.height = enemy3.height -1000;
            kills = kills +1;}
             
        //hitbox for enemy 4
        if(enemy4.contains(mouseX, mouseY)){
            enemy4.height = enemy4.height -1000;
            kills = kills +1;}
        
        //hitbox for enemy 5
        if(enemy5.contains(mouseX, mouseY)){
            enemy5.height = enemy5.height -1000;
            kills = kills +1;}
        
        //hitbox for enemy 6
        if(enemy6.contains(mouseX, mouseY)){
            enemy6.height = enemy6.height -1000;
            kills = kills +1;}
        
        //hitbox for enemy 7
        if(enemy7.contains(mouseX, mouseY)){
            enemy7.height = enemy7.height -1000;
            kills = kills +1;}
        
        //hitbox for enemy 8
        if(enemy8.contains(mouseX, mouseY)){
            enemy8.height = enemy8.height -1000;
            kills = kills +1;}
        
        //restarting the game
        if(winBox.contains(mouseX, mouseY)){
              //reset kills
              kills = 0;
              //reset all enemies
              enemy.x = 400;
              enemy.y = 400;
              enemy.width = 30;
              enemy.height = 30;
              enemy2.x = 200;
              enemy2.y = 300;
              enemy2.width = 20;
              enemy2.height = 20;
              enemy3.x = 350;
              enemy3.y = 600;
              enemy3.width = 50;
              enemy3.height = 50;
              enemy4.x = 200;
              enemy4.y = 150;
              enemy4.width = 40;
              enemy4.height = 40;
              enemy5.x = 100;
              enemy5.y = 50;
              enemy5.width = 50;
              enemy5.height = 50;
              enemy6.x = 200;
              enemy6.y = 150;
              enemy6.width = 25;
              enemy6.height = 25;
              enemy7.x = 50;
              enemy7.y = 150;
              enemy7.width = 25;
              enemy7.height = 25;
              enemy8.x = 500;
              enemy8.y = 720;
              enemy8.width = 60;
              enemy8.height = 60;
              //set amount of clicks to -1 b/c it takes 1 click to restart game
              numberOfClicks =-1;}
              
              //when mouse is clicked
              if(background.contains(mouseX, mouseY)){
                  numberOfClicks = numberOfClicks + 1;}
              //if amount of clicks exceeds 20
              if(numberOfClicks >20){
                  restartGame();
              }
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
        finalAssignment game = new finalAssignment();
    }
}

