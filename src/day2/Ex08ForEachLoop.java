package day2;

public class Ex08ForEachLoop {
    public static void main(String[] args) {

        int[] arr = {4, 5, 12, 6};

        for(int i = 0; i < args.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("----------------------------------------");

        for(int each : arr){
            System.out.println(each);
        }

        /*
            for(DATATYPE NAME : DATA_STRUCTURE){
                CODE
            }
        */


    }
}
