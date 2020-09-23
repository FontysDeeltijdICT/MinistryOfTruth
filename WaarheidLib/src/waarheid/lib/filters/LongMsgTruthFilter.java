package waarheid.lib.filters;

public class LongMsgTruthFilter implements TruthFilter {

    private int maxWords;

    public LongMsgTruthFilter(int maxWords)
    {
        this.maxWords = maxWords;
    }

    @Override
    public String filterMsg(String input) {
        StringBuilder output = new StringBuilder();
        String[] sentences = input.split("\\.");
        int wordCounter = 0;
        for (String sentence : sentences)
        {
            String[] words = sentence.split(" ");
            if(wordCounter + words.length > maxWords) break;
            output.append(sentence).append(".");
            wordCounter += words.length;
        }
        return output.toString();
    }

}
