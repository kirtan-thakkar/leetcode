public class array {
    public static void update(int marks[]){
        float sum=0;
        for(int i=0;i<marks.length;i++){
            sum = sum + marks[i];
        }
        float average = sum / marks.length ;
        System.out.print(average);

    }
    public static void main(String[] args) {
        int marks[] = {98,95,99,88,3,2,54,2,5,56,5,3};
        update(marks);
    }
}
