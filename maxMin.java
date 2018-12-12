import java.util.Scanner;
public class maxMin{
	public static void main(String[] args){
		int[][] list = {{2,41,8,10,3,4,72},
				 {11,5,10,2,6,25,32},
				 {99,3,2,73,22,34,23}};
		int i, j, max, min;
		min=max= list[0][0];
		for(i = 0; i < list.length; i++){
			for(j=0; j<list[0].length; j++){
				if(min>list[i][j]){
					min=list[i][j];
				}

				if(max<list[i][j]){
					max=list[i][j];
				}
			}
		}
		System.out.println("Maximo: " + max + " Minimo: " + min);
	}
}
