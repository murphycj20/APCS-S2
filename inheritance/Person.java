public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        this.firstName = "";
        this.lastName = "";
    }

    public Person(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }

    public void print() {
        System.out.println(this.toString());
    }

    public void printFirstLast() {
        System.out.println(this.lastName + ", " + this.firstName);
    }

    public String getFirst(){return this.firstName;}
    public String getLast(){return this.lastName;}

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public void setName(String first, String last) { 
        this.firstName = first; 
        this.lastName = last;
    }

    public boolean equals(Object obj) { 
        return (obj instanceof Person && (((Person) obj).getFirst().equals(firstName) && ((Person) obj).getLast().equals(lastName))); 
    }

    public Person getCopy() {
        return new Person(firstName, lastName);
    }

    public void copy(Person person) {
        this.firstName = person.getFirst();
        this.lastName = person.getLast();
    }
}