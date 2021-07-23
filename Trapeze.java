public class Trapeze extends Figure {

    private double smallerBase;
    private double largerBase;
    private double leftSide;
    private double rightSide;

    public Trapeze(String color, double smallerBase, double largerBase, double leftSide, double rightSide) {
        super(color);
        this.smallerBase = smallerBase;
        this.largerBase = largerBase;
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }


    public double getMiddleLine(){
        return (smallerBase + largerBase)/2;
    }

    @Override
    public double getS() {
        return Math.round(0.25*(largerBase + smallerBase)/(largerBase - smallerBase)
                * Math.sqrt((-smallerBase + largerBase + leftSide + rightSide)
                * (smallerBase - largerBase + leftSide - rightSide)
                * (smallerBase - largerBase - leftSide + rightSide)));
    }

    @Override
    public void PaintFigure() { }

    @Override
    public String toString() {
        return "Фигура - трапеция, площадь - " + getS() + "кв. ед.  "
                + "Серединная линия - " + getMiddleLine() + " ед.  " +
                    super.toString();
    }
}
