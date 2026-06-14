import java.util.*;
public class Strings {

    // public static String subString(String str, int startindex, int endindex){
    //     String subStr ="";
    //     if(endindex> str.length()){
    //         System.out.println("String out of bound cbacuase you provided a endindex which is greater than the length of the given inputed string");
    //         return "";
    //     }
    //     for(int i=startindex ; i<endindex;i++){
    //         subStr = subStr + str.charAt(i);
    //     }
    //     return subStr;
    // }
    public static int maxString(String arr[] ){
        int maxLength = Integer.MIN_VALUE;
        int index=0;
        for(int i=0 ; i<arr.length ; i++){
            if(arr[i].length() > maxLength){
                maxLength = arr[i].length();
            }
            if(arr[i].length() == maxLength){
                index = i;
            }
            
        }
        System.out.println("The maximum string is :"+arr[index]);
        System.out.print("The index of string having the maximum length is:");
        return index;
    }

    public static void main(String[] args) {
        String str = "Kirtan thakkar";
        // System.out.println(subString(str, 0, 10));

        String arr[] = {"kirtan","thakkar","hello"};
        System.out.print(maxString(arr));

        StringBuilder stringBuilder = new StringBuilder("");
        for(char ch='a'; ch<='z' ;ch++){
            stringBuilder.append(ch);
        }
        System.out.println(stringBuilder);

        

    }
}
