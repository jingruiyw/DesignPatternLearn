package jr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ain {
    public static void main(String[] args) {
        String m = "aaadcv";
        System.out.println(zip(m));
    }

    private static String zip(String m) {

        List<String> list = Arrays.asList(m);
        String[] arr = list.toArray(new String[list.size()+1]);

        int length = arr.length;

        if(length == 1) {
            return arr[0];
        }

        List temp = new ArrayList<>();

        int flag = 0;
        for(int i=0; i< arr.length; i++) {
            if(arr[i].equals(arr[i+1])) {
                flag = flag + 1;
                if(flag !=1){
                    temp.add(arr[i]);
                    temp.add(flag);
                }
                temp.add(arr[i]);
            }
        }

        return temp.toArray().toString();
    }

}

