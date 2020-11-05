public class demo{
  public static void removeDuplicates(SuperArray s){  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    SuperArray.removeDuplicates(words);
    System.out.println(words);

    SuperArray a = new SuperArray();
    a.add("c");   a.add("b");    a.add("b");    a.add("s");

    SuperArray b = new SuperArray();
    b.add("d");   b.add("s");    b.add("b");    b.add("b");   b.add("u");

    SuperArray c = SuperArray.findOverlap(a,b);
    System.out.println(c);

  }
}
