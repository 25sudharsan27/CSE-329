package lecture_3;

public class Frequence {
    public static void main(String[] args) {
         
        int[] arr = new int[26];
        String st = "sudharsan";
        
        for(int i=0;i<st.length();i++){
            
            arr[(st.charAt(i)-'a')]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
            System.out.println((char) (i + 'a')+" : "+arr[i]);
            }
        }
        
    }
}
