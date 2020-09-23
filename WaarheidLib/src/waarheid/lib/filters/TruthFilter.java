package waarheid.lib.filters;

import waarheid.lib.CodeRedTruthException;

public interface TruthFilter {

    String filterMsg(String input) throws CodeRedTruthException;

}
