package stacks;

import java.util.Arrays;

public class FinalPricesWithShop {
    public static void main(String[] args) {
        int[] prices = {8, 4, 6, 2, 3};
        int[] res = new int[prices.length];
        int k = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length - 1; j++) {
                if (prices[j] < prices[i]) {
                    res[k++] = prices[i] - prices[j];
                    break;
                } else {
                    res[k++] = prices[i];
                }
            }
        }

        res[k++] = prices[prices.length - 1];

        System.out.println(Arrays.toString(res));
    }
}
