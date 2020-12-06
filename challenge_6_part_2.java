import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MainClass {
    public static void main(String[] args) { 
        String input = "... part 1";

        String[] inputLines = input.split("\n");

        long groupsTotalSum = 0;
        boolean endOfGroup = false;
        Map<Integer,String> currentGroupMap = new HashMap<>();

        for(int i=0;i<inputLines.length;i++)
        {
            if(inputLines[i].length()<1 || i==inputLines.length-1)
                endOfGroup = true;

            if(endOfGroup) {
                endOfGroup=false;
                groupsTotalSum+=findAllYesAnswers(currentGroupMap,true);
                currentGroupMap.clear();
            }
            else
                currentGroupMap.put(i,inputLines[i]);
        }

        System.out.println(groupsTotalSum);
    }

    public static Integer findAllYesAnswers(Map<Integer,String> currentGroupMap,boolean onlyEveryoneYesAnswers) 
    {
        Map<String,Integer> answersMap = new HashMap<>();
        for (Map.Entry<Integer,String> personAnswers : currentGroupMap.entrySet()){
            for(int z=0;z<personAnswers.getValue().length();z++) {
                String currentYesAnswer = String.valueOf(personAnswers.getValue().charAt(z));
                if(answersMap.containsKey(currentYesAnswer))
                    answersMap.put(currentYesAnswer,answersMap.get(currentYesAnswer)+1);
                else
                    answersMap.put(currentYesAnswer,1);
            }
        }
        if(onlyEveryoneYesAnswers)
        {
            int currentGroupEveryoneYesCounter = 0;
            for (Map.Entry<String, Integer> answer : answersMap.entrySet()) {
                if(answer.getValue()== currentGroupMap.size())
                    currentGroupEveryoneYesCounter++;
            }
            return currentGroupEveryoneYesCounter;
        }
        return answersMap.size();
    }
}
