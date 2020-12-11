import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        String[] inputLines = ("input in part 1...").split("\n");

        int preamble = 25;

        BigInteger incorrectNumber = findIncorrectNumber(inputLines, preamble);
        System.out.println(findWeaknessNumber(inputLines, incorrectNumber));
    }

    private static BigInteger findWeaknessNumber(String[] inputLines, BigInteger incorrectNumber) {
        List<BigInteger> currentSet = new ArrayList<>();
        BigInteger currentSetSum = BigInteger.valueOf(0);
        int initialIndex = 0;

        for (int i = initialIndex; i < inputLines.length; i++) {
            currentSet.add(BigInteger.valueOf(Long.parseLong(inputLines[i])));
            currentSetSum = currentSetSum.add(BigInteger.valueOf(Long.parseLong(inputLines[i])));

            if(currentSetSum.equals(incorrectNumber))
                return Collections.min(currentSet).add(Collections.max(currentSet));
            
            if(currentSetSum.compareTo(incorrectNumber) == 1) // NOT OPTIMAL SOLUTION
            {
                currentSet.clear();
                currentSetSum = BigInteger.valueOf(0);
                initialIndex++;
                i=initialIndex;
                continue;
            }
        }

        return BigInteger.valueOf(-1);
    }

    private static BigInteger findIncorrectNumber(String[] inputLines, int preamble) {
        for (int i = preamble; i < inputLines.length ; i++) {
            BigInteger currentNumber = BigInteger.valueOf(Long.parseLong(inputLines[i]));
            List<BigInteger> currentNumberPreamblesList = new ArrayList<>();
            boolean currentNumberHasPairOut = false;

            for (int j = i-preamble; j < i; j++) {
                boolean currentNumberHasPair = false;
                currentNumberPreamblesList.add(BigInteger.valueOf(Long.parseLong(inputLines[i])));

                for (int k = 0; k < i; k++) {
                    if(BigInteger.valueOf(Long.parseLong(inputLines[j])).equals(BigInteger.valueOf(Long.parseLong(inputLines[k]))))
                        continue;

                    if(BigInteger.valueOf(Long.parseLong(inputLines[j])).add(BigInteger.valueOf(Long.parseLong(inputLines[k]))).equals(currentNumber)) {
                        currentNumberHasPair = true;
                        break;
                    }
                }

                if(currentNumberHasPair) {
                    currentNumberHasPairOut=true;
                    break;
                }
            }
            if(!currentNumberHasPairOut)
                return currentNumber;

        }

        return BigInteger.valueOf(-1);
    }
}
