package race;

public class CargoCar extends Transport implements CompetingTransport{
    public CargoCar(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
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
