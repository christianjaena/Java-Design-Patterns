package behavioralPatterns.State;

public class State {
}

interface IState {
    public void insertDollar(VendingMachine vendingMachine);
    public void ejectMoney(VendingMachine vendingMachine);
    public void dispense(VendingMachine vendingMachine);
}

class IdleState implements IState {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("dollar inserted");

//        vendingMachine.setState(vendingMachine.getHasOneDollarState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("no money to return");
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("payment required");
    }
}

class HasOneDollarState implements IState {

    @Override
    public void insertDollar(VendingMachine vendingMachine) {
        System.out.println("already have one dollar");

        vendingMachine.doReturnMoney();
//        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void ejectMoney(VendingMachine vendingMachine) {
        System.out.println("returning money");

        vendingMachine.doReturnMoney();
//        vendingMachine.setState(vendingMachine.getIdleState());
    }

    @Override
    public void dispense(VendingMachine vendingMachine) {
        System.out.println("releasing product");

//        if (vendingMachine.getCount() > 1) {
//            vendingMachine.doReleaseProduct();
//            vendingMachine.setState(vendingMachine.getIdleState());
//        } else {
//            vendingMachine.doReleaseProduct();
//            vendingMachine.setState(vendingMachine.getOutOfSTockState());
//        }
    }
}

class VendingMachine {
    private IState idleState;
    private IState hasOneDollarState;
    private IState outOfStockState;

    private IState currentState;
    private int count;

    public VendingMachine(int count) {
        idleState = new IdleState();
        hasOneDollarState = new HasOneDollarState();
//        outOfStockState = new OutOfStockState();
        if (count > 0) {
            currentState = idleState;
            this.count = count;
        } else {
//            currentState = outOfStockState;
            this.count = 0;
        }
    }

    public void insertDollar() {
        currentState.insertDollar(this);
    }

    public void ejectMoney() {
        currentState.ejectMoney(this);
    }

    public void dispense() {
        currentState.dispense(this);
    }

    public void doReturnMoney()  {};
}