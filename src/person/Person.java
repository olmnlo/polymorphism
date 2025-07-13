package person;
public class Person {
    private String name;
    private int age;
    private String saudi_id;
    private boolean license;

    public Person(String name, int age, String saudi_id, boolean license) {
        this.name = name;
        this.age = age;
        this.saudi_id = saudi_id;
        this.license = license;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>0) {
            this.age = age;
        }else {
            throw new RuntimeException("You cannot enter negative number for age");
        }
    }

    public String getSaudi_id() {
        return saudi_id;
    }

    public void setSaudi_id(String saudi_id) {
        this.saudi_id = saudi_id;
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }
}
