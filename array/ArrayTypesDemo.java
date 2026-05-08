import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name + " | Marks: " + marks);
    }
}

public class ArrayTypesDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ==============================
        // 1. One-Dimensional Array
        // ==============================
        System.out.println("1D Array:");

        int[] numbers = {10, 20, 30, 40, 50};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println("\n");

        // ==============================
        // 2. Two-Dimensional Array
        // ==============================
        System.out.println("2D Array:");

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ==============================
        // 3. Jagged Array
        // ==============================
        System.out.println("Jagged Array:");

        int[][] jagged = {
                {1, 2},
                {3, 4, 5},
                {6, 7, 8, 9}
        };

        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // ==============================
        // 4. Array of Objects
        // ==============================
        System.out.println("Array of Objects:");

        Student[] students = new Student[3];

        students[0] = new Student("Rahul", 85);
        students[1] = new Student("Aman", 90);
        students[2] = new Student("Priya", 95);

        for (Student s : students) {
            s.display();
        }

        System.out.println();

        // ==============================
        // 5. Dynamic Input Array
        // ==============================
        System.out.println("Dynamic Array Input:");

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] dynamicArray = new int[size];

        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            dynamicArray[i] = sc.nextInt();
        }

        System.out.println("Array Elements:");

        for (int value : dynamicArray) {
            System.out.print(value + " ");
        }

        sc.close();
    }
}
