package ss8_clean_code_and_refactoring.bai_tap;

public class TennisGame {
    public static final String FIFTEEN = "Fifteen";
    public static final String LOVE = "Love";
    public static final String THIRTY = "Thirty";
    public static final String FORTY = "Forty";
    public static final String ALL = "All";
    public static final String DEUCE = "Deuce";
    public static final String ADVANTAGE1 = "Advantage player1";
    public static final String ADVANTAGE2 = "Advantage player2";
    public static final String WINFOR1 = "Win for player1";
    public static final String WINFOR2 = "Win for player2";
    public static final char SUBTRACTION = '-';
    public static String getScore(int score1, int score2) {
        String score = "";
        int tempScore;
        if (score1 == score2) {
            switch (score1) {
                case 0:
                    score = LOVE + SUBTRACTION + ALL;
                    break;
                case 1:
                    score = FIFTEEN + SUBTRACTION + ALL;
                    break;
                case 2:
                    score = THIRTY + SUBTRACTION + ALL;
                    break;
                case 3:
                    score = FORTY + SUBTRACTION + ALL;
                    break;
                default:
                    score = DEUCE + SUBTRACTION + ALL;
                    break;

            }
        } else if (score1 >= 4 || score2 >= 4) {
            int minusResult = score1 - score2;
            if (minusResult == 1) score = ADVANTAGE1;
            else if (minusResult == -1) score = ADVANTAGE2;
            else if (minusResult >= 2) score = WINFOR1;
            else score = WINFOR2;
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = score1;
                else {
                    score += SUBTRACTION;
                    tempScore = score2;
                }
                switch (tempScore) {
                    case 0:
                        score += LOVE;
                        break;
                    case 1:
                        score += FIFTEEN;
                        break;
                    case 2:
                        score += THIRTY;
                        break;
                    case 3:
                        score += FORTY;
                        break;
                }
            }
        }
        return score;
    }
}
