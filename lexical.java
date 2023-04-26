import java.util.*;
class lexical {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nLEXICAL ANALYSER: \nENTER INPUT:");
            String str = sc.nextLine();
            String[] arrString = str.split(" ");
            String[] output = new String[arrString.length];
            String[] noun = new String[arrString.length];
            int count = 0, index = 0, tokens = 0;
            if (arrString[0].equals("If")) {
                for (int i = 0; i < arrString.length; i++) {
if (arrString[i].equals("If") || arrString[i].equals("then")) {
                        output[i] = "(k)";
                        tokens++;
} else if (arrString[i].equals("hate") || arrString[i].equals("like")) {
    output[i] = "(v)";
    tokens++;
}
else if (arrString[i].equals("they")) {
    output[i] = "(a)";
    tokens++;
}
else if (arrString[i].equals("$")) {
    output[i] = "<eof>";
    break
}  else   {
tokens++;
String str1 = arrString[i];
int j = str1.indexOf(".");
if (j > 0) {
str1 = str1.substring(0, j) + str1.substring(j + 1); 	}
if (count == 0) {
noun[count] = arrString[i];
count++;
output[i] = "(n," + (count) + ")";
} else {
for (int r = 0; r < count; r++) {
if (noun[r].equals(str1)) {
output[i] = "(n," + (r + 1) + ")";
index++;
}    }  if (index == 0) {
noun[count] = str1;
count++;
output[i] = "(n," + (count) + ")";
} else {
index = 0;
}    }
if (j != -1) {
output[i] = output[i] + "(op)";
        tokens++;
}	}	}
System.out.println("\nNumber of tokens: " + tokens);
System.out.println("\nOUTPUT:");
for (int i = 0; i < output.length; i++) {
if (output[i] != null) {
System.out.print(output[i]);
} 	}
System.out.println("\n\nSYMBOL TABLE:");
for (int i = 0; i < count; i++) {
System.out.print(noun[i] + " ");
}
System.out.println();
for (int i = 0; i < count; i++) {
System.out.print(" [" + (i + 1) + "] ");
}    }  else {
System.out.println("Wrong Input!!!");
} 	} 	}
