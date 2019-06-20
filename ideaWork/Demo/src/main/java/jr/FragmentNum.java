package jr;

/**
 * 一个想的很失败的例子
 */
public class FragmentNum {

    public static void main(String[] args) {
        System.out.println(equalsTo("man","a"));
    }

    public static boolean equalsTo(String num1 , String num2){
        boolean flag = false;
        if(num1.contains("M")){
            flag = true;
        }
//        num1.split(",")
        return flag;
    }
}
