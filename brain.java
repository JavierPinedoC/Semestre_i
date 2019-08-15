//'C' Cyan
//'M' Magenta
//'Y' Yellow
//'W' White
//'G' Grey
//'B' Black

import java.util.Scanner;
public class brain{
	public static void main(String[] args) {
		int n = 0;
		int m = 0;

		boolean colored = false;
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		char color[][] = new char[n][m];

		for(int i=0; i<m; i++){
			for (int j=0; j<n; j++){
				color[i][j] = sc.next().charAt(0);
				if(color[i][j]!='W'){
					if(color[i][j]!='B'){
						colored=true;
					}
				}
			}
		}
		if(colored)
			System.out.print("#Color");
		else
			System.out.print("#Black&White");
	}
}
