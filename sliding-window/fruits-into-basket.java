class Solution {
    public int totalFruit(int[] fruits) {
        int low = 0;
        int high = 0;
        int res = 0;
        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (high = 0; high < fruits.length; high++) {
            int c = fruits[high];
            h1.put(c, h1.getOrDefault(c, 0) + 1);

            while (h1.size() > 2) {
                int leftInt = fruits[low];
                h1.put(leftInt, h1.get(leftInt) - 1);
                low++;
                if (h1.get(leftInt) == 0) {
                    h1.remove(leftInt);
                }
                
            }

            if (h1.size() == 2 || h1.size() <= 2) {
                res = Math.max(res, high - low + 1);
            }

        }
        return res;
    }
}