
public class Main {

    public final static int NUM_OF_MACHINES = 5;

    public static void main(String[] args) {

        Machine[] machines = new Machine[NUM_OF_MACHINES];
        HeatEngine[] heatEngines = new HeatEngine[NUM_OF_MACHINES];
        ProductionEngine[] productionEngines = new ProductionEngine[NUM_OF_MACHINES];
        WrapperEngine[] wrapperEngines = new WrapperEngine[NUM_OF_MACHINES];

        for (int i = 0; i < heatEngines.length; i++) {
            heatEngines[i] = new HeatEngine();
            heatEngines[i].setPower();
        }
        for (int i = 0; i < productionEngines.length; i++) {
            productionEngines[i] = new ProductionEngine();
            productionEngines[i].setPower();
        }
        for (int i = 0; i < wrapperEngines.length; i++) {
            wrapperEngines[i] = new WrapperEngine();
            wrapperEngines[i].setPower();
        }

        machines[0] = new Machine(5, "Blue", heatEngines[0], productionEngines[0], wrapperEngines[0]);
        machines[1] = new Machine(2, "Yellow", heatEngines[1], productionEngines[1], wrapperEngines[1]);
        machines[2] = new Machine(6, "White", heatEngines[2], productionEngines[2], wrapperEngines[2]);
        machines[3] = new Machine(10, "Black", heatEngines[3], productionEngines[3], wrapperEngines[3]);
        machines[4] = new Machine(8, "Red", heatEngines[4], productionEngines[4], wrapperEngines[4]);

        for (int i = 0; i < machines.length; i++) {
            machines[i].setPower();
            System.out.println("Machine N" + (i + 1) + " can produce " + machines[i].power + " sweets per day");
        }
    }
}







