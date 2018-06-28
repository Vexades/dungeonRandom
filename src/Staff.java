import java.math.BigDecimal;

public class Staff {
    private String name;
    private int age;
    private BigDecimal salary;

    public Staff(String name, BigDecimal salary, int age){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return name + " " + age;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
