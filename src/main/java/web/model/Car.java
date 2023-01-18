package web.model;

import java.util.Objects;

public class Car {
    private Long id;
    private String model;
    private Double engine;

    public Car() {
    }

    public Car(String model, Double engine) {
        this.model = model;
        this.engine = engine;
    }

    public Car(Long id, String model, Double engine) {
        this.id = id;
        this.model = model;
        this.engine = engine;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getEngine() {
        return engine;
    }

    public void setEngine(Double engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) &&
                Objects.equals(model, car.model) &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        int hashResult = (int) (31 * id);
        hashResult *= model.hashCode();
        hashResult *= engine.hashCode();
        return hashResult;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
