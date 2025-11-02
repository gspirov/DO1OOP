package race;

import java.util.LinkedList;
import java.util.Objects;

public class Finishers {
	private final LinkedList<Runner> listOfFinishers;
	
	public Finishers() {
		this.listOfFinishers = new LinkedList<>();
	}
	
	public void add(Runner runner) {
        if (runner == null) {
            return;
        }

        for (Runner item : listOfFinishers) {
            if (Objects.equals(runner.getRunnerID(), item.getRunnerID())) {
                return;
            }
        }

        this.listOfFinishers.add(runner);
	}
	
	public void clear() {
		this.listOfFinishers.clear();
	}
	
	public boolean remove(int index) {
        if (index >= 0 && index < this.listOfFinishers.size()) {
            this.listOfFinishers.remove(index);
            return true;
        }

        return false;
	}
	
	public boolean remove(Runner runner) {
        return this.listOfFinishers.removeIf(item -> Objects.equals(item.getRunnerID(), runner.getRunnerID()));
	}

    public int size() {
        return this.listOfFinishers.size();
    }

    @Override
    public String toString() {
		StringBuilder output = new StringBuilder("Results\n-------\n");

		for (Runner runner : this.listOfFinishers) {
			output.append(runner).append("\n");
		}

		return output.toString();
	}
}
