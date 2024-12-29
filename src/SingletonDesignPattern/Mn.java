package SingletonDesignPattern;

public class Mn {
    public static void main(String[] args) {
        DatabaseRepository databaseRepository1 = DatabaseRepository.getInstance();
        DatabaseRepository databaseRepository2 = DatabaseRepository.getInstance();

        databaseRepository1.test();
        databaseRepository2.test();

    }
}
