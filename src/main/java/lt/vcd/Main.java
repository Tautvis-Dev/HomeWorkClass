package lt.vcd;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Point p1 =new Point(3,  4);
        Point p2 =new Point(6,  8);

        System.out.println(p1.distanceFromOrigin());

        System.out.println(p1);
        System.out.println(p2);

        p1.translate(4,3);
        System.out.println(p1);

        System.out.println(p1.distance(p2));

        p2.setLocation(2,3);
        System.out.println(p2);

        Line line1 = new Line(p1, p2);
        System.out.println(line1);

        System.out.println(line1.distanceLine());


    }
}
