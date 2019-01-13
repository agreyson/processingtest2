import processing.core.PApplet;

public class Main extends PApplet {
    private Ball ball;
    private static PApplet app;

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public Main(){
        super();
        ball = new Ball();
        app = this;
    }

    public static PApplet getApp(){
        return app;
    }

    public void settings(){
        size(300,300);
    }

    public void setup(){
    }

    public void draw(){
        background(120,50,240);
        ball.display();
    }
}
