package OOP.Module0_Basic.Ex1;

public class Point {
    private int pointX;
    private int pointY;
    private String pointName;

    public Point() {
        this.pointX = 0;
        this.pointY = 0;
        this.pointName = "O";
    }

    public Point(int pointX, int pointY, String pointName) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointName = pointName;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public void setPointName(String pointName) {
        this.pointName = pointName;
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public String getPointName() {
        return pointName;
    }

    @Override
    public String toString() {
        return "Point " + getPointName() + "(" + getPointX() + ", " + getPointX() + ")";
    }
}
