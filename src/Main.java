
public class Main {
    public static void main(String[] args) {
        Bugatti bugatti = Bugatti.getInstance("Divo", 1500, 380);
        if(Bugatti.getInstance() != null){
            bugatti.getInfo();
        }

        // Проверка подключения гитхаба
        System.out.println("Hello World!");

    }
}























