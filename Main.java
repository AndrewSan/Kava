import java.util.Random;

public class Main {

    public static void main(String[] args) {

    Random random = new Random();
    String[] arrayOfColors = new String[] {"красный", "синий", "чёрный", "белый", "желтый", "зеленый"};

    Figure[] array = new Figure[random.nextInt(10)+1];
    //System.out.println(array.length);
    for (int i = 0; i < array.length; i++){
        switch (random.nextInt(4)){
            case 0:
                array[i] = new Square(arrayOfColors[random.nextInt(arrayOfColors.length)], random.nextInt(15)+1);
                break;
            case 1:
                array[i] = new Triangle(arrayOfColors[random.nextInt(arrayOfColors.length)], random.nextInt(13)+2,
                        random.nextInt(7)+2, random.nextInt(10)+2);
                break;
            case 2:
                array[i] = new Circle(arrayOfColors[random.nextInt(arrayOfColors.length)], random.nextInt(10)+1);
                break;
            case 3:
                array[i] = new Trapeze(arrayOfColors[random.nextInt(arrayOfColors.length)], random.nextInt(8)+2,
                        random.nextInt(15)+2, random.nextInt(7)+2, random.nextInt(7)+2);
                break;
            default:
                array[i] = new Square(arrayOfColors[random.nextInt(arrayOfColors.length)], random.nextInt(15)+1);
        }
    }

    for(Figure obj : array){
        System.out.println(obj);
    }

    }
}

// Во время работы програмы возможны результати площади такие как NaN иил 0, поскольку
// не всегда сгенерирование числа подходят для создания фигуры, проблем не вазникает с квадратом и кругом, там нельзя
// не попасть, этот момент я оставил потому-что он не влияет на результата и кочество знаний ООП и реализацию