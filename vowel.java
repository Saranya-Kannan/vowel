import java.io.*;
import java.util.*;
public class vowel
{
public static void main(String args[])
{
int i=0;
Scanner s=new Scanner(System.in);
System.out.println("enter a character");
char ch=s.next().charAt(0);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
case 'A':
case 'E':
case 'I':
case 'O':
case 'U':
i++;
}
if(i==1)
{
System.out.println("vowel");
}
else if((ch>='a'&&ch<='z')||(ch>'A'&&ch<='Z'))
{
System.out.println("constant");
}
}
}
