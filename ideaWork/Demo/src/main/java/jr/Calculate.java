package jr;

public class Calculate {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, -1, 2, 0, 3, 0, -2, 4};
        Integer[] wrap = wrap(array);
        for(int i =0; i < wrap.length; i++){
            System.out.println(wrap[i]);
        }
    }

    private static Integer[] wrap(Integer[] array){
        Integer flag = 0;
        for(int i = 0; i < array.length - flag; i++) {
            if(array[i] == 0) {
                flag++;
                Integer temp = array[i];
                array[i] = array[array.length - 1];
                array[array.length - flag] = temp;
            }
        }
        return array;
    }
}
