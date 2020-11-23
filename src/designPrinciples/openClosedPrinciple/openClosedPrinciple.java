package designPrinciples.openClosedPrinciple;

public class openClosedPrinciple {

}

abstract class finalClass {
    private String className;

    public finalClass(String className) {
        this.className = className;
    }

    final public String getClassName() {
        return className;
    }

    final public void setClassName(String className) {
        this.className = className;
    }
}

class ExtensionClass extends finalClass {

    private String className;

    public ExtensionClass(String className) {
        super(className);
        this.className = className;
    }

    public void editName(String editedName) {
        this.className = editedName;
    }

    // if this is name getClassName, it would cause an error because the super class has made this method final.
    public String getClassNameExtension() {
      return this.className;
    }
}

class ExtensionClass2 extends finalClass {

    private String className;

    public ExtensionClass2(String className) {
        super(className);
    }

    public void setClassNameExtension(String name) {
        this.className = name;
    }
}