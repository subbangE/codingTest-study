public class fullSearch_middler {

    // 항해99 코딩테스트 스터디 3기 - 15일차
    // Prefix and Suffix Search

    String[] words = {};

    public WordFilter(String[] words) {
        this.words = new String[words.length];
        this.words = words;
    }

    public int f(String pref, String suff) {
        for (int i=words.length-1; i>=0; i--) {
            if (words[i].charAt(0) != pref.charAt(0)) {
                continue;
            }
            if(words[i].startsWith(pref) && words[i].endsWith(suff)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Your WordFilter object will be instantiated and called as such:
     * WordFilter obj = new WordFilter(words);
     * int param_1 = obj.f(pref,suff);
     */
}