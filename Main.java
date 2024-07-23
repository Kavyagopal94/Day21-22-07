import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile(".xx.");
//        Matcher matcher = pattern.matcher("Sx1x");
//        System.out.println("Does The String Matches The Given Regex: "+matcher.matches());
        System.out.println(Pattern.matches("Sx1x",".xx."));
        System.out.println(Pattern.matches("[xyz]","wbcd")); //Not xor y or z
        System.out.println(Pattern.matches("[xyz]","x")); //among x,y,z
        System.out.println(Pattern.matches("[xyz]","xxyzz")); //occurs more than once
        System.out.println();
        System.out.println("Quantifier ?... i.e,  0 or 1 occurrences");
        System.out.println(Pattern.matches("[ayz]?","a"));
        System.out.println(Pattern.matches("[ayz]?","aaa"));
        System.out.println(Pattern.matches("[ayz]?","amnta"));
        System.out.println();
        System.out.println("Quantifier +... i.e, 1 or more occurrences");
        System.out.println(Pattern.matches("[abc]+","aabbcc"));
        System.out.println(Pattern.matches("[abc]+","mre"));
        System.out.println(Pattern.matches("[abc]+","abc"));
        System.out.println();
        System.out.println("Quantifier *... i.e, 0 or more Occurrences");
        System.out.println(Pattern.matches("[abc]*","aabbcc"));
        System.out.println(Pattern.matches("[abc]*","mre"));
        System.out.println(Pattern.matches("[abc]*","abc"));
        System.out.println();
        System.out.println("Metacharacters and Quantifiers......");
        System.out.println(Pattern.matches("w","abcx"));
        System.out.println(Pattern.matches("d*","1234"));
        System.out.println(Pattern.matches("s","Regex"));
        System.out.println(Pattern.matches("S","Regulatr Expression"));


    }
}
