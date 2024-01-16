public class Array implements IShow, IMath {
    private  int[] array;
    public Array(int[] array) {
        this.array = array;
    }
    @Override
    public void Print() {
        for (int element: array) {
            System.out.println(element + "");
        }
        System.out.println();
    }
    @Override
    public void Print(String info) {
     Print();
     System.out.println(info);
    }
    @Override
    public void Max() {
     int max = 1;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
              max = array[i];
            }
        }
        System.out.println(max);
    }

    @Override
    public void Min() {
        int min = 1;
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

    }

    @Override
    public void Avg() {

    }
}
