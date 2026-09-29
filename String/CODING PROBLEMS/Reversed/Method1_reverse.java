// simple method to reverse a string using for loop
class Main{
    public static void main(String args[]){
        String s="hello";
        String reversed=" ";
        for(int i=s.length()-1;i>=0;i--){
            reversed+=s.charAt(i);
        }

        System.out.println(reversed);
    }
}
