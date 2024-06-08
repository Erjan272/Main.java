public class Redmi extends Phone{

    private String CPU;
    private int NumberofCores;

    public Redmi(String cpu, int numberofCores,int RAM,  int weight) {
        super(RAM,weight);
        CPU = cpu;
        NumberofCores = numberofCores;
    }


    @Override
    public void print() {
        System.out.println("\n");
        System.out.println("Redmi");
        System.out.printf("CPU: " + CPU +
                          "\nNumberofCores: " + NumberofCores +
                          "\nRAM: " + getRAM() +
                          "\nWeight: " + getWeight());
    }
}
