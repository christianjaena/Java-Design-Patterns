package creationalPatterns;

public class FactoryObject {
    public static void main(String[] args) {
        KnifeStore knifeStore = new KnifeStore(new KnifeFactory());
        knifeStore.orderKnife("Kitchen");
    }
}

class KnifeStore {
    private KnifeFactory factory;

    public KnifeStore(KnifeFactory factory) {
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType) {
        Knife knife;

        knife = factory.createKnife(knifeType);

        knife.sharpen();
        knife.polish();
        knife.packaged();

        return knife;
    }
}

class KnifeFactory {

   public Knife createKnife(String knifeType) {
      Knife knife = new Knife();
      knife.setKnifeType(knifeType);
      return knife;
   }
}

class Knife {
    private String knifeType;

    public void sharpen() {
        System.out.println("Sharpened");
    }

    public void polish() {
        System.out.println("Polished");
    }

    public void packaged() {
        System.out.println("Packaged");
    }

    public void setKnifeType(String knifeType) {
        this.knifeType = knifeType;
    }

    public String getKnifeType() {
        return knifeType;
    }
}
