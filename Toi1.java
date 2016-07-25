package kaito;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Toi1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		ArrayList<Integer> listA = new ArrayList<Integer>();
		ArrayList<Integer> listB = new ArrayList<Integer>();
		ArrayList<Integer> listC = new ArrayList<Integer>();
		ArrayList<Integer> listD = new ArrayList<Integer>();

		int N = stdIn.nextInt();

		int X = stdIn.nextInt();
		for(int i = 0; i < X; i++){
			listA.add(stdIn.nextInt());
		}

		int Y = stdIn.nextInt();
		for(int i = 0; i < Y; i++){
			listB.add(stdIn.nextInt());
		}

		int Z = stdIn.nextInt();
		for(int i = 0; i < Z; i++){
			listC.add(stdIn.nextInt());
		}

		for(int i = 0; i < listC.size(); i++){
			for(int j = 0; j < listB.size(); j++){
				if(listC.get(i) == listB.get(j)){
					listD.add(listC.get(i));
				}
			}
		}

		for(int i = 0; i < listC.size(); i++){
			for(int j = 0; j < listA.size(); j++){
				if(listC.get(i) == listA.get(j)){
					listC.remove(i);
				}
			}

		}

		listC.addAll(listD);
		listC.sort(null);

		Set<Integer> set = new HashSet<>(listC);
		List<Integer> listF = new ArrayList<>(set);

		System.out.println(listF.size());


	}

	public static int iN(){
		int i = 0;
		return i;
	}

	public static int total(int iwa,int yama){
		return yama;

	}

}
