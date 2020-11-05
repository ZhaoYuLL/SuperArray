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
      return "empty array";
    }
    String result="[";
    for (int i=0; i<size-1;i++){
      result += data[i] + ", ";
    }
    result +=data[size-1]+ "]";

    return result;
  }

  public boolean contains(String s){
    for(int i = 0; i < size; i ++){
      if(data[i]==s){
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
    if(index > data.length){
      resize();
    }
    String[] temp = new String[size+1];
    for(int i = 0; i < index; i ++){
      temp[i] = data[i];
    }
    temp[index]=element;
    for(int i = index+1; i < size; i ++){
      temp[i]=data[i];
    }
    size++;
    data = temp;
  }

  public String remove(int index){
    String[] temp = new String[size-1];
    String replaced = data[index];
    for(int i = index; i < size -1; i ++){
      data[i]=data[i+1];
    }
    size--;
    return replaced;
  }

}
