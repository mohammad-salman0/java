interface ArrayOperations {
    void insert(int element);
    void search(int element);
    void display();
}

class ArrayManager implements ArrayOperations {
    int[] arr = new int[10];
    int index = 0;

    public void insert(int element) {
        if (index >= arr.length) throw new ArrayIndexOutOfBoundsException("Array full");
        arr[index++] = element;
    }

    public void search(int element) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at index " + i);
                return;
            }
        }
        System.out.println("Element not found");
    }

    public void display() {
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}