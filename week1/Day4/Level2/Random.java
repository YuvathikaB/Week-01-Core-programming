package level2;
public class Random {
    public static int[] generate4DigitRandomArray(int size){
        int[] random = new int[size];
        for(int i=0;i<size;i++){
            random[i]=(int)(Math.random()*9000)+1000;
        }
        return random;
    }
    public static double[] findAverageMinMax(int[] numbers) {
        double s=0;
        int min=numbers[0];
        int max=numbers[0];
        for (int i=0;i<numbers.length;i++){
            s+=numbers[i];
            min = Math.min(min,numbers[i]);
            max = Math.max(max,numbers[i]);
        }
        double avg = s/numbers.length;
        return new double[] {avg,min,max};
    }
    public static void main(String[] args) {
        int size=5;
        int[] random = generate4DigitRandomArray(size);
        double[] results = findAverageMinMax(random);
        System.out.print("Random 4-digit Numbers: ");
        for (int i=0; i<random.length; i++) {
            System.out.print(random[i] + " ");
        }
        System.out.println();
        System.out.printf("Average: %.2f\n", results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
