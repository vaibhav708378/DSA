//Defining a array 1.
public class Arrays1 {
    public static void main(String[] args) {
        //int[] marks = new int[3];
        int marks[] = new int[3];

        marks[0] = 92; //Physics
        marks[1] = 95; // English
        marks[2] = 97; //Maths

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        for(int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
    }
}