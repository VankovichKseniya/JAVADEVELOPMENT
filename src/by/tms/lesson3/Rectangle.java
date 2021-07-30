package by.tms.lesson3;

import java.util.Objects;

public class Rectangle {

    private Point upperLeftPoint;
    private Point lowerRightPoint;

    @Override                                                           //генерирую equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(upperLeftPoint, rectangle.upperLeftPoint) &&
                Objects.equals(lowerRightPoint, rectangle.lowerRightPoint);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public Point getUpperLeftPoint() {                              //генерирую геттеры/сеттеры
        return upperLeftPoint;
    }

    public void setUpperLeftPoint(Point upperLeftPoint) {
        this.upperLeftPoint = upperLeftPoint;
    }

    public Point getLowerRightPoint() {
        return lowerRightPoint;
    }

    public void setLowerRightPoint(Point lowerRightPoint) {
        this.lowerRightPoint = lowerRightPoint;
    }

    public Rectangle(Point upperLeftPoint, Point lowerRightPoint) {         //генерирую канструктор
        this.upperLeftPoint = upperLeftPoint;
        this.lowerRightPoint = lowerRightPoint;
    }

    public void calculateTheSquareOfARectangle() {                          //метод высчета площади
        Point lowerLeftPoint = new Point(0,0);                      //добавляю третюю координату
        System.out.println("Площадь прямоугольника - "
                + lowerRightPoint.distance(lowerLeftPoint) * upperLeftPoint.distance(lowerLeftPoint));
    }

    public void calculatePerimeterOfTheRectangle() {                        //метод высчета периметра
        Point lowerLeftPoint = new Point(0,0);                      //добавляю третюю координату
        System.out.println("Периметр прямоугольника - "
                + (lowerRightPoint.distance(lowerLeftPoint) + upperLeftPoint.distance(lowerLeftPoint)) * 2);
    }

    public void calculateDiagonalLength() {                                 //метод высчета диагонали
        System.out.println("Диагональ прямоугольника - " + lowerRightPoint.distance(upperLeftPoint));
    }
}
