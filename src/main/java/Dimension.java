public class Dimension {
    private int heightInCm;
    private int widthInCm;
    private int tankCapacityInltr;

    public Dimension(int heightInCm, int widthInCm, int tankCapacityInltr) {
        this.heightInCm = heightInCm;
        this.widthInCm = widthInCm;
        this.tankCapacityInltr = tankCapacityInltr;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public int getWidthInCm() {
        return widthInCm;
    }

    public int getTankCapacityInltr() {
        return tankCapacityInltr;
    }


    @Override
    public String toString() {
        return
                "height= " + heightInCm +"cm"+
                ", width= " + widthInCm +"cm"+
                ", tankCapacity= " + tankCapacityInltr+"cm";
    }
}
