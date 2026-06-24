// count vowels in a string
class VowelCount{
   static boolean isVowel(char ch){
       ch =Character.toUpperCase(ch);
       return (ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' );
       
   }
   static int CountVowels(String str){
       int count=0;
       for(int i=0;i<str.length();i++){
           if(isVowel(str.charAt(i)))
           {
               ++count;
           }
           
       }
       return count;
   }
   public static void main(String args[]){
       String str="abcde";
       System.out.println("count vowel "+CountVowels(str));
   } 
}
