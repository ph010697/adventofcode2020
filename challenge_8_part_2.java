import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        String[] inputLines = ("input in part 1").split("\n");

        int accumulator = 0;
        List<String>instructionsHistory = new ArrayList<>();

        for (int i = 0; i < inputLines.length;) {
            String operation = inputLines[i].substring(0,inputLines[i].indexOf(" "));
            String argumentSign = inputLines[i].substring(inputLines[i].indexOf(" ")+1,inputLines[i].indexOf(" ")+2);
            String argument = inputLines[i].substring(inputLines[i].indexOf(" ")+2);

            switch (operation)
            {
                case "acc":
                    if(argumentSign.equals("-"))
                        accumulator -= Integer.parseInt(argument);
                    else
                        accumulator += Integer.parseInt(argument);
                    instructionsHistory.add(operation+" "+argumentSign+argument+"_"+i);
                    break;
                case "jmp":
                    int nextI = i;
                    
                    if(argumentSign.equals("-"))
                        nextI -= Integer.parseInt(argument);
                    else
                        nextI += Integer.parseInt(argument);

                    if(nextI==inputLines.length)
                        break;

                    boolean nextInstructionAlreadyExecuted = false;
                    for (int z = 0; z < instructionsHistory.size(); z++) {
                        if(inputLines[nextI].equals(instructionsHistory.get(z).substring(0,instructionsHistory.get(z).indexOf("_")))) {
                            if (nextI == Integer.parseInt(instructionsHistory.get(z).substring(instructionsHistory.get(z).indexOf("_")+1))) {
                                nextInstructionAlreadyExecuted = true;
                                break;
                            }
                        }
                    }

                    if(nextInstructionAlreadyExecuted) {
                        i++;
                        instructionsHistory.add("nop" + " " + argumentSign + argument + "_" + i);
                    }
                    else {
                        i = nextI;
                        instructionsHistory.add(operation + " " + argumentSign + argument + "_" + i);
                    }
                    continue;
                case "nop":
                    instructionsHistory.add(operation+" "+argumentSign+argument+"_"+i);
                    break;
            }
            i++;
        }

        System.out.println(accumulator);
    }
}
