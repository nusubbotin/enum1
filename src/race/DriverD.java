package race;

public class DriverD <T extends Bus> extends Driver {
    private final char driverCategory = 'D';

    public DriverD(String fullName, int experience) {
        super(fullName, experience);
    }

    public void toRule(T bus){
        System.out.println("Проверить закртыие дверей и педаль в пол");

        bus.pitStop();
        bus.bestCircleTime();
        bus.maximumSpeed();
    }
}
