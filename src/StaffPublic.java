public class StaffPublic {
    private String name;
    private int age;
    private String extra;

    public StaffPublic(){
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getExtra() {
        return extra;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
    @Override
    public String toString(){
        return name + " " + age + " " + extra;
    }
}
