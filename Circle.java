public class Circle extends Figure{

    public double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double getS() {
        return Math.round(Math.pow(radius, 2) * Math.PI);
    }

    @Override
    public void PaintFigure() { }

    @Override
    public String toString() {
        return "Фигура - круг, площадь - " + getS() + "кв. ед.  "
                + "Радиус - " + getRadius() + " ед.  " +
                    super.toString();
    }
}
