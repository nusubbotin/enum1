package race;

public class Main {
    public static void main(String[] args) {
        createRace();
    }

    private static void createRace() {
        Transport [] race = new Transport [9];
        race[0] = new Car("лада", "гранта", 1.5f, Car.BodyType.COUPE);
        race[1] = new Car("Шевроле", "Ланос", 1.6f, Car.BodyType.CROSSOVER);
        race[2] = new Car("Лада", "Приора", 1.6f, Car.BodyType.SEDAN);
        //
        race[3] = new Bus("Скания", "Скания модель", 5.6f, Bus.CapacityType.BIG);
        race[4] = new Bus("Круиз", "Мерседес", 5, Bus.CapacityType.VERY_BIG);
        race[5] = new Bus("Савок", "Икарус", 4, Bus.CapacityType.AVERAGE);
        //
        race[6] = new CargoCar("Самосвал", "Камаз", 6, CargoCar.CarryingCapacity.N1);
        race[7] = new CargoCar("Карго", "Хендай", 4, CargoCar.CarryingCapacity.N2);
        race[8] = new CargoCar("Карго престиж", "Дацун", 7, CargoCar.CarryingCapacity.N3);

        for (Transport transport : race) {
            System.out.println(transport);
        }

        for (Transport auto : race) {
            System.out.println();
            System.out.println("!Стартует машина из класса "+ auto.getClass() + ": ");
            if (auto.getClass().equals(Bus.class)){
                Bus bus = (Bus) auto;
                bus.pitStop();
                bus.bestCircleTime();
                bus.maximumSpeed();
            } else if (auto.getClass().equals(Car.class)) {
                Car cur = (Car) auto;
                cur.pitStop();
                cur.bestCircleTime();
                cur.maximumSpeed();
            } else if (auto.getClass().equals(CargoCar.class)) {
                CargoCar cargoCar = (CargoCar) auto;
                cargoCar.pitStop();
                cargoCar.bestCircleTime();
                cargoCar.maximumSpeed();
            }

            System.out.println();
            System.out.println("     !!!!ГОНКИ НАЧАЛИСЬ В РАЗНЫХ КВАЛИФИКАЦИЯХ!!!!");
            DriverB schumacherB = new DriverB("Шумахер", 30);
            Car car = (Car) race[0];

            System.out.println(car);
            car.bodyType.DetermineСarType();
            schumacherB.toRule(car);
            System.out.println();

            DriverC schumacherC = new DriverC("Чемптон мира Дакар", 15);
            CargoCar cargoCar = (CargoCar) race[6];

            System.out.println(cargoCar);
            cargoCar.carryingCapacity.DetermineСarType();
            schumacherC.toRule(cargoCar);
            System.out.println();

            DriverD schumacherD = new DriverD("Лучший шоссейный водитель года", 10);
            Bus bus = (Bus) race[3];

            System.out.println(bus);
            bus.capacityType.DetermineСarType();
            schumacherD.toRule(bus);
            System.out.println();
        }
    }
}