package HomeWork;

public class exe2 {
    public static void main(String[] args) {

        String name = "     ПЕтРов Олег Иванович     ";
        System.out.println("ПЕтРов Олег Иванович");
        System.out.println(name.toUpperCase());
        int ind = name.indexOf("ова");
        int ind1 = name.indexOf("ов");
        if (ind != -1) {
            System.out.println("Уважаемая" + name.toUpperCase());

        } else if (ind1 != -1) {
            System.out.println("Уважаемый" + name.toUpperCase());

        } else System.out.println("неизвестное лицо");

        System.out.println("__________________________________");



























            //Необходимо
            //1. убрать лишние пробелы,
            //2. перевести текст в верхний регистр
            //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
            // Если содержит "ов " то печатаем на экран: Уважаемый {name}
            // В иных случаях печатаем на экран: Неизвестное лицо {name}
        }


    }

