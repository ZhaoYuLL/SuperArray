public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i=0; i<s.size();i++){
      if (i!=s.indexOf(s.get(i))){
        s.remove(i);
        i--;
      }
    }
    }
    public static SuperArray findOverlap(SuperArray a, SuperArray b){
      SuperArray output = new SuperArray();
      for(int i = 0; i < a.size(); i ++){
          if(b.contains(a.get(i))){
            output.add(a.get(i));
          }
      }
      removeDuplicates(output);
      return output;
    }

  public static void main(String[]args){
    SuperArray a = new SuperArray();
    a.add("9");   a.add("1");     a.add("2");     a.add("2");
    a.add("3");    a.add("4");
    SuperArray b = new SuperArray();
    b.add("0");   b.add("4");     b.add("2");     b.add("2");
    b.add("9");

    System.out.println(findOverlap(a,b));
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);  }
}
