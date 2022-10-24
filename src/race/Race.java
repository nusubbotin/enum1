package race;

public class Race <T extends Transport & CompetingTransport>{
    public void arrival(T auto){
        auto.pitStop();
        auto.bestCircleTime();
        auto.maximumSpeed();
    }
}