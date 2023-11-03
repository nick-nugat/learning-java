package codewars;

public class LoveAndPetals {
    public static String howMuchILoveYou(int nb_petals) {
        if (nb_petals <= 0) return null;
        
        String[] arr = {"I love you", 
                        "a little", 
                        "a lot", 
                        "passionately", 
                        "madly", 
                        "not at all" };

        String lastPhrase = arr[0]; //default return for 1 petal

        
        if (nb_petals != 1){ //petals more than 1
            for (int i = 0; i < arr.length; i++) {
                lastPhrase = arr[i];
                if (nb_petals > 6) lastPhrase = arr[i % arr.length];
            }
        }
        return lastPhrase;
    }
}
