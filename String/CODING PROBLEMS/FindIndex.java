//Find the Index of the First Occurrence in a String
class Main{
  public static int FindIndex(String haystack, String needle){
    int n=haystack.length();
    int m=needle.length();
    //edge case1: if needle is empty then
    if(m==0){
     return 0;
    }
    
    for(int i=0;i<(n-m);i++){
      if(haystack.substring(i,i+m).equals(needle)){
        return i;
      }
    }
   //if needle not found 
    return -1;
  }
  public static void main(String args[]){
    String haystack="rahulhazarika";
    String needle="rahul";
    int result=FindIndex(haystack, needle);
    System.out.println(result);
  }
}
