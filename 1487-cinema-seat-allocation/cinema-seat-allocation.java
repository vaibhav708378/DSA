class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int seat[] : reservedSeats) {
            int row = seat[0];
            int col = seat[1];

            map.put(row, map.getOrDefault(row, 0) | (1 << col));
        }

        int result = (n - map.size()) * 2;

        for(int reserved : map.values()) {

            boolean left = (reserved & 60) == 0;
            boolean middle = (reserved & 240) == 0;
            boolean right = (reserved & 960) == 0;

            if(left && right) {
                result += 2;
            } else if (left || middle || right) {
                result += 1;
            }
        }

        return result;
    }
}