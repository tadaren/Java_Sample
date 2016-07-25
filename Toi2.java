package kaito;

import java.util.ArrayList;
import java.util.Scanner;

public class Toi2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		int N = stdIn.nextInt();
		for(int i = 0; i < N; i++){
			list.add(stdIn.nextInt());
		}

		list.sort(null);
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i = 0; i <= N; i++){
			int count = 0;
			for(int j = 0; j < N; j++){
				if(list.get(j)-i >= 0){
					count++;
				}
			}
			list1.add(count);
		}

		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = 0; i <= N; i++){
			if(list1.get(i) == i){
				list2.add(i);
			}
		}

		list2.sort(null);
		System.out.println(list2.get(list2.size()-1));

		for(int i = N; i > 0; i++){

		}
	}

}
