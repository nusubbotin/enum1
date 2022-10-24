package race;

public class Car extends Transport implements CompetingTransport  {

    public Car(String brand, String model, float engineVolume) {
        super(brand, model, engineVolume);
    }

    public void startMoving(){
        System.out.println("Прогреть двиготель - проехать 3 разогравочных круга");
        System.out.println("Стартовать по фигналу");
    };

    public void stopMoving(){
        System.out.println("пересечь черту ФИНИШ на последнем круге");
    };

    public void pitStop(){
        System.out.println("Гонщик останавливается");
        System.out.println("Команда меняет шины, делает дозаправку");
        System.out.println("Гонщие выезжает на трек");
    }
    public void bestCircleTime(){
        System.out.println("Запросить информацию у диспетчера гонки");
    }
    public void maximumSpeed(){
        System.out.println("Запросить информацию у диспетчера гонки по максимальной скорости");
    }
}
