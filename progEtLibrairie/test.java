import java.util.Scanner;

public class test{
    final static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] tabMenuet = {
        {96,32,69,40,148,104,152,119,98,3,54},
        {22,6,95,17,74,157,60,84,142,87,130},
        {141,128,158,113,163,27,171,114,42,165,10},
        {41,63,13,85,45,167,53,50,156,61,103},
        {105,146,153,161,80,154,99,140,75,135,28},
        {122,46,55,2,97,68,133,86,129,47,37},
        {11,134,110,159,36,118,21,169,62,147,106},
        {30,81,24,100,107,91,127,94,123,33,5}};

        for(int i = 0; i < 3 ; i++){
        	for (int j = 0 ; j<5;j++) {
	        	System.out.println(tabMenuet[i][j]);
        		
        	}
        }
	}
}