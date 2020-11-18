package memento;

public class Editor {

    private String content;

    public EditorStatus createState() {
        return new EditorStatus(content);
    }

    public void restore(EditorStatus state) {
        content = state.getStatus();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
