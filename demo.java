public class Demo{
    public static void removeDuplicates(SuperArray s){
      for (int i =0; i <s.size();) {
        if (s.indexOf(s.get(i)) !=i){
          s.remove(i);
        }
        else i++;
      }
    }
    public static SuperArray findOverlap(SuperArray a, SuperArray b){
      SuperArray c= new SuperArray();
      for(int i=0; i<a.size();i++){
        if (b.indexOf(a.get(i))!= -1){
          c.add(a.get(i));
        }
      }
      removeDuplicates(c);
      return c;
    }
    public static SuperArray zip(SuperArray a, SuperArray b){
        SuperArray result=new SuperArray();
        for(int i =0; i<a.size()||i<b.size();i++){
            if (i<a.size()){
              result.add(a.get(i));
            }
            if(i<b.size()){
              result.add(b.get(i));
            }
        } return result;
     }
}
