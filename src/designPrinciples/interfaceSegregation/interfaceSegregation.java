package designPrinciples.interfaceSegregation;

public class interfaceSegregation {
}

/*
The interface should be split into smaller generalization.

interface ICashier {
    public void scanItem();
    public void takePayment();
    public void dispenseChange();
    public void startShift();
    public void takeBreak();
    public void completeShift();
}

class SelfServeMachine implements ICashier {

    @Override
    public void scanItem() {

    }

    @Override
    public void takePayment() {

    }

    @Override
    public void dispenseChange() {

    }

    @Override
    public void startShift() {

    }

    @Override
    public void takeBreak() {

    }

    @Override
    public void completeShift() {

    }
}

class HumanCashier implements ICashier {

    @Override
    public void scanItem() {

    }

    @Override
    public void takePayment() {

    }

    @Override
    public void dispenseChange() {

    }

    @Override
    public void startShift() {

    }

    @Override
    public void takeBreak() {

    }

    @Override
    public void completeShift() {

    }
}
*/

interface ICashier {
    public void scanItem();
    public void takePayment();
    public void dispenseChange();
}

interface IHumanWorker {
    public void startShift();
    public void takeBreak();
    public void completeShift();
}

class SelfServeMachine implements ICashier {

    @Override
    public void scanItem() {

    }

    @Override
    public void takePayment() {

    }

    @Override
    public void dispenseChange() {

    }
}

class HumanCashier implements ICashier, IHumanWorker {

    @Override
    public void scanItem() {

    }

    @Override
    public void takePayment() {

    }

    @Override
    public void dispenseChange() {

    }

    @Override
    public void startShift() {

    }

    @Override
    public void takeBreak() {

    }

    @Override
    public void completeShift() {

    }
}