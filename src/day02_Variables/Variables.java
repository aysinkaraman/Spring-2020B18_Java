package day02_Variables;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Variables {
    public static void main(String[] args) {
        /* declare variables :
        DataType variablename = Data
         */
        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);
        // byte num = 2.5; byte, short,int, long they only accept whole number
        //byte num1 = 130; exceeds tha range of byte
        //short num2 = 3.5;
        short num3 = 1000; //1000
                // short num4 = 4000; exceeds the range of short
        System.out.println(num3);
        System.out.println(12345); // by default compiler takes it as int primitive
        int n1 = 20000;
        int n2 = 1000000000;
        System.out.println(n2);
       // long n3 = 99999999999; // out of int' range. compiler by default takes as int
         long n4 = 9999999999l; // forcefully telling the that this is compiler long data number
        System.out.println(n4);
        System.out.println(9999999999999L);
        long n5 = 19;
        // int num = 7L; larger one cannot be assigned to smaller one
        // double> float > long > int > short > byte
        short s1 = 10;
       // byte b1 = s1; // short is larger than byte
        int i1 = s1; // shorter one can assigned to larger one
        // byte b2 =i1; larger one cannot be assigned to smaller one
        double d1 = 3.5;

        // float f1 = 4.5; double primitive is larger than float primitive, cannot assigned

       float f2 = 5.5f;
        System.out.println(f2);







    }
}
