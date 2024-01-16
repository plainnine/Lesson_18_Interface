public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Array myArray = new Array(array);

        myArray.Print();
        myArray.Print("Доп. сообщение");
    }
}