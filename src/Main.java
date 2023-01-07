public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();

        int indexBody = (int) index.calculate(65, 170);
        System.out.println("Индекс массы тела  " + indexBody);


    }
}