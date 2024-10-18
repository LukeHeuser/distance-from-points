public class Point {

    private int x;
    private int y;

    public Point() {

    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(int x, int y) { // Instance method that finds the points between two objects of type Point
        double distance = ((this.x-x) * (this.x-x)) + ((this.y-y) * (this.y-y));
        return Math.sqrt(distance);

    }

    public double distance(Point a) { // Gets the data points from an instance, and calls the method that finds the distance
        return distance(a.x,a.y);
    }

    public double distance() { // Finds the distance from point (0,0)
        return distance(0,0);
    }

    public int getX() {
        return x;
    }
    public void setX (int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY (int y) {
        this.y = y;
    }


}
