package se.iths.Forelasningar.notes.DemoOOP.Point;

public class Point {
    private float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point copy) {
        copy.x = this.x;
        copy.y = this.y;
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
    public float distanceTo(Point point2){
        return (float) Math.sqrt(Math.pow(point2.x-this.x,2)+Math.pow(point2.y-this.y,2));
    }
}

