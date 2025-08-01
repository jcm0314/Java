// LAB5, 자바 프로그래밍, 2분반, 25.06.04, 32203919 장천명
package comparator;

import model.Tsunami;
import java.util.Comparator;

public class TsunamiCauseCodeComparator implements Comparator<Tsunami> {
    @Override
    public int compare(Tsunami t1, Tsunami t2) {
        return t1.getTsunamiCauseCode().getCode() - t2.getTsunamiCauseCode().getCode();
    }
} 