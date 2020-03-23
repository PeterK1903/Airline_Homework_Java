public enum PlaneType {

    Boeing747(4, 447700),
    Boeing767(2, 348000),
    Boeing777(2, 299700);

    private final int capacity;
    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }



}
