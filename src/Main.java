
public class Main {
    public static void main(String[] args) {
        Movie movie = Movie.getInstance("Avatar: The Way of Water", 145, 8.1);
        if(Movie.getInstance() != null){
            movie.getInfo();
        }

        // Проверка подключения гитхаба
        System.out.println("Hello World!");

    }
}























