public class ForeachTest01 {
    public static void main(String[] args) {
        int[] arr={111,222,312,4441,123};
        for(int i:arr){
            System.out.println(i);
        }
        for (int data :
                arr) {
            System.out.println(data);
        }
    }
}
