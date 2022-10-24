package race;

public abstract class Driver implements DriverInterface{
    private String fullName;
    private int experience;

    public Driver(String fullName, int experience) {
        this.fullName = fullName;
        this.experience = experience;
    }

    public void startMoving(){
        System.out.println("Начать движение");
    }

    public void stopMoving(){
        System.out.println("Завершить гонку");
    }

    public void carRefuel(){
        System.out.println("Заправить машину");
    }
}
