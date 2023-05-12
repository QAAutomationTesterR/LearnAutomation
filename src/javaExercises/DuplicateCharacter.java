package javaExercises;

public class DuplicateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Sakkett";

for(int i = 0;i<name.length();i++)
{
char word = name.charAt(i);
for(int j=i+1;j<name.length();j++)
{
	if(word==name.charAt(j))
	{
		System.out.println(word);
		break;
	}
}
/*
 * int count = 0;
 * 
 * char [] ch = name.toCharArray();
 * 
 * for(int i =0;i<name.length();i++) { for(int j=i+1;j<name.length();j++)
 * 
 * { if(ch[i]==ch[j]) { System.out.println(ch[i]); break; } } }
 */
}}}