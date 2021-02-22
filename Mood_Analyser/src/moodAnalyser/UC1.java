package moodAnalyser;

public class UC1
{

    public String analyseMood(String message) {
        if (message.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
