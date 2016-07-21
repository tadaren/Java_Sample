package javatest;

import java.util.ArrayList;
import java.util.Scanner;

public class sortSample2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("入力");
		int in = stdIn.nextInt();
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();//リストの作成
		ArrayList<Integer> sub = new ArrayList<Integer>();
		list.add(sub);

		for(int i = 0; i < in; i++){
			sub.add(stdIn.nextInt());	//リストに入力を追加
			sub.add(stdIn.nextInt());
			System.out.println(list);	//リストを表示
			list.sort(null);				//リストをソートする
			System.out.println(list);	//ソートしたリストを表示

		}

	}

}
