/**
 * 2 arrays ‘m’ and ‘n’. Array ’m’ contains the
 * cost of fuel that day. Array ‘n’ contains the
 * required fuel for that day. You can buy any
 * amount of fuel any day. You need to find
 * the minimum cost to fullfill the fuel
 * requirements.
 * Example:
 * m = [4, 5, 1, 3, 6]
 * n = [3, 4, 7, 12, 2]
 * The minimum cost is to buy 3L of fuel on
 * first day costing 4Rs/L and buy 4L of fuel
 * for the next day at 4Rs/L since, next day
 * the rate of fuel is 5rs. And then buy rest of
 * the fuel required at 1Rs/L the 3rd day.
 * (4*3) + (4*4) + (1*7) + (1*12) + (1*2) = 49*/
public class Hyperverge {
    public static void main(String[] args) {
        int m[]={4, 5, 1, 3, 6};
        int n[]={3, 4, 7, 12, 2};
        int cost=findMinCost(m,n);
        System.out.println(cost);
    }

    private static int findMinCost(int[] cost, int[] need) {
        int min=cost[0];
        int minCost=0;
        for(int i=0;i< need.length;i++){
            min=Math.min(min,cost[i]);
            minCost+=(need[i]*min);
            System.out.println(min);
        }
        return minCost;
    }

}
