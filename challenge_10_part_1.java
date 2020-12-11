import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        String[] inputLines = ("0\n" +
                "56\n" +
                "139\n" +
                "42\n" +
                "28\n" +
                "3\n" +
                "87\n" +
                "142\n" +
                "57\n" +
                "147\n" +
                "6\n" +
                "117\n" +
                "95\n" +
                "2\n" +
                "112\n" +
                "107\n" +
                "54\n" +
                "146\n" +
                "104\n" +
                "40\n" +
                "26\n" +
                "136\n" +
                "127\n" +
                "111\n" +
                "47\n" +
                "8\n" +
                "24\n" +
                "13\n" +
                "92\n" +
                "18\n" +
                "130\n" +
                "141\n" +
                "37\n" +
                "81\n" +
                "148\n" +
                "31\n" +
                "62\n" +
                "50\n" +
                "80\n" +
                "91\n" +
                "33\n" +
                "77\n" +
                "1\n" +
                "96\n" +
                "100\n" +
                "9\n" +
                "120\n" +
                "27\n" +
                "97\n" +
                "60\n" +
                "102\n" +
                "25\n" +
                "83\n" +
                "55\n" +
                "118\n" +
                "19\n" +
                "113\n" +
                "49\n" +
                "133\n" +
                "14\n" +
                "119\n" +
                "88\n" +
                "124\n" +
                "110\n" +
                "145\n" +
                "65\n" +
                "21\n" +
                "7\n" +
                "74\n" +
                "72\n" +
                "61\n" +
                "103\n" +
                "20\n" +
                "41\n" +
                "53\n" +
                "32\n" +
                "44\n" +
                "10\n" +
                "34\n" +
                "121\n" +
                "114\n" +
                "67\n" +
                "69\n" +
                "66\n" +
                "82\n" +
                "101\n" +
                "68\n" +
                "84\n" +
                "48\n" +
                "73\n" +
                "17\n" +
                "43\n" +
                "140\n").split("\n");

        List<Integer> inputLinesList = new ArrayList<>();
        inputLinesList = Arrays.stream(inputLines).map(Integer::valueOf).collect(Collectors.toList());
        Collections.sort(inputLinesList, Comparator.naturalOrder());

        System.out.println(findMultipliedValueOfDifferences(inputLinesList));

    }

    private static Integer findMultipliedValueOfDifferences(List<Integer> inputLinesList) {
        int oneJoltDifferencesCount = 0;
        int threeJoltDifferencesCount = 0;
        for (int i = 0; i < inputLinesList.size(); i++) {
            Integer currentAdapter = inputLinesList.get(i);
            List<Integer> currentAdapterCandidates = new ArrayList<>();

            for (int j = i+1; j <= i+3 ; j++) {
                if(j<inputLinesList.size())
                    currentAdapterCandidates.add(inputLinesList.get(j));
                else if (j>=inputLinesList.size())
                    break;
            }

            if(currentAdapterCandidates.size()<1)
                threeJoltDifferencesCount++;
            else if(Collections.min(currentAdapterCandidates) - currentAdapter < 2)
                oneJoltDifferencesCount++;
            else
                threeJoltDifferencesCount++;
        }

        return oneJoltDifferencesCount*threeJoltDifferencesCount;
    }
}
