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
      resize();
    }
    data[size]=element;
    size+=1;
    return true;
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String temp=data[index];
    data[index]=element;
    return temp;
  }
  private void resize(){
    String[] temp= data;
    data= new String[data.length*2];
    for (int i =0; i<temp.length;i++){
      data[i]=temp[i];
    }
  }
  public boolean isEmpty(){
    return  size>0;
  }
  public void clear(){
    size=0;
  }
  public String toString(){
    String empty = "[";
    for (int i = 0; i <size; i++) {
      if (i==size-1){
        empty += data[i];}
        else {empty += data[i]+", ";}
      }
      return empty+="]";
    }
    public boolean contains(String s){
      for (int i = 0; i <size; i++) {
        if (data[i].equals(s)){
          return true;
        }
      }
      return false;
    }
  }
