package alphabetwar;

/*Introduction
There is a war and nobody knows - the alphabet war!
There are two groups of hostile letters. The tension between left side letters and right side letters was
too high and the war began.

Task
Write a function that accepts fight string consists of only small letters and return who wins the fight.
When the left side wins return Left side wins!, when the right side wins return Right side wins!,
in other case return Let's fight again!.

The left side letters and their power:

w - 4
p - 3
b - 2
s - 1
The right side letters and their power:

m - 4
q - 3
d - 2
z - 1
The other letters don't have power and are only victims.

Example
AlphabetWar("z");        //=> Right side wins!
AlphabetWar("zdqmwpbs"); //=> Let's fight again!
AlphabetWar("zzzzs");    //=> Right side wins!
AlphabetWar("wwwwwwz");  //=> Left side wins!
Alphabet war Collection*/
public class AlphabetWar {
    public static String alphabetWar(String fight){
        int right = 0;
        int left = 0;

        for (int i = 0; i < fight.length(); i++) {
            if(fight.charAt(i) == 109 ){
                right+=4;
            }
            if(fight.charAt(i) == 113 ){
                right+=3;
            }
            if(fight.charAt(i) == 100 ){
                right+=2;
            }
            if(fight.charAt(i) == 122 ){
                right+=1;
            }
            if(fight.charAt(i) == 119 ){
                left+=4;
            }
            if(fight.charAt(i) == 112 ){
                left+=3;
            }
            if(fight.charAt(i) == 98 ){
                left+=2;
            }
            if(fight.charAt(i) == 115 ){
                left+=1;
            }
        }
        if(left == right) {
            return "Let's fight again!";
        }
        if (left < right) {
            return "Right side wins!";
        }
        else {
            return "Left side wins!";
        }
    }
}
