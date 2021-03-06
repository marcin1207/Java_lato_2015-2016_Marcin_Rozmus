
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.BufferedImage;

public class Samochod {

    private double x, y, a; // x,y and angle
    private int w, h; // width and height
    private double next_x, next_y;
    public BufferedImage image;
    public double ac=1.3;
    public boolean move_true = true;

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
        return this.x;
    }
    public boolean get_move_true() {
        return move_true;
    }
    public void set_move_true(boolean move) {
        this.move_true = move;
    }
    public double getY() {
        return this.y;
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

        a = 2*Math.toRadians(aa);
    }
   
    public double returnAcceleration(){
        return ac;
    
    }
    // //forward
    public void moveForward() {
        //next_x += Math.cos(a) * 1.3f;
       // next_y += Math.sin(a) * 1.3f;
      if(move_true){
            x += Math.cos(a)*ac;
            y += Math.sin(a)*ac;
      }
          }
    // //backward

    public void moveBackword() {
       if(move_true){
            x -= Math.cos(a)*ac;
            y -= Math.sin(a)*ac;
       }
    }

    

}
