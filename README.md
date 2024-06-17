# Java_RegEx
1. Introduction.
2. The main important application areas of Regular Expression
3. Pattern class
4. Matcher class
5. Important methods of Matcher class
6. Character classes
7. Predefined character classes
8. Quantifiers
9. Pattern class split() method
10. String class split() method
11. StringTokenizer
12. Requirements:
  o Write a regular expression to represent all valid identifiers in java language
  o Write a regular expression to represent all mobile numbers
  o Write a regular expression to represent all Mail Ids
  o Write a program to extract all valid mobile numbers from a file

**Introduction**
A Regular Expression is a expression which represents a group of Strings according to a
particular pattern.
**Example:**
   We can write a Regular Expression to represent all valid mail ids.
   We can write a Regular Expression to represent all valid mobile numbers.
**The main important application areas of Regular Expression are:**
   To implement validation logic.
   To develop Pattern matching applications.
   To develop translators like compilers, interpreters etc.
   To develop digital circuits.
   To develop communication protocols like TCP/IP, UDP etc.
**Example:**
import java.util.regex.*;
classRegularExpressionDemo
{
public static void main(String[] args)
{
int count=0;
Pattern p=Pattern.compile("ab");
Matcher m=p.matcher("abbbabbaba");
while(m.find())
{
count++;
System.out.println(m.start()+"------"+m.end()+"--
----"+m.group());
}
System.out.println("The no of occurences
:"+count);
}
}
Output:
0------2------ab
4------6------ab
7------9------ab
The no of occurrences: 3

**Pattern class:**
   A Pattern object represents "compiled version of Regular Expression".
   We can create a Pattern object by using compile() method of Pattern class.
  _public static Pattern compile(String regex);_
**Example:**
_Pattern p=Pattern.compile("ab");_
Note: if we refer API we will get more information about pattern class.

**Matcher:**
A Matcher object can be used to match character sequences against a Regular Expression.
We can create a Matcher object by using matcher() method of Pattern class.
_public Matcher matcher(String target);
Matcher m=p.matcher("abbbabbaba");_

**Important methods of Matcher class:**
**1. boolean find();**
It attempts to find next match and returns true if it is available otherwise returns
false.
**2. int start();**
Returns the start index of the match.
**3. int end();**
Returns the offset(equalize) after the last character matched.(or)
Returns the "end+1" index of the matched.
**4. String group();**
Returns the matched Pattern.
**Note**: Pattern and Matcher classes are available in java.util.regex package, and
introduced in 1.4 version


**Character classes:**
1. [abc]-------------------Either 'a' or 'b' or 'c'
2. [^abc] -----------------Except 'a' and 'b' and 'c'
3. [a-z] --------------------Any lower case alphabet symbol
4. [A-Z] --------------------Any upper case alphabet symbol
5. [a-zA-Z] ----------------Any alphabet symbol
6. [0-9] --------------------Any digit from 0 to 9
7. [a-zA-Z0-9] ------------Any alphanumeric character
8. [^a-zA-Z0-9] ------------Any special character


**Predefined character classes:**
\s---------------------space character
\d---------------------Any digit from o to 9[o-9]
\w---------------------Any word character[a-zA-Z0-9]
. ---------------------Any character including special characters.
\S---------------------any character except space character
\D---------------------any character except digit
\W---------------------any character except word character(special character)

**Quantifiers:**
Quantifiers can be used to specify no of characters to match.
a-----------------------Exactly one 'a'
a+----------------------At least one 'a'
a*----------------------Any no of a's including zero number
a? ----------------------At most one 'a'

**StringTokenizer:**
   This class present in java.util package.
   It is a specially designed class to perform string tokenization.
  The default regular expression for the StringTokenizer is space.

  **Write a regular expression to represent all valid identifiers in java language.
Rules:**
The allowed characters are:
1. a to z, A to Z, 0 to 9, -,#
2. The 1st character should be alphabet symbol only.
3. The length of the identifier should be at least 2.

**RegEx:"[a-zA-Z][a-zA-Z0-9-#]+")**

**Write a regular expression to represent all mobile numbers.**
1. Should contain exactly 10 digits.
2. The 1st digit should be 7 to 9.

**RegEx:("[7-9][0-9]{9}")**

**Write a regular expression to represent all Mail Ids.**
**RegEx:("[a-zA-Z][a-zA-Z0-9-.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");**

**Write a regular expressions to represent all Java language identifiers :**
Rules :
 The length of the identifier should be atleast two.
 The allowed characters are
 a-z
 A-Z
 0-9
 #
 $


 The first character should be lower case alphabet symbol k-z , and second
character should be a digit divisible by 3

RegEx:[k-z][0369][a-zA-Z0-9#$]*


**Write a regular expressions to represent all names starts with 'a'**
regex:[aA][a-zA-Z]*

**To represent all names starts with 'A' ends with 'K'**
regex:-[aA][a-zA-Z]*[kK]

**Write a regular expression to represent a valid Ip Address.**
RegEx:-**"\\b((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";**




