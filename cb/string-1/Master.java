public class Master{

  public String helloName(String name) {
    return "Hello "+name+"!";
  }

  public String makeAbba(String a, String b) {
    return a+b+b+a;
  }

  public String makeTags(String tag, String word) {
    return "<"+tag+">"+word+"</"+tag+">";
  }

  public String makeOutWord(String out, String word) {
    return out.substring(0,((out.length())/2))+word+out.substring(((out.length())/2),out.length());
  }

  public String extraEnd(String str) {
    String apple = str.substring(str.length()-2,str.length());
    return apple+apple+apple;
  }

  public String firstTwo(String str) {
  if (str.length()>=2){
    return str.substring(0,2);
  }
  else{
    return str;
  }
}

public String firstHalf(String str) {
  return str.substring(0,(str.length())/2);
}

public String withoutEnd(String str) {
  return str.substring(1,str.length()-1);
}

public String comboString(String a, String b) {
  if (a.length()>b.length()){
    return b+a+b;
  }
  return a+b+a;
}

public String nonStart(String a, String b) {
  return a.substring(1,a.length())+b.substring(1,b.length());
}

}
