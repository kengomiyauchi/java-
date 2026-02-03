package curriculum;

public class Question4{

	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5};
		for (int i = 0; i < numbers.length; i++) {
		    System.out.println(numbers[i]);
		}

		
		int[] numbers2 = {10, 20, 30, 40, 50};
		for (int i = numbers2.length - 1; i >= 0; i--) {
		    System.out.println(numbers2[i]);
		}

		
		int[] numbers3 = {3, 5, 7, 9, 11};
		int sum = 0;
		for (int num : numbers3) {
		    sum += num;
		}
		System.out.println("合計: " + sum);
		
		
		// ① 配列を作る
        int[] numbers4 = {12, 7, 9, 21, 5, 18};

        // ② とりあえず最初の数字を最大・最小にする
        int max = numbers4[0];
        int min = numbers4[0];

        // ③ 1つずつ比べる
        for (int i = 0; i < numbers4.length; i++) {

            if (numbers4[i] > max) {
                max = numbers4[i];
            }

            if (numbers4[i] < min) {
                min = numbers4[i];
            }
        }

        // 結果を表示
        System.out.println("最大値: " + max);
        System.out.println("最小値: " + min);
		
        
        int[] numbers5 = {1, 2, 3, 4, 5};
        
        // ① すべて2倍にする
		for (int i = 0; i < numbers5.length; i++) {
			numbers5[i] =numbers[i] *2;
		}
		
		// ② 拡張for文で表示
		for (int n : numbers5) {
		    System.out.println(n);
		}
		
		
        int[] numbers6 = {4, 7, 10, 15, 20};
		
		/* Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        boolean found = false;

        for (int n : numbers6) {
            if (n == input) {
                found = true;
            }
        }

        if (found) {
            System.out.println("入力した値は配列に含まれています");
        } else {
            System.out.println("入力した値は配列に含まれていません");
        } */
        
        
        int[][] array = {{1, 2}, {3, 4}, {5, 6}};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        
        int[][] array2 = {
        	{10, 20, 30},
        	{40, 50, 60}, 
        	{70, 80, 90}
        };
        
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
        	for (int j = 0; j < array2.length; j++) {
        		sum2 += array2[i][j];
        	}
        }
        System.out.println("合計値: " + sum2);
        
        
        int[][] array3 = {
            	{12, 15, 8},
            	{6, 19, 25}, 
            	{30, 2, 10}
            };
        
        int max2 = array3[0][0];
        int min2 = array3[0][0];

        for (int i = 0; i < array3.length; i++) {
        	for (int j = 0; j <array3[i].length; j++) {

            if (array3[i][j] > max2) {
                max2 = array3[i][j];
            }

            if (array3[i][j] < min2) {
                min2 = array3[i][j];
            }
        	}
        }
        
        System.out.println("最大値: " + max2);
        System.out.println("最小値: " + min2);
        
        
        int[][][] array4 = {
                {
                    {1, 2},
                    {3, 4}
                },
                {
                    {5, 6},
                    {7, 8}
                }
            };

            for (int i = 0; i < array4.length; i++) {              // ブロック
                for (int j = 0; j < array4[i].length; j++) {       // 行
                    for (int k = 0; k < array4[i][j].length; k++) { // 列
                        System.out.print(array4[i][j][k] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }	
       
            
            
	}

}
