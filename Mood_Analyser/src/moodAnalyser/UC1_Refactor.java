package moodAnalyser;

public class UC1_Refactor
{
    String message;
    UC1_Refactor(String message){
        this.message = message;
    }
    public String analyseMood() {
        if (message.contains("sad")){
            return "SAD";
        }
        else {
            return "HAPPY";
        }
    }
}
