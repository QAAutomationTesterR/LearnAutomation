package javaExercises;

public class RemoveSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Alexa is the key player to perform Automation";

String nmae1 = name.replaceAll("\\s","");

System.out.println(nmae1);

char [] ch = name.toCharArray();

StringBuffer bf = new StringBuffer();
for(int i=0;i<name.length();i++)
{
if((ch[i]!=' ') &&  (ch[i]!='\t'))
{
bf.append(ch[i]);
	}

}
System.out.println(bf);
}
}