/**
 * Created by Manas Dash on 11/11/17 6:04 PM.
 * Learning REST API
 */
class LastWord {

    public static void main(String[] args) {

        LastWord lastWord = new LastWord();
        System.out.println( lastWord.lengthOfLastWord("no one can solve this"));
    }
    private int lengthOfLastWord(String s) {
        if(s==null || s.length() == 0)
            return 0;

        int result = 0;
        int len = s.length();

        boolean flag = false;
        for(int i=len-1; i>=0; i--){
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z')){
                flag = true;
                result++;
            }else{
                if(flag)
                    return result;
            }
        }

        return result;
    }
}
