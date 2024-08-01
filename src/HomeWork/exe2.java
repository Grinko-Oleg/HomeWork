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
    }




























    

