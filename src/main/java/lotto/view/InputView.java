package lotto.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String INPUT_AMOUNT_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String INPUT_LUCKY_NUMBER_MESSAGE = "당첨 번호를 입력해 주세요.";
    private static final String INPUT_BONUS_NUMBER_MESSAGE = "보너스 번호를 입력해 주세요.";

    public int getAmount() {
        System.out.println(INPUT_AMOUNT_MESSAGE);

        return Integer.parseInt(Console.readLine());
    }

    public String getLuckyNumber() {
        System.out.println(INPUT_LUCKY_NUMBER_MESSAGE);

        return Console.readLine();
    }

    public int getBonusNumber() {
        System.out.println(INPUT_BONUS_NUMBER_MESSAGE);

        return Integer.parseInt(Console.readLine());
    }
}
