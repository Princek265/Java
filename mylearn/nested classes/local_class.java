class local_class{
    public static void main(String args[]){
        Outer o = new Outer();
        o.show();
    }
}

class Outer{

    static int x = 10;
    int y = 20;
    // Local class -> is defined in a block/function/constructor of an Outer class
    void show(){
        class Inner{
            int x = 1000;
            void display(){
                System.out.println("x = " + x);
                System.out.println("x = " + Outer.x);
            }
        }
        Inner i = new Inner();
        i.display();
    }
}