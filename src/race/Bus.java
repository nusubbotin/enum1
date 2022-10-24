package race;

public class Bus extends Transport implements CompetingTransport  {

    protected enum CapacityType {
        VERY_SMALL("особо малая", 0, 10)
        , SMALL("малая", 10, 25)
        , AVERAGE("средняя", 40, 50)
        , BIG("большая", 60, 80)
        , VERY_BIG("особо большая", 100, 120);

        private String typeName;
        private int minValue;
        private int maxValue;

        CapacityType(String typeName, int minValue, int maxValue) {
            this.typeName = typeName;
            this.minValue = minValue;
            this.maxValue = maxValue;
        }

        public String getTypeName() {
            return typeName;
        }

        public int getMinValue() {
            return minValue;
        }

        public int getMaxValue() {
            return maxValue;
        }
    }
    CapacityType capacityType;

    public Bus(String brand, String model, float engineVolume, CapacityType capacityType) {
        super(brand, model, engineVolume);
        this.capacityType = capacityType;
    }

    public void startMoving(){
        System.out.println("Посадить пассажиров");
        System.out.println("Начать движение");
    };

    public void stopMoving(){
        System.out.println("Завершить движение");
        System.out.println("Высадить пасажиров");
    };

    public void pitStop(){
        System.out.println("Водитель автобуса открыл двери чтобы посажиры сходили в туалет");
        System.out.println("Автобус заправился");
        System.out.println("Водитель автобуса закрыл двери и тронулся");
    }
    public void bestCircleTime(){
        System.out.println("Запросить информацию у логиса");
    }
    public void maximumSpeed(){
        System.out.println("Запросить информацию у логиса по максимальной скорости");
    }
}
