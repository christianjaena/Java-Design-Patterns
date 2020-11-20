package behavioralPatterns.Template;

public class Template {
}

abstract class PastaDish {
    public final void makeRecipe() {
        boilWater();
        addPasta();
        cookPasta();
        drainAndPlate();
        addSauce();
        addProtein();
        addGarnish();
    }

    protected abstract void addPasta();
    protected abstract void addSauce();
    protected abstract void addProtein();
    protected abstract void addGarnish();

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void cookPasta() {
        System.out.println("Cooking pasta");
    }

    private void drainAndPlate() {
        System.out.println("Drain and plate");
    }
}

class SpaghettiMeatballs extends PastaDish {

    @Override
    protected void addPasta() {
        System.out.println("Add spaghetti");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add tomato sauce");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add  meatballs");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add Parmesan cheese");
    }
}

class PenneAlfredo extends PastaDish {

    @Override
    protected void addPasta() {
        System.out.println("Add penne");
    }

    @Override
    protected void addSauce() {
        System.out.println("Add chicken");
    }

    @Override
    protected void addProtein() {
        System.out.println("Add Alfredo sauce");
    }

    @Override
    protected void addGarnish() {
        System.out.println("Add parsley");
    }
}