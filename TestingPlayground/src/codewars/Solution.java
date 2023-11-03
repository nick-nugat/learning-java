package codewars;

class Solution {
    public static String whoLikesIt(String... names) {
        int length = names.length;
        int temp = length - 2;

        if (length < 4){
            if (length == 1) return names[0] + " likes this";
            else if (length == 2) return names[0] + " and " + names[1] + " like this";
            else if (length == 3) 
                return names[0] + ", " 
                     + names[1] + " and "
                     + names[2] + " like this";
        } else{

            return names[0] + ", " + names[1] + " and " + temp + " others like this";
        }
        return "no one likes this";
    }
}