package by.epam.training.module04.task07;

public class Triangle {

    private Point a, b, c;

    public Triangle(Point a_, Point b_, Point c_) {
        a = a_;
        b = b_;
        c = c_;
    }

    public double square() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        double p = (ab + bc + ac) / 2;
        return Math.sqrt(p * (p - ab) * (p - bc) * (p - ac));
    }

    public double perimeter() {
        double ab = Point.distance(a, b);
        double bc = Point.distance(b, c);
        double ac = Point.distance(a, c);
        return ab + bc + ac;
    }

    public Point median_crossing() {
        return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
    }

    public void print() {
        System.out.print("A: ");
        a.print();
        System.out.print("B: ");
        b.print();
        System.out.print("C: ");
        c.print();
    }
}
