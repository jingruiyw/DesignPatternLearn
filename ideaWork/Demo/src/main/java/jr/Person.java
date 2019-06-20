package jr;

public class Person implements Cloneable{
    private Integer age;
    private String name;
    private Address add;

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public Person(Integer age, String name, Address add) {
        this.age = age;
        this.name = name;
        this.add = add;
    }

    public Person() {
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class Address{
        private String name;

        public Address(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}


