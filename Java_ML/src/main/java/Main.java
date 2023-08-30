import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

public class Main {

    public static void main(String[] args) {
        // Get a DescriptiveStatistics instance
        DescriptiveStatistics stats = new DescriptiveStatistics();

        // Add the data from the array
        double[] inputArray = {.5, 1., 3., 5.};
        for(int i = 0; i < inputArray.length; i++) {
            stats.addValue(inputArray[i]);
        }

        // Compute some statistics
        double mean = stats.getMean();
        double std = stats.getStandardDeviation();
        double median = stats.getPercentile(50);

        System.out.println("Mean: " + mean);
        System.out.println("STD: " + std);
        System.out.println("Median: " + median);
    }

}
