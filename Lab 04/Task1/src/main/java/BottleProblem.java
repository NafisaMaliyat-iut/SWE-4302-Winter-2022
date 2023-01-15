public class BottleProblem {
    public String verse(int ver) {

        if(ver<0 || ver>99)
            return "Invalid Verse";

        switch(ver) {
            case 0: return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.\n";

            case 1: return "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n";

            case 2: return "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                            "Take one down and pass it around, 1 bottle of beer on the wall.\n";

            default: return ver + " bottles of beer on the wall, " + ver + " bottles of beer.\n" +
                            "Take one down and pass it around, " + (ver -1) + " bottles of beer on the wall.\n";
        }
    }

    public String verses(int startingVerseNumber, int endingVerseNumber) {
        String VerseRange = "";
        for (int i = startingVerseNumber; i >= endingVerseNumber; i--){
            VerseRange += verse(i);
        }
        return VerseRange;
    }

    public String fullSong(){
        String Song = "";
        for (int i = 99; i >= 0; i--){
            Song += verse(i);
        }

        return Song;
    }


}
