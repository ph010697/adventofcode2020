import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        String input = "..." //part 1

        String[] inputLines = input.split("\n");
        String[] requiredFields = {"byr","iyr","eyr","hgt","hcl","ecl","pid"};

        int validPassports = 0;
        boolean endOfPassport = false;
        String currentPassport = "";

        for(int i=0;i<inputLines.length;i++)
        {
            if(i==inputLines.length-1){
                endOfPassport=true;
                currentPassport+=inputLines[i]+"\n";
            }

            if(inputLines[i].length()<1)
                endOfPassport=true;

            if(endOfPassport) {
                endOfPassport=false;

                if(!isMissingFields(currentPassport,requiredFields)) {
                    String[] currentPassportArray = currentPassport.replaceAll("\n"," ").split(" ");
                    Map<String,String> currentPassportMap = new HashMap<>();

                    for(int j=0;j<currentPassportArray.length;j++)
                    {
                        currentPassportMap.put(
                                currentPassportArray[j].substring(0,currentPassportArray[j].indexOf(":")),
                                currentPassportArray[j].substring(currentPassportArray[j].indexOf(":")+1,currentPassportArray[j].length()));
                    }

                    if(isValidPassport(currentPassportMap))
                        validPassports++;
                }

                currentPassport = "";
            }
            else {
                currentPassport+=inputLines[i]+"\n";
            }
        }

        System.out.println(validPassports);
    }

    private static boolean isValidPassport(Map<String, String> currentPassportMap) {
        List<String> eyeColors = new ArrayList<>(){{add("amb");add("blu");add("brn");add("gry");add("grn"); add("hzl");add("oth");}};

        if(!currentPassportMap.get("byr").matches("^[0-9]{4}$"))
            return false;
        else if(Integer.parseInt(currentPassportMap.get("byr")) < 1920 || Integer.parseInt(currentPassportMap.get("byr")) > 2002)
            return false;

        if(!currentPassportMap.get("iyr").matches("^[0-9]{4}$"))
            return false;
        else if(Integer.parseInt(currentPassportMap.get("iyr")) < 2010 || Integer.parseInt(currentPassportMap.get("iyr")) > 2020)
            return false;

        if(!currentPassportMap.get("eyr").matches("^[0-9]{4}$"))
            return false;
        else if(Integer.parseInt(currentPassportMap.get("eyr")) < 2020 || Integer.parseInt(currentPassportMap.get("eyr")) > 2030)
            return false;

        if(!currentPassportMap.get("hgt").matches("^[0-9]+[cm|in]{2}$"))
            return false;
        else if(currentPassportMap.get("hgt").endsWith("cm")) {
            int height = Integer.parseInt(currentPassportMap.get("hgt").substring(0,currentPassportMap.get("hgt").indexOf("cm")));
            if (height < 150 || height > 193)
                return false;
        } else if(currentPassportMap.get("hgt").endsWith("in")) {
            int height = Integer.parseInt(currentPassportMap.get("hgt").substring(0,currentPassportMap.get("hgt").indexOf("in")));
            if (height < 59|| height > 76)
                return false;
        }

        if(!currentPassportMap.get("hcl").matches("^#([a-f0-9]{6})$"))
            return false;

        if(!eyeColors.contains(currentPassportMap.get("ecl")))
            return false;

        if(!currentPassportMap.get("pid").matches("^[0-9]{9}$"))
            return false;

        return true;
    }

    public static boolean isMissingFields(String passport,String[] requiredFields)
    {
        for (int i=0;i<requiredFields.length;i++)
        {
            if(!passport.contains(requiredFields[i]))
                return true;
        }
        return false;
    }
}
