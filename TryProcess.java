import processing.core.PApplet;

public class TryProcess extends PApplet {

    public static void main(String[] args) {
        PApplet.main("TryProcess", args);
    }

    int x = 0;

    @Override
    public void settings() {
        super.settings();
        size(640, 480);
    }

    @Override
    public void setup() {
        super.setup();
    }
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;
    @Override
    public void draw() {
        ellipse(x1,96,10,10);
        ellipse(x2,96*2,10,10);
        ellipse(x3,96*3,10,10);
        ellipse(x4,96*4,10,10);
        x1=x1+1;
        x2=x2+2;
        x3=x3+3;
        x4=x4+4;
    }
}