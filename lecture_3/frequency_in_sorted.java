// package lecture_3;
// import java.util.*;

// public class frequency_in_sorted {
//     public static void main(String[] args) {
//         HashMap<Character,Integer> map = new HashMap<>();
//         HashMap<Integer,ArrayList<Character>> map2 = new HashMap<>();
//         String st = "tree";
//         for(int i=0;i<st.length();i++){
//             char a = st.charAt(i);
//             if(map.containsKey(a)){
//                 ArrayList<Character> arr = map2.get(map.get(a));
//                 arr.remove(arr.indexOf(a));
//                 System.out.println("removed "+arr);
//                 map2.put(map.get(a),arr);
            
//                 map.put(a,map.get(a)+1);
            

//                 if(map2.containsKey(map.get(a))){

//                     arr = map2.get(map.get(a));
//                     arr.add(a);
//                     System.out.println("map2 in this "+map2);
//                     map2.put(map.get(a)+1,arr);
//                 }
//                 else{
//                     map2.put(map.get(a),new ArrayList<Character>());
//                     arr = map2.get(map.get(a));
//                     arr.add(a);
//                     map2.put((map.get(a)),arr);
//                     System.out.println("map2 in this "+map2);

//                 }
//                 System.out.println("map1 : "+map);
//                 System.out.println("map2 : "+map2);
//             }
//             else{
//                 map.put(a,1);
//                 ArrayList<Character> arr = new ArrayList<>();
//                 if(map2.containsKey(map.get(a))){
//                     arr = map2.get(map.get(a));
//                     arr.add(a);
//                     map2.put(map.get(a),arr);
//                 }
//                 else{
//                     map2.put(map.get(a),new ArrayList<Character>());
//                     arr = map2.get(map.get(a));
//                     arr.add(a);
//                     map2.put((map.get(a)),arr);
//                 }
//                 System.out.println("2nd map1 : "+map);
//                 System.out.println("2nd map2 : "+map2);
                
//             }

//         }
//         System.out.println("hash map : "+map2);
//     }
// }


package lecture_3;

import java.util.*;

public class frequency_in_sorted{
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        String s = "tree";
        
    }
}