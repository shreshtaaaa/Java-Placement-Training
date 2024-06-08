class circularSequence {
    public static void main(String[] args) {
        String s = "tava against taj";
        String[] str = s.split(" ");
        boolean isCircular = true;
        for (int i = 0; i < str.length; i++) {
            String currentWord = str[i];
            String nextWord = str[(i + 1) % str.length]; 
            if (currentWord.charAt(currentWord.length() - 1) != nextWord.charAt(0)) {
                isCircular = false;
                break;
            }
        }
        if (isCircular) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}