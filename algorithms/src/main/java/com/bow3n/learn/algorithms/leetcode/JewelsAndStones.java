package com.bow3n.learn.algorithms.leetcode;

/**
 * link
 *
 * <custom href="https://leetcode-cn.com/problems/jewels-and-stones/">宝石和石头</custom>
 *
 * @author bowen
 */
public class JewelsAndStones {

    public int numJewelsInStones(String J, String S) {
        int num = 0;
        for (char c : S.toCharArray()) {
            if (J.indexOf(c) > -1) {
                num++;
            }
        }
        return num;
    }
}
