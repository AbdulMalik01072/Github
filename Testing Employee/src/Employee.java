public class Employee {

    public int id;
    public String name;

    public Employee(int id ,String name){
     this.id=id;
     this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if(this.id ==e.id && this.name.equals(e.name)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}
