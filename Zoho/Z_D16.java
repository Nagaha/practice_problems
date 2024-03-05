package Zoho;
/*16.Assume there exists infinite grid, you’re given initial position x, y. Inputs will be movements either L or R or U or D. After n inputs, you need to give the current position.
•	Input:
•	4 5 //initial position x, y
•	9 //number of movements
•	U L R R D D U L R //7 movements
•	Output:
     5 5
*/
public class Z_D16 {
    public static void main(String[] args) {
        String movements="ULRRDDULR";
        int x=4;
        int y=5;
        afterMovements(movements,x,y);
    }

    private static void afterMovements(String movements, int x, int y) {
        //The program is simple and don't confuse this with matrix index imagine it as graph
        //Based on the movement direction we move our position and finally we return the final position
        for(int i=0;i<movements.length();i++){
            switch(movements.charAt(i)){
                case 'U': {
                    y++;
                    break;
                }
                case 'D': {
                    y--;
                    break;
                }
                case 'R': {
                    x++;
                    break;
                }
                case 'L': {
                    x--;
                    break;
                }
            }
            
        }
        System.out.println("The final position is "+x+" "+ y);
    }
}
