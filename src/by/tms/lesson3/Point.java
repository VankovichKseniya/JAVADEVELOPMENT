package by.tms.lesson3;

public class Point {

    private double y;                                  //создаю переменные, выставляю им тип доступа - приватный, т.к. это
    private double x;                                                      //способствует правильной работе геттеров и сеттеров

    @Override                                               //генерирую equals
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.y, y) == 0 &&
                Double.compare(point.x, x) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public double getY() {                                          //генерирую геттеры/сеттеры
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public  Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point d) {                                                               //создаю метод

        double s = Math.sqrt((d.x - this.x) * (d.x - this.x) + (d.y - this.y) * (d.y - this.y));    //высчитываю расстояние по формуле
        return s;
    }

    public void calculateWidthAndLength() {
        Point u = new Point(2, 2);
        Point se = new Point(4, 6);
    }
}
