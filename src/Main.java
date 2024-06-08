public class Main {
    public static void main(String[] args) {

        Phone first = createObject("1й");
        Phone second = createObject("2й");
        Phone third = createObject("3й");

        Phone[] phones = {first, second, third};
        for (int i = 0; i < phones.length; i++)
        {
            phones[i].print();
        }


    }
    public static Phone createObject(String className) {

        switch (className) {
            case "1й":
                Samsung samsung = new Samsung(190, "ANV",4,170);
                return samsung;

            case "2й":
                Redmi redmi = new Redmi("CPU", 2,2,180);
                return redmi;

            case "3й":
                Xiaomi xiaomi = new Xiaomi(128, 34,8,200);
                return xiaomi;
        }
        return null;
    }
}