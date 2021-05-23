package Pointpkg;
import java.util.Objects;
import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x=0.0;
        this.y=0.0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void afficher()
    {
        System.out.print("x = "+this.x+", y = "+this.y);
    }
    public void saisir()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("X ? ");
        this.x=sc.nextDouble();
        System.out.println("Y ? ");
        this.y=sc.nextDouble();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
        //return this.x==point.x && this.y==point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return
                "x=" + x +
                ", y=" + y;
    }
}
