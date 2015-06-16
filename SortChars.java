public class SortChars {
	public static void main(String[] args){
/*		String input = "abcdbacdabcca";
		char[] inputArr = input.toCharArray();

 		int[] arr = new int[26];

		/*for(int i = 0; i < arr.length; i++){
			arr[i] = 0;
		}*/

/*		for(int i = 0 ; i < inputArr.length; i++){
		    arr[((int)inputArr[i] - (int)'a')]++;
		}
		//for(int i = arr.length-1; i >= 0 ; i--){
		//if(arr[i] != 0)
		//System.out.print(((char)((int)'a'+i)) + ": " + arr[i]);
		for(int i = 0; i < arr.length ; i++){
			for(int j = 0; j< arr[i] ; j++){
				System.out.print(((char)((int)'a'+i)) );
			}
		}
*/	
		int[][] arr  =new int[][] {
				{ 1 , 2 , 3 , 4 , 5 },
				{ 6 , 7 , 8 , 9 , 10 },
				{ 11 , 12 , 13, 14, 15 },
				{ 16 , 17 , 18, 19, 20 },
				{ 21 , 22 , 23, 24, 25 },
			     };
		
		
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j <= i; j++){
				System.out.print(arr[j][i-j] + "  " );
			}
System.out.println();
		}
	}
}