class Strings{
    public static void main(String args[]){
        String name = "   Parikshit   ";
        // boolean result = name.equals("Parikshit");
        // int result = name.length();
        // char result = name.charAt(1);
        // int result = name.indexOf("t");
        // boolean result = name.isEmpty();
        // String result = name.toUpperCase();
        // String result = name.toLowerCase();
        // String result = name.trim(); 
        // String result = name.replace(oldchar, newchar)
        // String result = name.replace('P', 'K');
        // String result = name.replace("Par", "Pka");
        // int result = name.lastIndexOf('i');
        // String result = name.substring(5,10);
        // String result = name.concat("Dogra");
        String str = "a,b,c";
        String[] arr = str.split(",");
        String joined = String.join("-", arr);
        // System.out.println(result);
        char[] ar = joined.toCharArray();
        String newStr = new String(ar);
        System.out.println(newStr);
    }
}