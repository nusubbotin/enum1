package race;

public class DriverC <T extends CargoCar> extends Driver {
    private final char driverCategory = 'C';

    public DriverC(String fullName, int experience) {
        super(fullName, experience);
    }

    public void toRule(T cargoCar){
        System.out.println("Прогреть двиготель, пару нажать педаль в пол и поехали");

        cargoCar.pitStop();
        cargoCar.bestCircleTime();
        cargoCar.maximumSpeed();
    }
}
