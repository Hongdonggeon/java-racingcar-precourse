package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.utils.Constant;

public class InputView {
	public static String inputCarNames() {
		System.out.println(Constant.CAR_NAMES_INPUT_ALARM_MESSAGE);
		return Console.readLine();
	}

	public static String inputGameRound() {
		System.out.println(Constant.GAME_TRIAL_COUNT_INPUT_ALARM_MESSAGE);
		return Console.readLine();
	}
}