public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if(size >= data.length){
      resize();
    }
    data[size] = element;
    size ++;
    return true;
  }

  public String get(int index){
    if(index >= size || index < 0){
      return null;
    }else{
      return data[index];
    }
  }

  public String set(int index, String element){
    if(index >= size || index < 0){
      return null;
    }else{
      String replaced = data[index];
      data[index] = element;
      return replaced;
    }
  }

  private void resize(){
    String[] newData = new String[data.length*2];
    for(int i = 0; i < data.length; i ++){
      newData[i] = data[i];
    }
    data = newData;
  }

  public boolean isEmpty(){
    return size == 0;
  }
  public void clear(){
    String[] temp = {};
    data = temp;
    size = 0;
  }

  public String toString(){
    if(size==0){
      return "[]";
    }
    String result="[";
    for (int i=0; i<size-1;i++){
      if(data[i] != null){
      result += data[i] + ", ";
    }
    }
    if(data[size-1] != null){
    result += data[size-1];
  }
    return result + "]";
  }

  public boolean contains(String s){
    if(size==0){
      return false;
    }
    for(int i = 0; i < size; i ++){
      if(data[i]!=null && data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public void add(int index, String element){
    for(int i = size; i > index;i--){
      data[i] = data[i-1];
    }
    data[index] = element;
    size++;
  }

  public String remove(int index){
    String old = data[index];
    if (size>0){
      for (int i = index; i < size()-1; i++){
         data[i] = data[i+1 ];
       }
      // data[size - 1] = null;
      size--;

    }
    return old;
  }

  public int indexOf(String s){
    int position = -1;
    for(int i = 0; i < size; i ++){
      if(data[i].equals(s)){
        position = i;
        return position;
      }
    }
    return position;
  }
  //need to test this
  public String[] toArray(){
    String[] safe = new String[size];
    for(int i = 0; i < size; i ++){
      safe[i]=data[i];
    }
    return safe;
  }

  public int lastIndexOf(String value){
    int position = -1;
    for(int i = size()-1; i >= 0; i --){
      if(data[i].equals(value)){
        position = i;
        return position;
      }
    }
    return position;
  }

  }
