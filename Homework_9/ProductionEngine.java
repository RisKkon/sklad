public class ProductionEngine extends Engine {

    @Override
    public void setPower() {
        this.power =  (int) ((Math.random() * (200 - 0)) + 0);
    }
}
