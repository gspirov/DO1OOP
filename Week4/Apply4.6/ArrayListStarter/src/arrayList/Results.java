package arrayList;

// allows all ArrayList methods to be used within this class
import java.util.ArrayList;

public class Results {
	
	// declaration of an ArrayList to store double values
	ArrayList<Double> results;
	
	// constructor, in which the ArrayList is constructed
	public Results() {
		results = new ArrayList<Double>();
	}
	
	// when a double value is passed to this method, it is added to the ArrayLisy
	public void addResult(double newResult) {
		results.add(newResult);
	}
	
	// returns a string consisting of all results in order of entry
	public String getAllResults() {
		String allResults = "";
		for (double result : results) {
			// adds a line break to the string, so results are on one line each
			allResults += result + "\n";
		}
		return allResults;
	}
	
	public double getFastest() {
        double min = Double.MAX_VALUE;

		for (double result : results) {
            if (result < min) {
                min = result;
            }
        }

        return min;
	}
	
	public double getSlowest() {
        double max = Double.MIN_VALUE;

        for (double result : results) {
            if (result > max) {
                max = result;
            }
        }

        return max;
	}
	
	public double getAverage() {
		double sum = 0;

        for (double result : results) {
            sum += result;
        }

        return sum / results.size();
	}
	
	public void addResults(double[] newResults) {
		for (double result : newResults) {
            results.add(result);
        }
	}
		
	public ArrayList<Double> getBelow(double threshold) {
		ArrayList<Double> below = new ArrayList<Double>();

		for (double result : results) {
            if (result < threshold) {
                below.add(result);
            }
        }

        return below;
	}
}
