package com.algorithm;

import java.util.Arrays;

public class ArrayCheckEqual {
	  static boolean areAnagram(String[] str1,
              String[] str2)
{
int n1 = str1.length;
int n2 = str2.length;
if (n1 != n2)
return false;
Arrays.sort(str1);
Arrays.sort(str2);

for (int i = 0; i < n1; i++)
if (str1[i] != str2[i])
return false;

return true;
}
public static void main(String[] args) {

String str1[] = {"aa", "bb","cc"};
String str2[] = {"cc","bb","aa"};
if (areAnagram(str1, str2))
System.out.println(
    "The two strings are" +
            " anagram of each other");
else
System.out.println(
    "The two strings are not" +
            " anagram of each other");
}

}
