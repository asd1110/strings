class Concatenate{
public static void main(String args[]){
	
String s1="Mark";
String s3=s1.toLowerCase();
String s2="Kate";
String s4= s2.toLowerCase();
StringBuilder bulid = new StringBuilder(s4);
bulid.deleteCharAt(0);
String z=s3.concat(s4);
System.out.println(z);
}

}