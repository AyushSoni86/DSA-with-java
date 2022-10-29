public class maze_Problem_Using_Backtracking{
	public static void main(String[] args){
		boolean[][] arr = {
			{true, true, true},
			{true, true, true},
			{true, true, true},
		};
		maze(arr, 0, 0, "");
	}

	static void maze(boolean[][] arr, int r, int c, String p){
		if(r == arr.length-1 && c == arr[0].length-1){
			System.out.println(p);
			return;
		}
		if(arr[r][c] == false) return;
		arr[r][c] = false;
		// up
		if(r > 0)
			maze(arr, r - 1, c, p + "Up ");
		// down
		if(r < arr.length - 1)
			maze(arr, r + 1, c, p + "Down ");
		// right
		if(c < arr[0].length - 1)
			maze(arr, r, c + 1, p + "Right ");
		// left
		if(c > 0)
			maze(arr, r, c - 1, p + "Left ");
		arr[r][c] = true;
	}


}