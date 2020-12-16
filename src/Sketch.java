
/** MAKE SURE TO READ THE README CAREFULLY BEFORE YOU BEGIN EDITING THIS CODE */
import processing.core.PApplet;

public class Sketch extends PApplet {

    /*
     * SUMMATIVE REQUIRED Declare at least four balls, four bubbles, and four
     * snowflakes as instance variables. I have made the first ball for you.
     * 
     * SUMMATIVE OPTIONAL Use *arrays* to store the elements, rather than individual
     * variables.
     */

    Ball b1;
    Ball b2;
    Ball b3;
    Ball b4;
    Bubble bl1;
    Bubble bl2;
    Bubble bl3;
    Bubble bl4;
    Snowflake s1;
    Snowflake s2;
    Snowflake s3;
    Snowflake s4;

    public void settings() {
        size(500, 500);
    }

    /*
     * SUMMATIVE REQUIRED Initialize the balls, bubbles, and snowflakes using your
     * constructors inside of setup(). You must use a non-default-constructor at
     * least once and a default constructor at least once for each type.
     * 
     * I have done the first ball for you.
     */
    public void setup() {
        frameRate(30);
        b1 = new Ball(this);
        b2 = new Ball(this);
        b3 = new Ball(this);
        b4 = new Ball(this, 244, 150, 25, color(221, 102, 15), 20, 15);
        bl1 = new Bubble(this);
        bl2 = new Bubble(this);
        bl3 = new Bubble(this, 240, 70, -8, -12, 85, color(140, 10, 233));
        bl4 = new Bubble(this);
        s1 = new Snowflake(this, 12, 30, 30, 130, 232, color(78, 241, 10));
        s2 = new Snowflake(this);
        s3 = new Snowflake(this);
        s4 = new Snowflake(this);
    }

    public void draw() {
        background(100);

        /* SUMMATIVE REQUIRED Draw and move all balls, snowflakes, and bubbles */
        b1.drawBall();
        b1.moveBall();
        b2.drawBall();
        b2.moveBall();
        b3.drawBall();
        b3.moveBall();
        b4.drawBall();
        b4.moveBall();
        bl1.moveBubble();
        bl1.drawBubble();
        bl2.moveBubble();
        bl2.drawBubble();
        bl3.moveBubble();
        bl3.drawBubble();
        bl4.moveBubble();
        bl4.drawBubble();
        s1.moveSnowflake();
        s1.drawSnowflake();
        s2.moveSnowflake();
        s2.drawSnowflake();
        s3.moveSnowflake();
        s3.drawSnowflake();
        s4.moveSnowflake();
        s4.drawSnowflake();
    }

    /**
     * Convenience method to return a random color
     * 
     * @param transluscent if true, make the color transluscent, otherwise solid
     */
    public int randomColor(boolean transluscent) {
        int alpha;
        if (transluscent) {
            alpha = 125;
        } else {
            alpha = 255;
        }
        return color(random(0, 255), random(0, 255), random(0, 255), alpha);
    }

    /*
     * SUMMATIVE OPTIONAL Add a void method called mousePressed() that stops some or
     * all of the balls from moving when you click the mouse. (it will run
     * automatically when you click if the name is correct)
     * 
     * EXTRA CHALLENGE - can you make it so that only the ball you actually CLICKED
     * stops? (this is a major challenge - you can use the variables mouseX and
     * mouseY to see where the mouse was clicked.)
     */

    public static void main(String[] args) {
        PApplet.main("Sketch");
    }
}
