package waarheid.lib;

import waarheid.lib.filters.BigBrotherTruthFilter;
import waarheid.lib.filters.LongMsgTruthFilter;
import waarheid.lib.filters.OldSpeakTruthFilter;
import waarheid.lib.filters.TruthFilter;

import java.util.LinkedList;
import java.util.List;

public class TruthDefender {

    List<TruthFilter> filterList;

    public TruthDefender() {
        filterList = new LinkedList<>();
        filterList.add(new BigBrotherTruthFilter());
        filterList.add(new LongMsgTruthFilter(100));
        filterList.add(new OldSpeakTruthFilter());
    }

    public String CheckMessage(String input) throws CodeRedTruthException {
        for (TruthFilter f: filterList) {
            input = f.filterMsg(input);
        }
        return input;
    }

}
