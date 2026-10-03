// reverse a string using two pointer method.
class Main{
    public static void main(String args[]){
        char ch[]="hello".toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;

            left++;
            right--;
        }
        System.out.println(new String(ch));
    }
}
