package module1.arrays;

public class Exercise1 {
    public static void main(String[] args) {
        Array array = new Array(3);

        array.insert(10);
        array.insert(40);
        array.insert(50);
        array.insert(60);

        array.removeAt(1);

        array.print();

        System.out.println(array.indexOf(30));
        System.out.println(array.indexOf(100));
        System.out.println(array.indexOf(60));
    }
}
