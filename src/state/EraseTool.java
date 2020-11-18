package state;

public class EraseTool implements Tool {

    @Override
    public void mouseUp() {
        System.out.println("Erase up");
    }

    @Override
    public void mouseDown() {
        System.out.println("Erase down");
    }
}
