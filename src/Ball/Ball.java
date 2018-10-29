package Ball;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float deltaX;
    private float deltaY;

    public Ball(float x, float y, int radius, int speed, int direction){
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.deltaX = speed*(float)Math.cos(direction);
        this.deltaY = -speed*(float)Math.sin(direction);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getDeltaX() {
        return deltaX;
    }

    public void setDeltaX(float deltaX) {
        this.deltaX = deltaX;
    }

    public float getDeltaY() {
        return deltaY;
    }

    public void setDeltaY(float deltaY) {
        this.deltaY = deltaY;
    }

    public void move(){
        this.x+=deltaX;
        this.y+=deltaY;
    }

    public void reflectHorizontal(){
        this.deltaX=-this.deltaX;
    }

    public void reflectVertical(){
        this.deltaY=-this.deltaY;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "(" + x +
                "," + y +
                "), speed(" + deltaX +
                "," + deltaY +
                ")}";
    }
}
