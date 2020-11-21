package behavioralPatterns.Command;

//public class Command {
//   public static void main(String[] args) {
//      Commander cmd1 = new Commander();
//      cmd1 = new PasteCommand(aDocument, aPosition, aText);
//      cmd1.invokeCommand(cm1):
//
//   }

//}
//
//class Commander {
//   public void execute() {
//
//   }
//
//   public void unexecute() {
//
//   }
//   public boolean isReversible() {
//      return false;
//   }
//}
//
//class PasteCommand extends Commander {
//   private Document document;
//   private int position;
//   private String text;
//
//   public PasteCommand(Document document, int position, String text) {
//      this.document = document;
//      this.position = position;
//      this.text = text;
//   }
//
//   public void execute() {
//      document.insertText(position, text);
//   }
//
//   public void unExecute() {
//      document.deleteText(position, text.length());
//   }
//
//   public boolean isReversible() {
//      return true;
//   }
//}
//
//
//class Receiver {
//
//}
