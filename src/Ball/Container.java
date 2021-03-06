package Ball;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height){
        this.x1=x;
        this.y1=y;
        this.x2=x+width;
        this.y2=y-height;
    }
    public int getX(){
        return x1;
    }
    public int getY(){
        return y1;
    }
    public int getWidth(){
        return x2-x1;
    }
    public int getHeight(){
        return y1-y2;
    }

    public boolean colladesWidth(Ball ball){
        if (ball.getX()+ball.getRadius() >= x2 || ball.getX()-ball.getRadius() <= x1)
            return true;
        return false;
    }

    public boolean colladesHeight(Ball ball){
        if((ball.getY()+ball.getRadius() >= y1) || (ball.getY()-ball.getRadius() <= y2))
            return true;
        return false;
    }
}
