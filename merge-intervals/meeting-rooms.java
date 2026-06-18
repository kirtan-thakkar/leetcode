class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        int i=0;
        int j=0;
        int room =0;
        int res=0;
        Arrays.sort(start);
        Arrays.sort(end);
        while(i<start.length  &&  j<end.length){
            if(start[i]<end[j]){
                room++;
                res = Math.max(res,room);
                i++;
            }else{
                room--;
                j++;
            }
        }
        return res;
    }
}
