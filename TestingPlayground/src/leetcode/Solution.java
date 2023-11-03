package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int romanToInt(String s) {
        //associations
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i--) {
            char second = s.charAt(i);
            char initial = s.charAt(i + 1);

            switch(initial) {
                case 'I':
                    if (second == 'V' || second == 'X')
                        num += second - initial;
                    num += map.get('I');
                    break;
                case 'V':
                    num += map.get('V');
                    break;
                case 'X':
                    if (second == 'L' || second == 'C')
                        num += second - initial;
                    num += map.get('X');
                    break;
                case 'L':
                    num += map.get('L');
                    break;
                case 'C':
                    if (second == 'D' || second == 'M')
                        num += second - initial;
                    num += map.get('C');
                    break;
                case 'D':
                    num += map.get('D');
                    break;
                case 'M':
                    num += map.get('M');
                    break;
            }
        }

        return num;

    }
}
