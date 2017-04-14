class FirstLastSame{
public static void main(String args[]){
String s="xhix";
if(s.substring(0)==s.substring(s.length-1)){
String x = s.substring(1, s.length- 1);
System.out.println(x);
}
else{
System.out.println(s);
}

}
}