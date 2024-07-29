package CodeExercises.ce33_Point;
/*
 * This is the solution from Udemey. I had been right all the way through setting the distance method with no parameters
 * I do not understand this example very weel and am hoping to find other examples that may help me see
 * this solution from a different angle.
 */

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return distance(0, 0);
    }

    public double distance(Point a) {
        return distance(a.x, a.y);
    }

    public double distance(int x, int y) {

        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}