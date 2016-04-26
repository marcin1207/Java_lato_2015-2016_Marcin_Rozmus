
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class Samochod {

    private double x, y, a; // x,y and angle
    private int w, h; // width and height
    private double next_x, next_y;
    public BufferedImage image;
    public double ac;

    // constructor
    public Samochod(double x, double y, double a, int w, int h) {

        this.x = x;
        this.y = y;
        this.a = a;
        this.w = w;
        this.h = h;
        
        
    }

    // returning all the necessary value of this class
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setX(double xx) {
       this.x = xx;
    }

    public void setY(double yy) {
        this.y = yy;
    }

    public double getA() {
        return a;
    }

    public int getW() {
        return w;
    }

    public int getH() {
        return h;
    }

    // setting the angle
    public void setA(int aa) {

        a = Math.toRadians(aa);
    }
    public void setAcceleration(){
        ac=0.65;
    
    }
    public void returnAcceleration(){
        ac=1.3;
    
    }

    // move toward the angle
    // //forward
    public void moveForward() {
        //next_x += Math.cos(a) * 1.3f;
       // next_y += Math.sin(a) * 1.3f;
       
            x += Math.cos(a) * ac;
            y += Math.sin(a) * ac;
      
    }
    // //backward

    public void moveBackword() {
       // next_x -= Math.cos(a) * 1.3f;
        //next_y -= Math.sin(a) * 1.3f;
       
            x -= Math.cos(a) * ac;
            y -= Math.sin(a) * ac;
        
    }

    

}
