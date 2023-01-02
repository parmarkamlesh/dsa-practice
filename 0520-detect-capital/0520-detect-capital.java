class Solution {
    public boolean detectCapitalUse(String word) {
        boolean allcap=true;
        boolean nocap=true;
        boolean camel=true;
        int n=word.length();
        for (int i = 0; i < n; i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                allcap = false;
                break;
            }
        }
        if (allcap) {
            return true;
        }

        for (int i = 0; i < n; i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                nocap = false;
                break;
            }
        }
        if (nocap) {
            return true;
        }
        if (!Character.isUpperCase(word.charAt(0))) {
            camel = false;
        }
        if (camel) {
            for (int i = 1; i < n; i++) {
                if (!Character.isLowerCase(word.charAt(i))) {
                    camel = false;
                    break;
                }
            }
        }
        if (camel) {
            return true;
        }
        return false;
}
}