import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("漢文入力：");
		String line = stdIn.nextLine();
		stdIn.close();
		char[] after = new char[line.length()];
		char buffer = 0;
		int j = 0;

		for(int i = 0; i < line.length()-1; i++, j++){
			if(line.charAt(i+1) == '二'){
				buffer = line.charAt(i);
				i++;
				j--;
			}else if(line.charAt(i+1) == '一'){
				after[j] = line.charAt(i);
				after[j+1] = buffer;
				i++;
			}else{
				after[j] = line.charAt(i);
			}
		}
		j++;
		if(line.charAt(line.length()-1) == '一'){
			after[j] = line.charAt(line.length()-1);
			after[j] = buffer;
		}else{
			after[j] = line.charAt(line.length()-1);
		}

		String newline = String.valueOf(after);
		System.out.print("書き下し文：");
		System.out.println(newline);
	}


}
