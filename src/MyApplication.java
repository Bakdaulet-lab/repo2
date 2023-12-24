import models.Point;
import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users1\\IDEJavaOpp\\repo1\\src\\source");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);



        }

        sc.close();
        System.out.println(shape.getPerimeter());
        System.out.println(shape.getLongestSide());
        System.out.println(shape.getAverageSide());


    }
}
