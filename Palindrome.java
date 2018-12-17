class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,i;    
  int n=123;
  
  i=n;    
  while(n>0){    
   r=n%10;    
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(i==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  