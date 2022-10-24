package race;

public abstract class Transport {
    protected String brand;
    protected String model;
    protected float engineVolume;

    public Transport(String brand, String model, float engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    protected abstract void startMoving();

    protected abstract void stopMoving();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty()) {
            throw new IllegalArgumentException("Не задана Модель");
        }else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty()) {
            throw new IllegalArgumentException("Не задана Марка");
        }else {
            this.model = model;
        }
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            throw new IllegalArgumentException("Объем двиготеля должен быть положительным целым числом");
        }else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public String toString() {
        return "brand = " + brand + ", model = " + model + ", engineVolume = " + engineVolume;
    }
}
