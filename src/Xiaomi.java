public class Xiaomi extends Phone{

    private int storage;
    private int Batterycapacity;

    public Xiaomi(int storage, int batterycapacity,int RAM, int weight) {
       super(RAM,weight);
        this.storage = storage;
        Batterycapacity = batterycapacity;
    }

    @Override
    public void print() {
        System.out.println("\n");
        System.out.println("Xiaomi");
        System.out.printf("Storage: " + storage +
                          "\nBatterycapacity: " + Batterycapacity +
                          "\nRAM: " + getRAM() +
                          "\nWeight: " + getWeight());

    }
}
