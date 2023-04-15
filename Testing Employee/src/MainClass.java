public class MainClass {
    public static void main(String[] args) {
        Employee emp1= new Employee(1234,"Abdul");
        Employee emp2= new Employee(1234,"Abdul");

        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp1.equals(emp2));
    }
}