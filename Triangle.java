public class Triangle extends Figure{

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public double getMaxSide(){                 // не факт что получаемый триугольник будет прямым
        return Math.max(Math.max(sideA,sideB),sideC);  // поэтому вместо возврата гипотенузи возвращаю найбольшую сторону
    }

    @Override
    public double getS() {
        double p = (sideA + sideB + sideC)/2;
        return Math.round(Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC)));
    }

    @Override
    public void PaintFigure() {
    }

    @Override
    public String toString() {
        return "Фигура - треугольник, площадь - " + getS() + "кв. ед.  "
                + "Найбольшая сторона - " + getMaxSide() + " ед.  " +
                super.toString();
    }
}
