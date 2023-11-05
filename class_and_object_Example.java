class puppy {
    int puppyAge;

    puppy() {
        System.out.println("Puppy!");    
    }

    void setAge(int age) {
        puppyAge = age;
    }

    int getAge() {
        return puppyAge;
    }
}

public class class_and_object_Example {
    
    public static void main(String[] args) {
        
        puppy p = new puppy();

        p.setAge(5);
        p.getAge();

        System.out.println(p.puppyAge);
    }
}
