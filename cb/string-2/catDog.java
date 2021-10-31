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
