
import java.util.Comparator;


public class ScoreSorter implements Comparator<GameRecord> {

    public int compare(GameRecord o1, GameRecord o2) {
        int s1 = o1.getScore();
            int s2 = o2.getScore();

            if (s1 == s2)
                return 0;
            else if (s1 > s2)
                return 1;
            else
                return -1;
    }
    
}
