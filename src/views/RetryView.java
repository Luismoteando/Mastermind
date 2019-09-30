package views;

import java.util.Scanner;

import controllers.RetryController;

public class RetryView {
	
	private RetryController retryController;

	public RetryView(RetryController retryController) {
		this.retryController = retryController;
	}

	public boolean interact() {
		System.out.println(Message.RETRY);
		Scanner scanner = new Scanner(System.in);
		String retry = scanner.next();
		if (retry.equals("s")) {
			this.retryController.retry();
			return true;
		} else {
			System.out.println(Message.GOODBYE);
			return false;
		}
	}
}
