import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper_Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		//入力部分
		int size = 0;
		int bombs = Integer.MAX_VALUE;
		while(size == 0){
			System.out.print("フィールドサイズの入力:");
			size = sc.nextInt();
		}
		while(bombs > size*size){
			System.out.print("爆弾の数の入力:");
			bombs = sc.nextInt();
		}

		//マップフィールドの作成
		HashMap<Integer, Integer> field = new HashMap<Integer, Integer>();
		HashMap<Integer, String> openField = new HashMap<Integer, String>();
		for(int i = 0; i < size*size; i++){
			field.put(i, 0);
			openField.put(i, "-");
		}
		//爆弾の生成
		for(int i = 0; i < bombs; i++){
			int bombkey = rand.nextInt(field.size());
			if(field.get(bombkey) != 9){
				field.put(bombkey, 9);
			}else{
				i--;
			}
		}

		//描画
		paintopen(openField, size);

		//爆弾の数のカウント
		for(int i = 0; i < field.size(); i++){
			if(field.get(i) == 9){
				//上
				try{
					if(field.get(i-size) != 9){
						field.put(i-size, field.get(i-size)+1);
					}
				}catch(NullPointerException e){}
				//下
				try{
					if(field.get(i+size) != 9){
						field.put(i+size, field.get(i+size)+1);
					}
				}catch(NullPointerException e){}
				//左
				try{
					if(field.get(i-1) != 9){
						field.put(i-1, field.get(i-1)+1);
					}
				}catch(NullPointerException e){}
				//右
				try{
					if(field.get(i+1) != 9){
						field.put(i+1, field.get(i+1)+1);
					}
				}catch(NullPointerException e){}
				//右上
				try{
					if(field.get(i-size+1) != 9){
						field.put(i-size+1, field.get(i-size+1)+1);
					}
				}catch(NullPointerException e){}
				//右下
				try{
					if(field.get(i+size+1) != 9){
						field.put(i+size+1, field.get(i+size+1)+1);
					}
				}catch(NullPointerException e){}
				//左上
				try{
					if(field.get(i-size-1) != 9){
						field.put(i-size-1, field.get(i-size-1)+1);
					}
				}catch(NullPointerException e){}
				//左下
				try{
					if(field.get(i+size-1) != 9){
						field.put(i+size-1, field.get(i+size-1)+1);
					}
				}catch(NullPointerException e){}
			}
		}

		//メインループ
		int count = 0;
		while(true){
			//座標入力
			System.out.print("m:");
			int m = sc.nextInt();
			System.out.print("n:");
			int n = sc.nextInt();
			//判定
			if(field.get(m*size+n) == 9){
				System.out.println("GAMEOVER");
				paint(field, size);
				break;
			}else if(openField.get(m*size+n).equals("-")){
				openField.put(m*size+n, field.get(m*size+n)+"");
				paintopen(openField, size);
				count++;
				if(count == size*size-bombs){
					System.out.println("CLEAR");
					paint(field, size);
					break;
				}
			}else{
				System.out.println("すでに入力されています");
			}
		}
	}

	//描画
	private static void paint(HashMap<Integer, Integer> field, int size){
		for(int i = 0,j = 1; i < field.size(); i++){
			int value = field.get(i);
			if(value == 9){
				System.out.print("*");
			}else{
				System.out.print(value);
			}
			if(i == size*j-1){
				System.out.println();
				j++;
			}
		}
	}
	private static void paintopen(HashMap<Integer, String> field, int size){
		for(int i = 0,j = 1; i < field.size(); i++){
			String value = field.get(i);
			System.out.print(value);
			if(i == size*j-1){
				System.out.println();
				j++;
			}
		}
	}

}
