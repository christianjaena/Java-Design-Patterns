package behavioralPatterns.Template.TemplateExercise;

public class Workflow {
    public static void main(String[] args) {
        FrontendDeveloper react = new FrontendDeveloper();
        BackendDeveloper express = new BackendDeveloper();
        react.develop();
        express.develop();
    }
}

abstract class DeveloperWorkflow {
   protected void develop() {
       setUpEnvironment();
       cloneRepo();
       gitBranch();
       workOnModule();
       fixBugs();
       gitPush();
   }

   public abstract void gitBranch();
   public abstract void workOnModule();
   public abstract void fixBugs();

   public void setUpEnvironment() {
       System.out.println("Setting up Environment");
   }

   public void cloneRepo() {
       System.out.println("Cloning repo");
   }

   public void gitPush() {
       System.out.println("Pushing to main");
   }
}

class FrontendDeveloper extends DeveloperWorkflow {

    @Override
    public void gitBranch() {
        System.out.println("Git branch loginpage");
    }

    @Override
    public void workOnModule() {
        System.out.println("Log In Page");
    }

    @Override
    public void fixBugs() {
        System.out.println("Responsive Issues");
    }
}

class BackendDeveloper extends DeveloperWorkflow {

    @Override
    public void gitBranch() {
        System.out.println("Git branch model");
    }

    @Override
    public void workOnModule() {
        System.out.println("Create Models");
    }

    @Override
    public void fixBugs() {
        System.out.println("Server issues");
    }
}
