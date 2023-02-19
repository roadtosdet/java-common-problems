package String;
public class ExtractWordFromString {
    public static void main(String[] args) {
        String str="I live in Dhaka";
        String word="Dhaka";
        int index=str.indexOf(word);
        System.out.println("Index of "+word+" is "+index);
        str=str.substring(index);
        System.out.println("Substring is "+str);
    }
    
}
