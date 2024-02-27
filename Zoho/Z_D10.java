package Zoho;
/*
10. calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
Money: Total money one has to spend.
Price: price per chocolate.
wrappers: minimum number of wrappers for exchange choco: number of chocolate for wrappers.
Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
example: input: Money:40 Price:1 wrappers:3 choco:1 Max visit:1 Output: total chocolate can eat: 53 wrappers left in hand:14
 1.money = 16, price = 2, wrap = 2 => 15
 Input:   money = 15, price = 1, wrap = 3
Output:   22
*/
public class Z_D10 {
    public static void main(String[] args) {
        int arr[]=findChocWrap(40,1,3,1);
        System.out.println("The chocolates can eat: "+arr[0]+" The wrappers left behind: "+arr[1]);
    }

    private static int[] findChocWrap(int money, int pricePerChoco, int wrapsPerChoco, int maxVisit) {
        int chocolates=money/pricePerChoco;
        int wrapAvailable=chocolates;
        if(maxVisit==0) { //We make the maxVisit as infinity
            while (wrapAvailable >=wrapsPerChoco) {//We check whether the available wrappers are eligible for chocolate
                chocolates += wrapAvailable / wrapsPerChoco;//We increment chocolates ate by new chocolate bought from wrapper exchange
                int currAvailable = wrapAvailable / wrapsPerChoco;//we store the new wrappers got through new set of chocolates bought through exchange
                wrapAvailable -= (wrapAvailable / wrapsPerChoco) * wrapsPerChoco;//we decrement the exchanged wrappers from available wrappers
                wrapAvailable += currAvailable;//increment with new set of wrappers

            }
        }
        else{
            while (maxVisit>0) {
                //This is in case of maxVisit is more than 0
                chocolates += wrapAvailable / wrapsPerChoco;
                int currAvailable = wrapAvailable / wrapsPerChoco;
                wrapAvailable -= (wrapAvailable / wrapsPerChoco) * wrapsPerChoco;
                wrapAvailable += currAvailable;
                //Whenever we exchange we must decrement the visit
                maxVisit--;
            }
        }
        int arr[]=new int[2];
        arr[0]=chocolates;
        arr[1]=wrapAvailable;
        return arr;

    }
}
