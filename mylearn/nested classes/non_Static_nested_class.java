class non_Static_nested_class{
    public static void main(String args[]){

        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.display();
    }
}
// inner class -> non static nested class
class Outer{
    int x = 10;
    static int y = 20;
    class Inner{
        void display(){
            System.out.println(x);
            System.out.println(y);
        }
    }
}