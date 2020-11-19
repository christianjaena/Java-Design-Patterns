package creationalPatterns;

public class FactoryMethod {
    public static void main(String[] args) {
        BudgetKnifeStore budgetKnifeStore = new BudgetKnifeStore();
        QualityKnifeStore qualityKnifeStore = new QualityKnifeStore();
        FamilyKnifeStore familyKnifeStore = new FamilyKnifeStore();
        budgetKnifeStore.orderKnife("Chef");
        qualityKnifeStore.orderKnife("Chef");
        familyKnifeStore.orderKnife("Chef");

    }
}
abstract class AKnifeStore {
    public Knife orderKnife(String knifeType) {
       Knife knife;

       knife = createKnife(knifeType);

       knife.sharpen();
       knife.polish();
       knife.packaged();

       return knife;
    }

    abstract Knife createKnife(String knifeType);
}

class BudgetKnifeStore extends AKnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        System.out.println("Creating Budget Knife");
        Knife knife = new Knife();
        knife.setKnifeType(knifeType);
        return knife;
    }
}

class QualityKnifeStore extends AKnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        System.out.println("Creating Quality Knife");
        Knife knife = new Knife();
        knife.setKnifeType(knifeType);
        return knife;
    }
}

class FamilyKnifeStore extends AKnifeStore {

    @Override
    public Knife createKnife(String knifeType) {
        System.out.println("Creating Family Knife");
        Knife knife = new Knife();
        knife.setKnifeType(knifeType);
        return knife;
    }
}

class CKnife {
    private String knifeType;

    public void setKnifeType(String knifeType) {
        this.knifeType = knifeType;
    }

    public String getKnifeType() {
        return knifeType;
    }

    public void sharpen() {
        System.out.println("Sharpen");
    }

    public void polish() {
        System.out.println("Polish");
    }

    public void packaged() {
        System.out.println("Packaged");
    }
}