class Solution {
    public ArrayList<Integer> preGreaterEle(int[] arr) {
        
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        
        Stack<Integer> s1 = new Stack<>();
        s1.push(arr[0]);
        for(int i=1;i<arr.length;i++){
            while(!s1.empty() && s1.peek()<=arr[i]){
                s1.pop();
            }
            if(s1.empty()){
                res.add(-1);
            }else{
                res.add(s1.peek());
            
            }
            s1.push(arr[i]);
                
            
        }
        return res;
    }
}