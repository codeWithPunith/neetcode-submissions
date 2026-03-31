class Solution {
    public int getSum(int a, int b) {
        int res = 0;
        int carry = 0;
        int bit = 1;

        for (int i = 0; i < 32; i++) {
            int carryPresent = carry;
            int aBit = ((a & bit) != 0) ? 1 : 0;  
            int bBit = ((b & bit) != 0) ? 1 : 0;   
            int sumBit = aBit ^ bBit ^ carryPresent;  
            if (sumBit == 1) res |= bit;              
            int carryNext = (aBit & bBit) | ((aBit ^ bBit) & carryPresent); 

            bit = bit * 2;
            carry = carryNext;
        }
        return res;
    }
}