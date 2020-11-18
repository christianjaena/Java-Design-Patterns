package state;

public class BrushTool implements Tool {
    @Override
    public void mouseUp() {
        System.out.println("Brush Up");
    }

    @Override
    public void mouseDown() {
        System.out.println("Brush Down");
    }
}
