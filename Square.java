public class Square extends Figure {

    private double side;

    public Square(String color, double side){
        super(color);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double getS() {
        return Math.pow(side,2);
    }

    @Override
    public void PaintFigure() { }

    @Override
    public String toString() {
        return "Фигура - квадрат, площадь - " + getS() + "кв. ед.  "
                + "Длинна стороны - " + getSide() + " ед.  " +
                    super.toString();
    }
}
