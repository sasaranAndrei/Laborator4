package laborator4;

public class Driver {
    private String surname;
    private String firstname;
    private Integer age;
    private Integer noDriversLicense;

    public Driver(String surname, String firstname, Integer age, Integer noDriversLicense) {
        this.surname = surname;
        this.firstname = firstname;
        this.age = age;
        this.noDriversLicense = noDriversLicense;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNoDriversLicense() {
        return noDriversLicense;
    }

    public void setNoDriversLicense(Integer noDriversLicense) {
        this.noDriversLicense = noDriversLicense;
    }

    public static Integer yearMedical (Integer x){
        return 2019 + 10 - x%10;
    }

    public static void nextMedicalInfo (Driver[] drivers){
        for (int i = 0; i < drivers.length; i++){
            System.out.print("Soferul " + drivers[i].getSurname() + " " + drivers[i].getSurname());
            System.out.println(" trebuie sa faca urmtorul control medical in anul " + yearMedical(drivers[i].getAge()));
        }
    }
}
