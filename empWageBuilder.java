public class empWageBuilder {
    public static void main(String[] args) {

           // Contains
        int IS_PRESENT = 1;

        // Computation
        double empCheck = Math.floor(Math.random() * 10) % 2;
        System.out.println(empCheck);
        // Case Checking
        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
