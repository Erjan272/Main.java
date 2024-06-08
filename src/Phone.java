public abstract class Phone implements Printtable {

    private int RAM;
    private int weight;


    public Phone(int ram, int weight) {
        this.RAM = ram;
        this.weight = weight;
    }

    public int getRAM() {
        return RAM;
    }

    public int getWeight() {
        return weight;
    }
}
