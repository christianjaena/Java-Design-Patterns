package state;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new EraseTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
