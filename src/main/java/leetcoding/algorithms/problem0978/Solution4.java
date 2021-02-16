package leetcoding.algorithms.problem0978;

import org.jetbrains.annotations.NotNull;

public class Solution4 implements Solution {

    @NotNull
    @Override
    public Integer solve(@NotNull int[] input) {
        return Solution.DefaultImpls.solve(this, input);
    }

    @Override
    public int maxTurbulenceSize(@NotNull int[] arr) {
        if (arr.length <= 1) return arr.length;
        int preSign = 0;
        int preSize = 0;
        int maxSize = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int sign = Integer.compare(arr[i + 1], arr[i]);
            int currentSize = sign == 0 ? 0 : (sign * preSign < 0 ? preSize + 1 : 1);
            preSign = sign;
            preSize = currentSize;
            maxSize = Math.max(maxSize, currentSize);
        }
        return maxSize + 1;
    }

}
