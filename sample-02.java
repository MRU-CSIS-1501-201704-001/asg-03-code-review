System.out.println("Entomology is the science that studies");
System.out.println("A. Behavior of human beings");
System.out.println("B. Insects");
System.out.println("C. The origin and history of technical and scientific terms");
System.out.println("D. The formation of rocks");
System.out.print("Answer: ");
char realAnswer1 = 'B';

String inputanswer1 = keyboard.next();
char comparingAnswer1 = inputanswer1.charAt(0);

if (Character.toUpperCase(comparingAnswer1) == realAnswer1)
{
    score += 1;
} else {
    score += 0;
}

System.out.format("%n");

System.out.println("Eritrea, which became the 182nd member of the UN in 1993, is the continent of");
System.out.println("A. Asia");
System.out.println("B. Africa");
System.out.println("C. Europe");
System.out.println("D. Australia");
System.out.print("Answer: ");
char realAnswer2 = 'B';

String inputanswer2 = keyboard.next();  
char comparingAnswer2 = inputanswer2.charAt(0); 