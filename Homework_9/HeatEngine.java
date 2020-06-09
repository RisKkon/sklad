public class HeatEngine extends Engine {


    @Override
    public void setPower() {
        this.power =  (int) ((Math.random() * (300 - 0)) + 0);
    }
}
