// Q. count length of the last string from a sentence.

class findLength_ofLastStr{
    public static void main(String args[]){
        String s="i am rahul";
        String words[]=s.split(" ");
        String LastWordLength=words[words.length-1];
        System.out.print("word count of last word is "+ LastWordLength.length());
    }
    
}
