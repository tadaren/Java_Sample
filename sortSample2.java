
import java.util.ArrayList;
import java.util.Scanner;

public class sortSample2 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		for(int j = 0;j < 2;j++){
			System.out.print("入力");
			int in = stdIn.nextInt();
			ArrayList<int[]> list = new ArrayList<int[]>();//リストの作成

			for(int i = 0; i < in; i++){
				int[] sub = {stdIn.nextInt(),stdIn.nextInt()};
				list.add(sub);
			}
			System.out.println(list);	//リストを表示
//			list.sort(null);		//リストをソートする
			System.out.println(list);	//ソートしたリストを表示

		}

	}

}
