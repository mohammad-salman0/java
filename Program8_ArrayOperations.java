interface ArrayOperations {
    void insert(int index, int value);
    void search(int value);
    void display();
}

class ArrayManager implements ArrayOperations {
    int[] arr = new int[5];

    public void insert(int index, int value) {
        try {
            arr[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
    }

    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println("Found at index " + i);
                return;
            }
        }
        System.out.println("Not found");
    }

    public void display() {
        System.out.print("Array contents: ");
        for (int val : arr) System.out.print(val + " ");
        System.out.println();
    }
}

public class Program8_ArrayOperations {
    public static void main(String[] args) {
        ArrayManager manager = new ArrayManager();
        manager.insert(0, 10);
        manager.insert(4, 50);
        manager.insert(5, 60);  // triggers exception
        manager.display();
        manager.search(10);
        manager.search(99);
    }
}
