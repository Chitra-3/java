public class Bath{
    public void Bath() throws HotWaterException{
            double val=Math.random()%10;
            if(val>0.1&&val<0.5){
                throw new HotWaterException("Hot water is not there to bath..");
            }
            
        }

        void uncheck(){
            double val=Math.random()%10;
            if(val>0.5&&val<0.9){
                throw new PowerCutException("Suddenly Power Off");
            }
        }
}
class HotWaterException extends Exception{
    HotWaterException(String msg){
        super(msg);
    }
}
class PowerCutException extends RuntimeException{
    PowerCutException(String msg){
        super(msg);
    }
}