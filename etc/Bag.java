package etc;

public class Bag {
	private int maxCapacity;
	private int currentCapacity;
	
	public Bag(int maxCapacity) {
		this.maxCapacity = maxCapacity;
		this.currentCapacity = 0;
	}
	
	public void add(int capacity) {
		if (currentCapacity + capacity <= maxCapacity) {
			currentCapacity += capacity;
		}
	}
	
	public void subtract(int capacity) {
		if (currentCapacity - capacity >= 0) {
			currentCapacity -= capacity;
		}
	}
	
	public int getMaxCapacity(){
		return maxCapacity;
	}
	
	public int getCurrentCapacity() {
		return currentCapacity;
	}
	
	public int getFreeSpace() {
		return maxCapacity - currentCapacity;
	}
}
