public class Bugatti {
    private final String model;
    private final int horsePower;
    private final int speed;
    private static Bugatti instance;

    private Bugatti(String model, int horsePower, int speed) {
        this.model = model;
        this.horsePower = horsePower;
        this.speed = speed;
    }

    public static Bugatti getInstance(String model, int horsePower, int speed) {
        if (instance == null) {
            instance = new Bugatti(model, horsePower, speed);
        }
        return instance;
    }

    public static Bugatti getInstance(){
        return instance;
    }
    public void getInfo(){
        System.out.println(model + ": " + horsePower + " - hp, " + speed + " - maxspeed");
    }
}
