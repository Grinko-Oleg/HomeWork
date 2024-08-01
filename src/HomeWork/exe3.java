package HomeWork;

public class exe3 {
    public static void main(String[] args) {

        double fuel = 10;
        //Работоспособен или нет двигатель
        boolean isEngineWork = true;
        //Есть ли ошибки в компьютере (false - ошибок нет)
        boolean hasErrors = true;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if
        (fuel >= 10 &&  (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4) && hasErrors && isEngineWork
        ) {
            System.out.println("Машина едет");
        } else {
            System.out.println("Машина не едет");
        }

    }
}
