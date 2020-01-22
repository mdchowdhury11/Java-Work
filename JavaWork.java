import java.util.Arrays;
import java.util.HashSet;

public class JavaWork {

    // return missing smallest positive integer (greater than 0) from given arrays

    //###

    public static int smallestPositiveMissingNumber(int numbers[]) {
        int n = numbers.length;
        int missing = 1;

        HashSet<Integer> storage = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            if (missing < numbers[i]) {
                storage.add(numbers[i]);
            } else if (missing == numbers[i]) {
                missing = missing + 1;
                while (storage.contains(missing)) {
                    storage.remove(missing);
                    missing = missing + 1;
                }
            }
        }
        return missing;
    }

    //###

    public static int smallestPositiveNumber(int arrays[]) {
        int n = arrays.length;
        int missing = 1;

        HashSet<Integer> storage = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            if (missing < arrays[i]) {
                storage.add(arrays[i]);
            } else if (missing == arrays[i]) {
                missing = missing + 1;
                while (storage.contains(missing)) {
                    storage.remove(missing);
                    missing = missing + 1;
                }
            }
        }
        return missing;
    }

    //###

    public static int smallestMissingNumber(int digits[]) {
        int n = digits.length;
        int missing = 1;

        HashSet<Integer> storage = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            if (missing < digits[i]) {
                storage.add(digits[i]);
            } else if (missing == digits[i]) {
                missing = missing + 1;
                while (storage.contains(missing)) {
                    storage.remove(missing);
                    missing = missing + 1;
                }
            }
        }
        return missing;
    }


    // Return sort the integer array

    public static int[] sortNumber(int nums[]) {
        Arrays.sort(nums);
        return nums;
    }


    // Create a method that returs abbreviate of the given string

    //###

    public static String abbreviation(String grettings) {
        if (grettings.length() == 0) ;
        String word[] = grettings.split(" ");
        String initials = "";
        for (String happy : word) {
            initials += Character.toUpperCase(happy.charAt(0)) + " ";
        }
        return initials;
    }

    //###

    public static String abbreviation2(String advise) {
        if (advise.length() == 0) ;
        String word[] = advise.split(" ");
        String initials = "";
        for (String happy : word) {
            initials += Character.toUpperCase(happy.charAt(0)) + " ";
        }
        return initials;
    }


    // Verify if given string is a palindrome

    //###

    public static boolean isPalindrom(String pal) {
        boolean isPalindrom = false;
        String reverse = "";
        int len = pal.length();

        for (int i = len - 1; i >= 0; i--) {
            reverse = reverse + pal.charAt(i);
        }
            if (pal.equalsIgnoreCase(reverse)) {
                return true;
            } else {
                return false;
            }
        }



    public static void main(String[] args) {

        // return missing smallest positive integer (greater than 0) from given arrays

        int numbers[] = {1, 3, 5, 4, 2, 7};
        System.out.println(smallestPositiveMissingNumber(numbers));

        int arrays[] = {-1, -3, 4, 2};
        System.out.println(smallestPositiveNumber(arrays));

        int digits[] = {0, 5, -1, 1, 2, 4, 5, 3, 7, 1, 2};
        System.out.println(smallestPositiveNumber(digits));


        // Return sort the integer array

        int nums[] = {20, 10, 40, 44};
        int num[] = sortNumber(nums);
        System.out.println(Arrays.toString(num));


        // Create a method that returs abbreviate of the given string

        String grettings = "Happy New Year";
        System.out.println(abbreviation(grettings));

        String advise = "You Only Live Once";
        System.out.println(abbreviation2(advise));


        // Verify if given string is a palindrome

        String pal = "Level";
        System.out.println(isPalindrom(pal));
    }
}


