package BenimJava.j00_Team10;

public class C08 {
    public static void main(String[] args) {

        //     Write a Java program to test
        //    if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.


        int[] nums = {10, 2, 10, 10, 10, 2, 4, 20, 20, 20, 20, 20, 20};


        int on = 0;
        int yirmi = 0;

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == 10 && nums[i + 1] == 10) {
                on++;
            } else if (nums[i] == 20 && nums[i + 1] == 20) {
                yirmi++;

            }

        }
        System.out.println("onların adedi: " + on);
        System.out.println("oyirmilerin adedi: " + yirmi);

    }
}
