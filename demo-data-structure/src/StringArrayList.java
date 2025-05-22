package src;

public class StringArrayList {
  private String[] strings; // underlying data structure of StringArrayList

  public StringArrayList() {
    this.strings = new String[0];
  }

  public void add(String string) {
    String[] newStrings = new String[this.strings.length + 1];
    for (int i = 0; i < this.strings.length; i++) {
      newStrings[i] = strings[i];
    }
    newStrings[newStrings.length - 1] = string;
    this.strings = newStrings;
  }

  public void remove(String string) {
      boolean found = false;
      int idx = -1;
      for (int i = 0; i < this.strings.length; i++) {
        if(this.strings[i].equals(string)) {
          found = true;
          idx = 1;
          break;
        }
      }
      if (found) {
        
      }
  }
  public static void main(String[] args) {
    
  }
}
