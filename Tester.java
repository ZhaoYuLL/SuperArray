public class Tester{
  public static void main(String[] args){
    SuperArray a = new SuperArray();
    a.add("one");
    a.add("2");
    a.add("one");
    System.out.println(a.set(1,"two"));

  }
}
