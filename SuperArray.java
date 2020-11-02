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
  }
