public class PracticingMathMethods {
    public static void main(String[] args) {
        
        double a = -9;
        double b = 4;
        double c = 2;

        System.out.println("=== Practicing Java Math Class Methods ===\n");

        double eq1 = Math.sqrt(Math.abs(a));
        System.out.println("1. Square root of |a| = " + eq1);

                double eq2 = Math.pow(a, b);
        System.out.println("2. a^b = " + eq2);

               double eq3 = Math.abs(a);
        System.out.println("3. |a| = " + eq3);

              double eq4 = Math.max(b, c);
        System.out.println("4. Max(b, c) = " + eq4);

               double eq5 = 1 + Math.random() * 9;
        System.out.println("5. Random number (1–10) = " + Math.round(eq5));

                System.out.println("\n--- Extra Math Functions ---");
        System.out.println("Floor of 4.8 = " + Math.floor(4.8));
        System.out.println("Ceil of 4.2 = " + Math.ceil(4.2));
        System.out.println("Round of 4.5 = " + Math.round(4.5));
        System.out.println("Min(10, 3) = " + Math.min(10, 3));
        System.out.println("Cos(0) = " + Math.cos(0));
    }
}