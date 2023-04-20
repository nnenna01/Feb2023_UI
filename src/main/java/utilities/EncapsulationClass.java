package utilities;

public class EncapsulationClass {
    private int randNumbers =0;
    public  int getRandomNumbers(){
        return randNumbers;
    }
    public void setRandNumbers(int randNumbers){
        this.randNumbers = randNumbers;

    }
    public String ranStrings;
    public String getRandomStrings(){ return ranStrings;}
    public void setRandString(String randString){
        this.ranStrings=randString;
    }
}
