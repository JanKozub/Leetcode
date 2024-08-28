package programming_skills;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2, 3, 4, 5, 18, 17, 6}));
    }

    public static int maxArea(int[] height) {
        int a = 0, b = height.length - 1, maxArea = 0;

        while (a < b) {
            int area = Math.min(height[a], height[b]) * (b - a);

            if (height[a] < height[b]) {
                a++;
            } else {
                b--;
            }

            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}
