package src;

import java.util.List;
import java.util.Stack;

public class MSWord {
  private List<String> redostack;
  private List<String> undostack;

  // constructor
  public MSWord() {
    this.redostack = new Stack<>();
    this.undostack = new Stack<>();
  }

  public void undo() {
    String element = undostack.pop();
    redostack.push(element);
  }

  public void redo() {
    String element = redostack.pop();
    undostack.push(element);
  }

  public void addWord(String word) {
    this.undostack.add(word);
  }

  public static void main(String[] args) {
    MSWord msword = new MSWord();
    msword.addWord("John");
    msword.addWord("Peter");
    msword.undo();
  }
}
