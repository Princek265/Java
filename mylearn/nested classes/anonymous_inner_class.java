// 🔥 Anonymous Inner Class (Java)

// An anonymous class is an inner class without a name that is used only once (on the spot).

// 👉 No class name
// 👉 No reuse
// 👉 Created and used in a single line/block

// Example 1: 
// class anonymous_inner_class{
//     public static void main(){

//         Animal a = new Animal(){
//             void sound(){
//                 System.out.println("Bark");
//             }
//         };
//         a.sound();
//     }
// }

// class Animal{
//     void sound(){
//         System.out.println("Sounds!");
//     }
// }

// Example 2:

interface A {
    void show();
}

class anonymous_inner_class{
    public static void main(String args[]){

        A obj = new A(){  
            // A obj is reference variable of type A
            // But new A() is object of anonymous type not a object of A
            // we cannot create objects of an interface
            public void show(){
                System.out.println("Anonymous class imlementation !!");
            }
        };
        obj.show();
    }
}