public class Person {
    private String name;
    private String id;
    private String year_birth;

    public Person(){
        this.name = "Person";
        this.id = "000";
        this.year_birth = "2000";
    }
    
    public Person(String name, String year_birth){
        this.name = name;
        this.year_birth = year_birth;
    }

    public Person(String name, String id, String year_birth){
        this.name = name;
        this.id = id;
        this.year_birth = year_birth;
    }

    public Person(Person s){
        this.name = s.name;
        this.id = s.id;
        this.year_birth = s.year_birth;
    }

    
    public static void main(String[] args){
        Person s1 = new Person("Nguyen Van An", "17020001","2000");
        Person s2 = new Person("Nguyen Van B", "17020002", "2001");
        Person s3 = new Person("Nguyen Van C", "17020003", "2002");
        Person s4 = new Person("Nguyen Van D", "17020004", "2003");
        Person s5 = new Person("Tran van An", "1990");
        Person s6 = new Person("Tran Van B", "1985");

    }
}
