package SingletonDesignPattern;

public class DatabaseRepository {

    private static DatabaseRepository instance;

    public static DatabaseRepository getInstance() {
        if(instance == null){
            System.out.println("Instance is null in DatabaseRepository");
            instance = new DatabaseRepository();
        }
        return instance;
    }

    public void test(){
        System.out.println("test");
    }
}
