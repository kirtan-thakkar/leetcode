 // why heap -> cause we need the the max freq of the particular task so that we can arrange them in particular seat so that they atleasst have n gaps between them and accordingly we can arrange the other between them which would be the best optimal way and would require less number of seats/cpu
class Solution {
    public int leastInterval(char[] tasks, int n) {

        // Frequency map
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : tasks) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Max Heap
        // {frequency, task, nextAvailableTime}
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>(
            (a, b) -> {
                if (a[0] != b[0]) {
                    return b[0] - a[0];
                }
                return a[1] - b[1];
            }
        );

        // Put all tasks into heap
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {

            maxHeap.offer(new int[]{
                entry.getValue(),
                entry.getKey(),
                1
            });
        }

        int time = 1;

        while (!maxHeap.isEmpty()) {

            ArrayList<int[]> temp = new ArrayList<>();

            while (!maxHeap.isEmpty()) {

                int[] curr = maxHeap.poll();

                int frequency = curr[0];
                int task = curr[1];
                int nextAvailable = curr[2];

                // Task can be executed
                if (nextAvailable <= time) {

                    if (frequency > 1) {

                        maxHeap.offer(new int[]{
                            frequency - 1,
                            task,
                            time + n + 1
                        });
                    }

                    break;
                }

                // Task is still in cooldown
                temp.add(curr);
            }

            // Put the unavailable tasks back
            for (int[] curr : temp) {
                maxHeap.offer(curr);
            }

            time++;
        }

        return time - 1;
    }
}
       