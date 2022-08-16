import java.util.HashSet;
import java.util.Set;

public class Practice {
    public static void main(String[] args) {
        int count[] = {1000, 900, 800, 125, 650};
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 5; i++) {
            set.add(count[i]);
        }
        System.out.println(set);
    }
}
