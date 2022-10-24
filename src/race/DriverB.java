package race;

public class DriverB<T extends Car> extends Driver{
    private final char driverCategory = 'B';

    public DriverB(String fullName, int experience) {
        super(fullName, experience);
    }

    public void toRule(T car){
        System.out.println("Как обычно - включаем драйв и педаль в пол");

        car.pitStop();
        car.bestCircleTime();
        car.maximumSpeed();
    }
}
