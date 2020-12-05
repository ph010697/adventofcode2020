import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        
        //String input = "....."; part 1

        String[] inputLines = input.split("\n");


        long multipliedTreesEncounters = 1;

        List<List<Integer>> slopeOffsetList = new ArrayList<>() {{ add(Arrays.asList(1,1)); add(Arrays.asList(3,1)); add(Arrays.asList(5,1)); add(Arrays.asList(7,1)); add(Arrays.asList(1,2));}};

        for (int z=0;z<slopeOffsetList.size();z++) {
            int treesEncountered = 0;
            int personPosition = 0;
            boolean newLine=false;

            for (int i = 0; i < inputLines.length; i=i+slopeOffsetList.get(z).get(1)) {

                if (i + slopeOffsetList.get(z).get(1) >= inputLines.length) {
                    break;
                }

                if (personPosition + slopeOffsetList.get(z).get(0) == inputLines[i].length()) {
                    personPosition = 0;
                    newLine = true;
                }

                if (personPosition + slopeOffsetList.get(z).get(0) > inputLines[i].length()) {
                    personPosition = (personPosition + slopeOffsetList.get(z).get(0)) - inputLines[i].length();
                    newLine = true;
                }

                if (newLine) {
                    if (String.valueOf(inputLines[i + slopeOffsetList.get(z).get(1)].charAt(personPosition)).equals("#"))
                        treesEncountered++;

                    newLine = false;
                } else {
                    if (String.valueOf(inputLines[i + slopeOffsetList.get(z).get(1)].charAt(personPosition + slopeOffsetList.get(z).get(0))).equals("#")) {
                        treesEncountered++;
                    }
                    personPosition += slopeOffsetList.get(z).get(0);
                }
            }
            System.out.println("Trees encountered for slope with offset of right:"+slopeOffsetList.get(z).get(0)+", down:"+slopeOffsetList.get(z).get(1) +": " + treesEncountered);
            multipliedTreesEncounters*=treesEncountered;
        }
        System.out.println("Multiplied trees encountered values: "+multipliedTreesEncounters);
    }
}
