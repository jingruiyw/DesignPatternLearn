package effective3;

/**
 * 测试重写equals方法的几个特性
 *
 * 自反性：x.equals(x) 返回true
 * 对称性：任何对象 x.equals(y) 与 y.equals(x)返回的值相同
 * 传递性：x.equals(y),y.equals(z),x.equals(z) 详情见point类
 * 一致性：两个对象相等，除非他们结构改变否则一直相等
 * 非空性：与null比较返回false
 */
public class EqualsTest {

    private final String s;

    public EqualsTest(String s) {
        this.s = s;
    }

    public static void main(String[] args) {
        EqualsTest et = new EqualsTest("Polish");
        String s = "polish";

        System.out.println(et.equals(s));
        System.out.println(s.equals(et));
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof EqualsTest) {
            return s.equalsIgnoreCase(
                    ((EqualsTest)o).s);
        }

        if (o instanceof String) {
            return s.equalsIgnoreCase((String) o);
        }

        return false;
    }
}
