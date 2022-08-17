class Solution {
  public int uniqueMorseRepresentations(String[] words) {
    String[] rawArr = new String[] {
      ".-",
      "-...",
      "-.-.",
      "-..",
      ".",
      "..-.",
      "--.",
      "....",
      "..",
      ".---",
      "-.-",
      ".-..",
      "--",
      "-.",
      "---",
      ".--.",
      "--.-",
      ".-.",
      "...",
      "-",
      "..-",
      "...-",
      ".--",
      "-..-",
      "-.--",
      "--.."
    };
    Set < String > st = new HashSet();
    for (String s: words) {
      StringBuilder sb = new StringBuilder();
      for (char c: s.toCharArray()) {
        sb.append(rawArr[c - 'a']);
      }
      st.add(sb.toString());
    }
    return st.size();
  }
}