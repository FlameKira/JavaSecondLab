import fifth.Table;
import first.Button;
import fourth.OddEvenSeparator;
import second.Balance;
import sixth.exceptions.InvalidDimensionException;
import sixth.exceptions.InvalidRadiusException;
import sixth.geometry2d.Circle;
import sixth.geometry2d.Figure;
import sixth.geometry2d.Rectangle;
import sixth.geometry3d.Cylinder;
import third.Bell;

public class Main {
    public static void main(String[] args) throws InvalidRadiusException, InvalidDimensionException {
        Button button = new Button();
        System.out.println(button.click());
        System.out.println(button.click());

        Balance balance = new Balance();
        balance.addLeft(5);
        balance.addRight(5);
        System.out.println(balance.result());

        balance.addRight(3);
        System.out.println(balance.result());

        Bell bell = new Bell();
        System.out.println(bell.sound());
        System.out.println(bell.sound());

        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        System.out.println(separator.even());
        System.out.println(separator.odd());

        Table table = new Table(2, 3);
        table.setValue(0, 0, 1);
        table.setValue(0, 1, 2);
        table.setValue(1, 0, 3);
        System.out.println("Среднее: " + table.average());

        Figure circle = new Circle(5);
        System.out.println(circle);
        System.out.println("Площадь круга: " + circle.area());
        System.out.println("Периметр круга: " + circle.perimeter());

        Figure rectangle = new Rectangle(4, 6);
        System.out.println(rectangle);
        System.out.println("Площадь прямоугольника: " + rectangle.area());
        System.out.println("Периметр прямоугольника: " + rectangle.perimeter());

        Cylinder cylinder = new Cylinder(circle, 10);
        System.out.println("Объем цилиндра: " + cylinder.volume());
    }
}