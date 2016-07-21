
import java.util.ArrayList;
import java.util.Scanner;

public class sortSample {

	public static void main(String[] args) {
		System.out.print("数値をスペースで区切って3つ入力");
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();//リストの作成
		list.add(stdIn.nextInt());	//リストに入力を追加
		list.add(stdIn.nextInt());
		list.add(stdIn.nextInt());
		System.out.println(list);	//リストを表示
		list.sort(null);				//リストをソートする
		System.out.println(list);	//ソートしたリストを表示
	}

}
