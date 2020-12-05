import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        String input = "... part 1"; // part 1 for input

        String[] inputLines = input.split("\n");

        List<Long> seatIds = new ArrayList<>();
        Map<String, Long> initialMap = new HashMap<>(){{
            put("lowerRow", (long) 0);
            put("upperRow", (long) 127);
            put("lowerCol", (long) 0);
            put("upperCol", (long) 7);
            put("diffRow", (long) 128);
            put("diffCol", (long) 8);}};

        for(int i=0;i<inputLines.length;i++)
        {
            seatIds.add(findSeat(inputLines[i],initialMap));
        }

        System.out.println(Collections.max(seatIds)); // part 1

        long minSeatIDs=Collections.min(seatIds);
        for(long x=0;x<minSeatIDs;x++) {
            seatIds.add(x);
        }

        long sum=0;
        for (int z=0;z<seatIds.size();z++) {
            sum+=seatIds.get(z);
        }

        System.out.println(((Collections.max(seatIds)*(Collections.max(seatIds)+1))/2) - sum); // part 2
    }


    public static Long findSeat(String seatBinaryCombination, Map<String,Long> seatBetweenMap)
    {
        Map<String,Long> seatMap = new HashMap<>(seatBetweenMap);
        if(seatBinaryCombination.length()<1) {
            return seatMap.get("lowerRow") * 8 + (seatMap.get("lowerCol"));
        }
        else {
            String currentHalf = seatBinaryCombination.substring(0, 1);

            switch (currentHalf) {
                case "F":
                    seatMap.put("upperRow", seatMap.get("upperRow")-1 - (seatMap.get("upperRow")-seatMap.get("lowerRow")) /2);
                    break;
                case "B":
                    seatMap.put("lowerRow",  seatMap.get("lowerRow")+1 + (seatBetweenMap.get("upperRow")-seatMap.get("lowerRow"))/2);
                    break;
                case "L":
                    seatMap.put("upperCol", seatMap.get("upperCol")-1 - (seatMap.get("upperCol")-seatMap.get("lowerCol"))/2);
                    break;
                case "R":
                    seatMap.put("lowerCol", seatMap.get("lowerCol")+1 + (seatMap.get("upperCol")-seatMap.get("lowerCol"))/2);
                    break;
            }

            seatMap.put("diffRow", seatMap.get("upperRow") - seatMap.get("lowerRow") + 1);
            seatMap.put("diffCol", seatMap.get("upperCol") - seatMap.get("lowerCol") + 1);
            seatBinaryCombination= seatBinaryCombination.substring(1);
            return findSeat(seatBinaryCombination, seatMap);
        }
    }
}
