public class binarySearch {
    static void BiSear(int arr[], int key){
        int mid,start,end;
        start = 0;
        end=arr.length -1;
        int flag=0;
        int index=0;
        while(start<=end){
            mid= (start + end)/2;
            if(arr[mid]==key){
                flag=1;
                index=mid;
                break;
            }else{
                if(key>arr[mid]){
                    start=mid+1;
                    mid = (start+end)/2;
                    
                }else{
                    end=mid-1;
                    mid=(start+end)/2;
                }
            } 
        }
        if(flag==1){
            System.out.print("The number is found at" +" "+ index +" "+"Index");
        }else{
            System.out.print("Not found");
        }

    }
    public static void main(String args[]){
        int arr[] = {2,4,6,8,10,12};
        int keys = 10; 
        BiSear(arr,keys);
        

    }

}
