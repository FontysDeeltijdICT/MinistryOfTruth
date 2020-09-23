package waarheid.lib.filters;

import waarheid.lib.CodeRedTruthException;

public class BigBrotherTruthFilter implements TruthFilter {

    @Override
    public String filterMsg(String input) throws CodeRedTruthException {
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if(words[i].toLowerCase().equals("big"))
            {
                for (int j = Math.max(0, i-3); j < Math.min(i+4, words.length); j++) {
                    if(words[j].toLowerCase().equals("brother"))
                    {
                        throw new CodeRedTruthException();
                    }
                }
            }
        }
        return input;
    }

}
