public int countCode(String str) {
  int ans = 0;
  for (int i = 0;i<str.length()-3;i++){
    if ((str.substring(i,i+2).equals("co"))&&(str.substring(i+3,i+4).equals("e"))){
      ans+=1;
    }
  }
  return ans;
}
