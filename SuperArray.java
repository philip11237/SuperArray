public class SuperArray{
  private String [] data;
  private int size; //The current size
  public SuperArray(){
    size =0;
    data=new String[10];
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if (size>=data.length){
      return false;
    }else {
      data[size]=element;
      size+=1;
      return true;
    }
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String temp=data[index];
    data[index]=element;
    return temp;
  }
}
