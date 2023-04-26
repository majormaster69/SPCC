import java.util.Scanner;
import java.util.Vector;
public class exp8 {
    public static void main(String[] args) {
System.out.print("\nEnter number of statements: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
Vector<String> statements = new Vector<String>();
        System.out.println("\nEnter the statements: ");
        for (int i = 0; i < n; i++) {
            String temp = sc.next();
            statements.addElement(temp);     }
        Vector<String> op = new Vector<String>();
        Vector<String> arg1 = new Vector<String>();
        Vector<String> arg2 = new Vector<String>();
        Vector<String> result = new Vector<String>();
        for (int i = 0; i < statements.size(); i++) {
String[] chars = statements.elementAt(i).split("");
            result.addElement(chars[0]);      
            int a = 1;
            int flag = 0;
            String st = statements.elementAt(i);
boolean s = st.contains("+") || st.contains("-") || st.contains("*") || st.contains("/"); 
            if (!s) {
                flag = 1;
                op.addElement("=");
            }
            for (int j = 2; j < chars.length; j++) {
boolean b = chars[j].equals("+") || chars[j].equals("-") || chars[j].equals("*") || chars[j].equals("/");
                if(b && flag == 0) {
                    op.addElement(chars[j]);    }
                else if(a == 1 && !b) {
                    arg1.addElement(chars[j]);
                    a++;                 }
                else if(a == 2 && !b) {
                    arg2.addElement(chars[j]);
                    a++;
                }
            }
            if(a == 2) {
                arg2.addElement("");
            }         }
        System.out.println("\n\top\targ1\targ2\tresult");
        for (int i = 0; i < result.size(); i++) {
            System.out.println(i + "\t" + op.elementAt(i) + "\t" + arg1.elementAt(i) + "\t" + arg2.elementAt(i) + "\t" + result.elementAt(i));
        }        System.out.println("\n\top\targ1\targ2");
        for (int i = 0; i < result.size(); i++) {
            String ar1 = arg1.elementAt(i);
            String ar2 = arg2.elementAt(i);
            if(result.contains(arg1.elementAt(i))) {
                ar1 = "(" + String.valueOf(i) + ")";
            }
            if(result.contains(arg2.elementAt(i))) {
                ar2 = "(" + String.valueOf(i) + ")";
            }
            System.out.println(i + "\t" + op.elementAt(i) + "\t" + ar1 + "\t" + ar2);
        }     }}
