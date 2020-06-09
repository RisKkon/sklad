public class Machine {

    int power;
    int height;
    String color;
    HeatEngine heatEngine;
    ProductionEngine productionEngine;
    WrapperEngine wrapperEngine;

    public Machine(int height, String color, HeatEngine heatEngine,
                                             ProductionEngine productionEngine,
                                             WrapperEngine wrapperEngine) {

        this.height           = height;
        this.color            = color;
        this.heatEngine       = heatEngine;
        this.productionEngine = productionEngine;
        this.wrapperEngine    = wrapperEngine;
    }

    public void setPower() {

        this.power = heatEngine.power + productionEngine.power + wrapperEngine.power;
    }
}
