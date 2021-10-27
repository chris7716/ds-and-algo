package module1.arrays;

public class Array {
    private int[] array;
    private int count;

    public Array(int length) {
        array = new int[length];
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(array[i]);
        }
    }

    public void insert(int item) {
        if (count == array.length) {
            int[] cachedArray = new int[count * 2];

            for (int i =0; i < count; i++)
                cachedArray[i] = array[i];

            array = cachedArray;
        }

        array[count++] = item;
    }

    public void removeAt(int index) {
        int[] previousPart = new int[index];
        int[] nextPart = new int[count - index -1];
        int[] newArray = new int[count - 1];
        for (int i = 0; i < count; i++) {
            if (i < index) {
                previousPart[i] = array[i];
            }
            if (i > index) {
                nextPart[i - index - 1] = array[i];
            }
        }
        for (int i = 0; i < previousPart.length; i++) {
            newArray[i] = previousPart[i];
        }
        for (int i = 0; i < nextPart.length; i++) {
            newArray[previousPart.length + i] = nextPart[i];
        }
        count--;
        array = newArray;
    }

    public int indexOf(int item) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == item) {
                index = i;
            }
        }
        return index;
    }
}
