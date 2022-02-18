public class TrappingRainWater {
    public static int trap (int[] height) {
        int left = 0, right = height.length - 1, water = 0;
        int maxLeft = height[left];
        int maxRight = height[right];

        while (left < right) {
            if (height[left] <= height[right]) {
                left++;
                maxLeft = Integer.max(maxLeft, height[left]);
                water += maxLeft - height[left];
            } else {
                right--;
                maxRight = Integer.max(maxRight, height[right]);
                water += maxRight - height[right];
            }
        }
        return water;
    }
    public static void main(String[] args) {
        int [] heights = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Total area of trapped rain water is:" +trap(heights));
    }
}
