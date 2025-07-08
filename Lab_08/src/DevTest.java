import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String zip = SafeInput.getRegExString(in, "Enter your ZIP code (5 digits)", "^\\d{5}$");
        System.out.println("You entered ZIP: " + zip);
    }
}
