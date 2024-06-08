public class Samsung extends Phone{

    private int brightness;
    private String screen;

    public Samsung(int brightness, String screen, int RAM,  int weight) {
        super(RAM,weight);
        this.brightness = brightness;
        this.screen = screen;
    }


    @Override
    public void print() {

        System.out.println("Samsung");
        System.out.printf("Brightness: " + brightness +
                          "\nScreen: " + screen +
                          "\nRAM: " + getRAM() +
                          "\nWeight: " + getWeight());

    }
}
