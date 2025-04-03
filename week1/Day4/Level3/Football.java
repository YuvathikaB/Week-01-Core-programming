package level3;
public class Football {
    public static int[] players(int size){
        int[] heights = new int[size];
        for(int i=0; i<size; i++){
            heights[i] = (int)(Math.random()*101)+150;
        }
        return heights;
    }
    public static int sum(int[] heights){
        int s=0;
        for(int i=0; i< heights.length;i++){
            s+=heights[i];
        }
        return s;
    }
    public static double meanHeight(int[] heights){
        int s=sum(heights);
        return s/(double)heights.length;
    }
    public static int shortestHeight(int[] heights){
        int min=heights[0];
        for(int i=0;i<heights.length;i++){
            if(heights[i]<min){
                min=heights[i];
            }
        }
        return min;
    }
    public static int tallest(int[] heights) {
        int max = heights[0];
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > max) {
                max = heights[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] heights=players(11);
        int s=sum(heights);
        double mean=meanHeight(heights);
        int shortest=shortestHeight(heights);
        int tall=tallest(heights);
        System.out.print("Heights of the players: ");
        for (int i=0;i<11;i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        System.out.println("Shortest height: " + shortest + " cm");
        System.out.println("Tallest height: " + tall + " cm");
        System.out.printf("Mean height: %.2f cm\n", mean);

    }
}
