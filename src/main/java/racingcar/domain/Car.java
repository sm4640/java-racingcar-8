package racingcar.domain;

public class Car {
    private static final int MAX_NAME_LENGTH = 5;
    private final String name;
    private int distance = 0;

    public Car(String name) {
        this.validateName(name);
        this.name = name;
    }

    public Car(String name, int distance) {
        this.validateName(name);
        this.name = name;
        this.distance = distance;
    }

    public void validateName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Car name cannot be blank");
        }

        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException("Car name cannot be longer than 5");
        }
    }

    public void move(int randomNumber) {
        if (randomNumber >= 4) {
            distance++;
        }
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
    }


}
