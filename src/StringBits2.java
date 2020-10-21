public class StringBits2 {
  public String stringBits(String str) {
    String result = "";


    for (int i = 0; i < str.length(); i += 2) {
      result += str.charAt(i);
    }
    return result;
  }
}

//public class StringBits2 {
//  public String stringBits(String str) {
//StringBuilder result = new StringBuilder();
//
//    for (int i = 0; i < str.length(); i += 2){
//      result = result.append(i);
//    }
//    return result.toString();
//    }
//}