import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        String longMin = "9223372036854775808";
        String longMax = "9223372036854775807";
        String intMin = "2147483648";
        String intMax = "2147483647";
        String typeNames[] = {"byte", "short", "int", "long"};
        boolean flag;

        for (int test = 0; test < testCases; test++) {
            flag = true;
            int dataType[] = new int[4];
            String s = sc.next();
            String value = s;

            if (s.charAt(0) == '-') {
                s = s.replace("-", "");

                if (s.length() > 19) {
                    System.out.println("-" + s + " can\'t be fitted anywhere.");
                    flag = false;
                }

                else if (s.length() == 19) {
                    for (int i = 0; i < s.length(); i++) {

                        if (s.charAt(i) > longMin.charAt(i)) {
                            System.out.println("-" + s + " can\'t be fitted anywhere.");
                            flag = false;
                            break;
                        } else if (s.charAt(i) == longMin.charAt(i)) {
                            if (i==s.length()-1){
                                dataType[3] = 1;
                            }
                            continue;
                        }

                        else {
                            dataType[3] = 1;
                            break;
                        }
                    }
                }
                else if (s.length() > 10) {
                    dataType[3] = 1;
                }
                else if(s.length()==10) {
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) > intMin.charAt(j)) {
                            dataType[3] = 1;
                            break;
                        } else if (s.charAt(j) == intMin.charAt(j)) {
                            if (j==s.length()-1){
                                dataType[2] = 1;
                                dataType[3] = 1;
                            }
                            continue;
                        }

                        else {
                            dataType[2] = 1;
                            dataType[3] = 1;
                            break;
                        }
                    }
                }
                else {
                    if (Integer.parseInt(s) <= 128) {
                        for (int k = 0; k < 4; k++) {
                            dataType[k] = 1;
                        }
                    } else if (Integer.parseInt(s) <= 32768) {
                        for (int k = 1; k < 4; k++) {
                            dataType[k] = 1;
                        }
                    } else if (Long.parseLong(s) <= 2147483648L) {
                        for (int k = 2; k < 4; k++) {
                            dataType[k] = 1;
                        }
                    }
                }
            } else {

                if (s.length() > 19) {
                    System.out.println(s + " can\'t be fitted anywhere.");
                    flag = false;
                } else if (s.length() == 19) {
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) > longMax.charAt(i)) {
                            System.out.println(s + " can\'t be fitted anywhere.");
                            flag = false;
                            break;
                        } else if (s.charAt(i) == longMax.charAt(i)) {
                            if (i==s.length()-1){
                                dataType[3] = 1;
                            }
                            continue;
                        }

                        else {
                            dataType[3] = 1;
                            break;
                        }
                    }
                }
                else if (s.length() > 10) {
                    dataType[3] = 1;
                }
                else if(s.length()==10) {
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) > intMax.charAt(j)) {
                            dataType[3] = 1;
                            break;
                        } else if (s.charAt(j) == intMax.charAt(j)) {
                            if (j==s.length()-1){
                                dataType[2] = 1;
                                dataType[3] = 1;
                            }
                            continue;
                        }

                        else {
                            dataType[2] = 1;
                            dataType[3] = 1;
                            break;
                        }
                    }
                }
                else {
                    if (Integer.parseInt(s) <= 127) {
                        for (int k = 0; k < 4; k++) {
                            dataType[k] = 1;
                        }
                    } else if (Integer.parseInt(s) <= 32767) {
                        for (int k = 1; k < 4; k++) {
                            dataType[k] = 1;
                        }
                    } else if (Long.parseLong(s) <= 2147483647L) {
                        for (int k = 2; k < 4; k++) {
                            dataType[k] = 1;
                        }
                    }
                }
            }

            if(flag==true) {
                System.out.println(value+" can be fitted in:");
                for(int i=0; i<dataType.length; i++) {
                    if(dataType[i]==1) {
                        System.out.println("* " + typeNames[i]);
                    }
                }
            }
        }
    }
}
