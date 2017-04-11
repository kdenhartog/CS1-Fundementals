public class Calculator {
 public int add(int arg1, int arg2) throws NegativeArguementException {
  if (arg1 < 0 || arg2 < 0) {
   throw new NegativeArguementException();
  } else {
   int result = arg1 + arg2;
   return result;
  }
 }

 public int subtract(int arg1, int arg2) throws NegativeResultException, NegativeArguementException {
   if (arg2>arg1){
     throw new NegativeResultException();
   }else if(arg1 < 0 || arg2 < 0) {
     throw new NegativeArguementException();
   }else{
   int result = arg1 - arg2;
  return result;
 }
 }

 public int multiply(int arg1, int arg2) throws NegativeArguementException {
   if (arg1 < 0 || arg2 < 0) {
     throw new NegativeArguementException();
   }else{
  int result = arg1 * arg2;
  return result;
 }
 }
 public int divide(int arg1, int arg2) throws NegativeArguementException {
   if (arg1 < 0 || arg2 < 0) {
     throw new NegativeArguementException();
   }else{
  int result = arg1 / arg2;
  return result;
 }

}
}