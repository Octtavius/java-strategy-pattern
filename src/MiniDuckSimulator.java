import ie.home.behavior.fly.FlyRocketPowered;
import ie.home.ducks.DecoyDuck;
import ie.home.ducks.MallardDuck;
import ie.home.ducks.ModelDuck;
import ie.home.ducks.RubberDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        RubberDuck rubberDuck = new RubberDuck();
        DecoyDuck decoyDuck = new DecoyDuck();

        ModelDuck modelDuck = new ModelDuck();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        decoyDuck.performQuack();

        modelDuck.performFly();
        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();

    }
}
