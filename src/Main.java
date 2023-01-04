public class Main {
    public static void main(String[] args) {
        BmiService index = new BmiService();

        int index_body = (int)index.calculate(65,170);
        System.out.println(index_body);


    }
}