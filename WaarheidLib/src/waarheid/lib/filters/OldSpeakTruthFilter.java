package waarheid.lib.filters;

import java.util.HashMap;
import java.util.Map;

public class OldSpeakTruthFilter implements TruthFilter {

    HashMap<String, String> oldSpeakList;

    public OldSpeakTruthFilter()
    {
        oldSpeakList = new HashMap<>();
        oldSpeakList.put("oorlog", "vrede");
        oldSpeakList.put("vrijheid", "slavernij");
        oldSpeakList.put("onwetendheid", "kracht");
    }

    @Override
    public String filterMsg(String input) {
        input = input.toLowerCase();
        for(Map.Entry<String, String> replacement : oldSpeakList.entrySet())
        {
            input = input.replace(replacement.getKey(), replacement.getValue());
        }
        return input;
    }
}
