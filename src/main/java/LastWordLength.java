import java.util.Scanner;

/**
 * Created by Manas Dash on 11/11/17 6:04 PM.
 * Learning REST API
 */
class LastWordLength {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( LastWordLength.lengthOfLastWord(input.next()));
    }
    private  static int lengthOfLastWord(String input) {
        if(input==null || input.length() == 0)
            return 0;

        int result = 0;
        int len = input.length();

        boolean flag = false;
        for(int i=len-1; i>=0; i--){
            char c = input.charAt(i);
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
