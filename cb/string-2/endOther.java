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
