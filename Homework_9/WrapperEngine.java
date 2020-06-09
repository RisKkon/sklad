public class WrapperEngine extends Engine{

    @Override
    public void setPower() {
        this.power =  (int) ((Math.random() * (500 - 0)) + 0);

    }
}
