package model;

public class Round {

    public static final String ROUND_INPUT_ERROR_MESSAGE = "라운드 입력이 잘못되었습니다.";

    static void validateRound(int round) {
        if (round <= 0) {
            throw new IllegalArgumentException(ROUND_INPUT_ERROR_MESSAGE);
        }
    }
}
