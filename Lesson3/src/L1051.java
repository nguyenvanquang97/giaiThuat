import java.util.Arrays;

public class L1051 {
    public int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights,heights.length);
        Arrays.sort(expected);
        int count=0;
        for (int i=0;i<heights.length;i++){
            if (heights[i]!=expected[i]){
                count++;
            }
        }
        return count;
    }

}
