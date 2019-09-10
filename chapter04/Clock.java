// fix the source file to compile if broken

class Clock {

  String time;

  // "void" ok here; it operates on external "time" 
  // but does not "return" a value itself
  void setTime(String t) {
    time = t;
  }

  // fix: change method return Type "void" to "String"
  String getTime() {
    return time;
  }

}