package views;

import java.util.ArrayList;

import models.Result;

public class ResultView {
	
	private ArrayList<Result> results;

	public ResultView(ArrayList<Result> results) {
		this.results = results;
	}

	public void print() {
		for(Result result : results) {
			System.out.println(result.toString());
		}
	}

}
