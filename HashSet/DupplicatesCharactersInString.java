//Duplicate characters in string
package JAP82.Collection.HashSet;
import java.util.HashSet;
public class DupplicatesCharactersInString {
    public static void main(String[] args) {
        String str = "banana";
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> dup = new HashSet<>();

        for(char c : str.toCharArray()){
            if(!set.add(c)){
                dup.add(c);
            }
        }
        System.out.println(dup);
    }
}
