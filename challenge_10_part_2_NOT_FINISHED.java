import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        String[] inputLines = ("").split("\n");

        List<Integer> inputLinesList = new ArrayList<>();
        inputLinesList = Arrays.stream(inputLines).map(Integer::valueOf).collect(Collectors.toList());
        Collections.sort(inputLinesList, Comparator.naturalOrder());

        //System.out.println(findAllDistinctWaysOfConnect(inputLinesList));
        test();
        //System.out.println(numberOfCombinations(6));
    }

    private static void test() {
        Integer[] arr = {16,10,15,5, 1,11,7,19,6,12,4};
        List<Integer> inputLinesList = Arrays.asList(arr);
        Collections.sort(inputLinesList, Comparator.naturalOrder());

        TreeMap<Integer,List<Integer>> adaptersMap = new TreeMap<>();

        System.out.println(distinctWays);
    }


    private static Integer findAllDistinctWaysOfConnect(List<Integer> inputLinesList) {
        TreeMap<Integer,List<Integer>> adaptersMap = new TreeMap<>();
        int distinctWays = 0;

        for (int i = 0; i < inputLinesList.size(); i++) {
            Integer currentAdapter = inputLinesList.get(i);
            List<Integer> currentAdapterCandidates = new ArrayList<>();

            for (int j = i+1; j <= i+3 ; j++) {
                if(j<inputLinesList.size()) {
                    if(inputLinesList.get(j) - inputLinesList.get(i) > 3)
                        continue;
                    currentAdapterCandidates.add(inputLinesList.get(j));
                }
                else
                    break;
            }

            adaptersMap.put(currentAdapter,currentAdapterCandidates);
        }

        return distinctWays;
    }
}
