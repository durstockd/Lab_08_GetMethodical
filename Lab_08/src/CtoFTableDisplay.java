public class CtoFTableDisplay {
    public static void main(String[] args) {
        System.out.printf("%-10s%-10s\n", "Celsius", "Fahrenheit");
        System.out.println("----------------------");

        for (int c = -100; c <= 100; c++) {
            System.out.printf("%-10d%-10.1f\n", c, CtoF(c));
        }
    }

    /**
     * Converts Celsius to Fahrenheit
     * @param celsius temperature in Celsius
     * @return temperature in Fahrenheit
     */
    public static double CtoF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}