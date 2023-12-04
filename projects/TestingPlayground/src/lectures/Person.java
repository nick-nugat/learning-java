package lectures;


public class Person implements Comparable<Person>
{

    private String name;
    private int age;

    //no arg constructor
    public Person(){
        this.name = "noname";
        this.age = 18;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    //implementing a equals() method (overriden)
    @Override
    public boolean equals(Object p){ //parameter is an object because we don't know what it will be yet
        Person temp = (Person) p; //casting the Object to Person
        if (this.name.equals(temp.name)
                && this.age == temp.age) return true;
        return false;
    }

    public double getPay(){
        return 0;
    }

    @Override
    public String toString(){
        return this.name + ", " + this.age;
    }


    @Override
    public int compareTo(Person o) {
        Person p = (Person) o;

        return (this.age - o.age);
    }
}
