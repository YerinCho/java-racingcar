package model;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private static List<String> winners = new ArrayList<>();

    public static int getMaxPosition(List<Car> cars) {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    public static void setWinner(List<Car> cars) {
        int maxPosition = getMaxPosition(cars);
        for (Car car : cars) {
            if (maxPosition == car.getPosition()) {
                winners.add(car.getName());
            }
        }
    }

    public static List<String> getWinners() {
        return winners;
    }
}
