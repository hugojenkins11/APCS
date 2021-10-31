public class Master{

  public boolean catDog(String str) {
    int catctr = 0;
    int dogctr = 0;
    for (int i = 0;i<str.length()-2;i++){
      if (str.substring(i,i+3).equals("cat")){
        catctr += 1;
      }
      if (str.substring(i,i+3).equals("dog")){
        dogctr += 1;
      }
    }
    return dogctr == catctr;
  }

  public int countCode(String str) {
    int ans = 0;
    for (int i = 0;i<str.length()-3;i++){
      if ((str.substring(i,i+2).equals("co"))&&(str.substring(i+3,i+4).equals("e"))){
        ans+=1;
      }
    }
    return ans;
  }

  public int countHi(String str) {
    int ans = 0;
    for (int i = 0;i<str.length()-1;i++){
      if (str.substring(i,i+2).equals("hi")){
        ans+=1;
      }
    }
    return ans;
  }

  public String doubleChar(String str) {
    String ans = "";
    for (int i = 0;i<str.length();i++){
      ans = ans + str.substring(i,i+1)+str.substring(i,i+1);
    }
    return ans;
  }

  public boolean endOther(String a, String b) {
    String a1;
    String b1;
    if (a.length()>b.length()){
      a1 = a.toLowerCase();
      b1 = b.toLowerCase();
    }
    else{
      a1 = b.toLowerCase();
      b1 = a.toLowerCase();
    }
    if ((a1.substring(a1.length()-b1.length(),a1.length()).equals(b1))){
      return true;
    }
    return false;
  }

  public boolean xyzThere(String str) {
    for (int i = 0;i<str.length()-2;i++){
      if (str.substring(i,i+3).equals("xyz")){
        if (i != 0){
          if (!(str.substring(i-1,i).equals("."))){
            return true;

          }
          }
          else{
            return true;
          }
        }
      }
    return false;
  }
}
