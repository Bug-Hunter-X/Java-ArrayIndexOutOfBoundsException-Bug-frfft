public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int index = 5;
        if (index >= 0 && index < arr.length) {
            arr[index] = 10; 
        } else {
            System.out.println("Index out of bounds");
        }
    }
}