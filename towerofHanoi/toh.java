public class toh {

    // Recursive function to solve the Tower of Hanoi problem
    public static void solveHanoi(int n, char source, char auxiliary, char destination) {
        // Base case: If there's only one disk, move it from source to destination
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }

        // Move n-1 disks from source to auxiliary, so they are out of the way
        solveHanoi(n - 1, source, destination, auxiliary);

        // Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Move the n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, source, destination);
    }

    public static void main(String[] args) {
        int n = 5; // Number of disks

        // Call the solveHanoi method to move n disks from source 'A' to destination 'C' using auxiliary 'B'
        solveHanoi(n, 'A', 'B', 'C');
    }
}
