package state;

public class SelectionTool implements Tool{
    @Override
    public void mouseUp() {
        System.out.println("Selection up");
    }

    @Override
    public void mouseDown() {
        System.out.println("Selection down");
    }
}
