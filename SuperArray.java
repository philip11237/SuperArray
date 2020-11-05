public class SuperArray{
  private String [] data;
  private int size; //The current size
  public SuperArray(){
    size =0;
    data=new String[10];
  }
  public SuperArray(int initialCapacity){
    size=0;
    data= new String[initialCapacity];
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
    public void add(int index, String element){
      if (size==data.length){
        resize();
      }
       for (int i =index; i<size; i++) {
        data[index+1]=data[index];
      }
      data[index]=element;
      size++;
    }
    public void remove(int index){
        String temp=data[index];
       for (int i =index; i <size-1; i++) {
        data[index]=data[index+1];
      }
      size--;
      return temp;
    }
     public int indexOf(String s){
       for (int i =0; i<size; i++) {
         if (data[i].equals(s)){
         return i;
       }
     }
       return -1;
   }
   public String[] toArray(){
     String[] returndata= new String[size];
      for (int i =0; i <size; i++) {
        returndata[i]= data[i];
   }
   return returndata;
 }
  }
