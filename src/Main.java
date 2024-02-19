public class Main {
    public static void main(String[] args) {

        Person mySelf = new Person.Builder("Claudio", "Gambino")
                .age(38)
                .address("Via Mario Rossi, 1")
                .build();

        Person person = new Person.Builder("Mario", "Balotelli")
                .age(25)
                .build();


        System.out.println("myself:");
        System.out.println("firstName: " + mySelf.getFirstName());
        System.out.println("secondName: " + mySelf.getLastName());
        System.out.println("age: " + mySelf.getAge());
        System.out.println("address: " + mySelf.getAddress());

        System.out.println("person:");
        System.out.println("firstName: " + person.getFirstName());
        System.out.println("secondName: " + person.getLastName());
        System.out.println("age: " + person.getAge());
        System.out.println("address: " + person.getAddress());
    }

}

class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String address;


    Person(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }


    public static class Builder {

        String firstName;
        String lastName;
        Integer age = 0;
        String address = "";

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}