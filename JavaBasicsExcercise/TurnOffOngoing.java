public class TurnOffOngoing extends Exception{
    public TurnOffOngoing(){}

    public TurnOffOngoing(String errorMsg){
        super(errorMsg);
    }
}
