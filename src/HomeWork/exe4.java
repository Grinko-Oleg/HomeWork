package HomeWork;

public class exe4 {
    public static void main(String[] args) {


        String simply = "this is simply. This is my favorite song." .replace("this is", "those are");
        int index = simply.indexOf('o', 33);
        System.out.println(simply + "    Индекс буквы 'o' " + index);

    }
}
