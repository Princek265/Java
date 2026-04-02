class Static_nested_class{
    public static void main(String args[]){
        Outer.Inner obj = Outer.Inner(); 
        // Object of nested static class can be directly created like this independently
        // classes which can be acccessed without depending on other class's objects are independent or Top level
    }

}

class Outer{
    static int x = 10;
    int y = 20;
    static class Inner{
        // it can access only static data members from the upper class
        // System.out.println(y); // Error
        int y = 22;
        System.out.println(y);
        System.out.println(x);

    }
}