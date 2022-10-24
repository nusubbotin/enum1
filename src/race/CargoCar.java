package race;

public class CargoCar extends Transport implements CompetingTransport{

    protected enum CarryingCapacity{
        N1("с полной массой до 3,5 тонн"), N2("с полной массой свыше 3,5 до 12 тонн"), N3("с полной массой свыше 12 тонн");

        private String capacityDesription;

        CarryingCapacity(String capacityDesription) {
            this.capacityDesription = capacityDesription;
        }

        public String getCapacityDesription() {
            return capacityDesription;
        }
    }

    CarryingCapacity carryingCapacity;

    public CargoCar(String brand, String model, float engineVolume, CarryingCapacity carryingCapacity) {
        super(brand, model, engineVolume);
        this.carryingCapacity = carryingCapacity;
    }

    public void startMoving(){
        System.out.println("Загрузить груз на старте");
        System.out.println("Начать движение");
    };

    public void stopMoving(){
        System.out.println("Завершить движение");
        System.out.println("Разгрузить груз на финише");
    };

    public void pitStop(){
        System.out.println("Водитель грузовика останавливается");
        System.out.println("Проверка давления в шинах и кргуговой обход грузовика на предмет неполадок");
        System.out.println("Водитель грузовика трогается");
    }
    public void bestCircleTime(){
        System.out.println("Запросить информацию со спутника");
    }
    public void maximumSpeed(){
        System.out.println("Запросить информацию со спутника по максимальной скорости");
    }
}
