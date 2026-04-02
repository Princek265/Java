class Demo{
    String name;
    Demo(String name){
        this.name = name;
    }
    public String toString(){
        return "Student name is " + name;
    }
}

class  Animal{}
class Dog extends Animal{} // entends keyword is used to inherit other class

class abc{

    public static void main(String[] args){
        Demo obj = new Demo("Rahul");
        System.out.println(obj);
        Class<?> var = obj.getClass(); // getClass() -> returns Class
        // Class is a class in java.lang package which stores info about any class
        // Class<?> -> we use this when we dont know the type of class
        System.out.println(var);

        Dog d = new Dog();
        // boolean b = d instanceof Dog;
        // boolean c = d instanceof Animal;

        // instanceof is an operator of Object class 
        System.out.println(d instanceof Dog); // true
        System.out.println(d instanceof Animal); // true
        
        Animal a = new Animal();
        System.out.println(a instanceof Dog); // false because a parent does not inherit from a child
        System.out.println(a instanceof Animal); // true
        
    }
}
