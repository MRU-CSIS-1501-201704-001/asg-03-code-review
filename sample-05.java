System.out.println("What is the theme of the board game Die Macher?");
System.out.println("A.	sculpting");
System.out.println("B.	car racing");
System.out.println("C.	German politics");
System.out.println("D.	castle building");
String questionSevenAns= kbd.nextLine();
questionSevenAns = questionSevenAns.toUpperCase();
char seventhAnsLetter = questionSevenAns.charAt(0);   

if (seventhAnsLetter == 'C') testScore += 1; 
if (seventhAnsLetter== 'C') cScore += 1;

if(testScore >= TEST_PASS_NUM) System.out.println("You have passed the quiz!");
else System.out.println("You have failed the quiz.");

if (cScore == ALL_C_NUM) System.out.println("All Cs, eh? That’s how I passed music theory last year.");