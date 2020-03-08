
public class ROT13  {

    Integer separation;



    ROT13(Character cs, Character cf) {

        String start = cs.toString().toLowerCase();
        String stop = cf.toString().toLowerCase();

        Character first = start.charAt(0);
        Character second = stop.charAt(0);

        separation = second - first;
        if(separation == 25){
            separation += 1;
        }
    }

    ROT13() {
        separation = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {

        char[] strToArr = text.toCharArray();
        char[] answer =  new char[strToArr.length];

        for(int x = 0; x <=  text.length() -1; x++){

            int numValue = text.charAt(x);

            if(numValue >= 65 && numValue <= 90) {

                if(separation + numValue > 90){
                    answer[x] = (char)((numValue + separation) - 26);
                }else {
                    answer[x] = (char)(numValue + separation);
                }

            }else if(numValue >= 97 && numValue <= 122){

                if(separation + numValue > 122){
                    answer[x] = (char)((numValue + separation) - 26);
                }else {
                    answer[x] = (char)(numValue + separation);
                }
            }else{
                answer[x] = (char)(numValue);
            }
        }

        String crypted = "";
        for(char character : answer){
            crypted += character;
        }

        return crypted;
    }

    public String encrypt(String text) {
        return crypt(text);
    }

    public String decrypt(String text) {
        return crypt(text);
    }

    public static String rotate(String s, Character coo) {

        int shift = coo - 65;

        char[] strToAr = s.toCharArray();
        char[] shifted = new char[s.length()];

        for(int x = 0; x <= s.length() -1; x++){

            if((x + shift) >= s.length()){
                shifted[(x + shift) - s.length()] = strToAr[x];
            }else {
                shifted[x + shift] = strToAr[x];
            }
        }
        return new String(shifted);
    }

}
