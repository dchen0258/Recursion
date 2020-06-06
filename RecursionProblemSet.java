import java.util.ArrayList;

import acm.program.*;

public class RecursionProblemSet extends ConsoleProgram {

	public void run() {
		ArrayList squares2 = new ArrayList<Integer>();
		ArrayList squares = new ArrayList<Integer>();
		squares.add(3);
		squares.add(1);
		squares.add(2);
		squares.add(7);
		squares.add(6);
		squares.add(0);

		println(ReverseString("goodnight"));
		println(SumOfDigits(256));
		PrintInBinary(6);
		println();
		println(GCD(10, 4));
		println(Solvable(0, squares, squares2));
		
		int numberOfLevels = readInt("How many levels of the Tower do you want: ");
		int pole1 = 1;
		int pole2 = 2;
		int pole3 = 3;
		towersOfHanoi(numberOfLevels, pole1, pole2, pole3);
	}

	public String ReverseString(String str) {
		if (str.length() == 1) {
			return (str);
		} else {
			return (str.substring(str.length() - 1, str.length()) + ReverseString(str.substring(0, str.length() - 1)));
		}
	}

	public int SumOfDigits(int x) {
		if (x < 10) {
			return (x);
		} else {
			return ((x % 10) + SumOfDigits(x / 10));
		}
	}

	public void PrintInBinary(int num) {
		if (num < 2) {
			print(num);
		} else {
			PrintInBinary(num / 2);
			print(num % 2);
		}
	}

	public int GCD(int x, int y) {
		if (x % y == 0) {
			return y;
		} else {
			return GCD(y, x % y);
		}
	}

	public boolean Solvable(int start, ArrayList<Integer> squares, ArrayList<Integer> squares2) {
		if (start < 0 || start > squares.size() - 1) {
			return false;
		} else if (squares.get(start) == 0) {
			return true;
		} else if (squares2.contains(start)) {
			return false;
		} else {
			squares2.add(start);
			return (Solvable(start - squares.get(start), squares, squares2)
					|| Solvable(start + squares.get(start), squares, squares2));
		}
	}

	public void towersOfHanoi(int discs, int pole1, int pole2, int pole3) {
		if (discs == 1) {
			println(pole1 + " to " + pole3);
		} else {
			towersOfHanoi(discs - 1, pole1, pole3, pole2);
			towersOfHanoi(1, pole1, pole2, pole3);
			towersOfHanoi(discs - 1, pole2, pole1, pole3);
		}
	}

}
