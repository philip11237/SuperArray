public class ExceptionTester {

  public static void main(String[] args) {
    try {
      SuperArray test= new SuperArray(-100);
    }
    catch( IllegalArgumentException test1){
      System.out.println ("exception caught");
    }
    try {
      SuperArray test= new SuperArray();
      test.get(1);
    }
    catch( IndexOutOfBoundsException test1){
      System.out.println ("exception caught");
    }
    try {
      SuperArray test= new SuperArray();
      test.add(1, "a");
    }
    catch( IndexOutOfBoundsException test1){
      System.out.println ("exception caught");
    }
    try {
      SuperArray test= new SuperArray();
      test.remove(1);
    }
    catch( IndexOutOfBoundsException test1){
      System.out.println ("exception caught");
    }
    try {
      SuperArray test= new SuperArray();
      test.set(1, "a");
    }
    catch( IndexOutOfBoundsException test1){
      System.out.println ("exception caught");
    }
  }

}
