class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        res.add(-1);
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> reverse = new Stack<>();
        s1.push(arr[arr.length-1]);
        for(int i=arr.length-2;i>=0;i--){
            while(!s1.empty() && s1.peek()>=arr[i]){
                s1.pop();
            }
            if(s1.empty()){
                res.add(-1);
            }else{
                res.add(s1.peek());
            
            }
            s1.push(arr[i]);
                
            
        }
        Collections.reverse(res);
        return res;
        
    }
}