public class Movie {
    private final String name;
    private final int duration;
    private final double rating;
    private static Movie instance;

    private Movie(String name, int duration, double rating) {
        this.name = name;
        this.duration = duration;
        this.rating = rating;
    }

    public static Movie getInstance(String name, int duration, double rating) {
        if (instance == null) {
            instance = new Movie(name, duration, rating);
        }
        return instance;
    }

    public static Movie getInstance(){
        return instance;
    }
    public void getInfo(){
        System.out.println(name + ": duration - " + duration + " minutes, rating -  " + rating);
    }
}
