package com.ss;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DaysOfMonth {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please, enter number of month");
		int number = Integer.parseInt(br.readLine());

		if (number >= 1 && number <= 12) {
			System.out.println("� ����� ����� " + month_days[number-1]+ " ��.");
			} else {
			System.out.println("� ���� ���� 12 ������, �� ����!");
			}
	}

}
