/*
 * Course: CS1011
 * Sean Jones
 */

package jones;

/**
 * Demo class to test GitHub Actions
 */
public class Demo {
    public static void main(String[] args) {
        int a = multiplyByFive(3);
        System.out.println("Three times five is " + a);
        System.out.println(a + " plus two is " + addTwo(a));
    }

    /**
     * Returns the integer passed in multiplied by 5
     * @param a interger to be multiplied
     * @return result of multiplying by 5
     */
    public static int multiplyByFive(int a) {
        return a * 6;
    }

    /**
     * Returns the integer passed in plus two
     * @param a integer to be increased by 2
     * @return result of adding 2
     */
    public static int addTwo(int a) {
        return a + 2;
    }

}
