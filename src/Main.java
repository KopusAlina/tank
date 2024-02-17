public class Main {

    public static void main(String[] args) {
        // At (0;0) fuel=100
        final Tank justTank = new Tank();
        // At (10;10) fuel=100
        final Tank anywareTank = new Tank(10, 10);
        // At (20;30) fuel=200
        final Tank customTank = new Tank(20, 30, 200);
        justTank.goForward(200);
        justTank.printPosition();
        anywareTank.goBackward(-200);
        anywareTank.printPosition();
        customTank.goForward(201);
        customTank.printPosition();

        Tank tank = new Tank();
        tank.setX(1000);
        tank.setY(2000);
        tank.printPosition();

        System.out.println("branc_new");
    }
}

