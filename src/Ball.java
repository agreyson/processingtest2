import processing.core.PApplet;

public class Ball {

    public Ball(){
        super();
    }

    public void display(){
        PApplet p = Main.getApp();
        p.fill(255);
        p.ellipse(p.width/2, p.height/2, 50, 50);
    }
}
