public abstract class Figure {

    private String color;

    public Figure( String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public abstract double getS();

    public abstract void PaintFigure();

    public String toString() {
        return  "Цвет фигуры - " + color + "\n";
    }
}
