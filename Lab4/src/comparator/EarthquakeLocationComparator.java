// LAB4, 자바 프로그래밍, 2분반, 25.05.20, 32203919 장천명
package comparator;

import java.util.Comparator;
import model.Earthquake;

public class EarthquakeLocationComparator implements Comparator<Earthquake> {
    @Override
    public int compare(Earthquake e1, Earthquake e2) {
        return e1.getLocation().compareTo(e2.getLocation());
    }
} 