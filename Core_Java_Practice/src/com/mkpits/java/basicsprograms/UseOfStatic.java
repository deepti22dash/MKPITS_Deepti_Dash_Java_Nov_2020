package com.mkpits.java.basicsprograms;

 class StudentUse {
    int rollno;
    String name;
    static String college = "IIT";
    static void change(){
        college = "SAMBALPURUNIVERSITY";
    }
    StudentUse(int r, String n){
        rollno = r;
        name = n;
    }
    void display(){System.out.println(rollno+" "+name+" "+college);}
}
    class TestStaticMethod{
        public static void main(String args[]){
            StudentUse.change();

            StudentUse s1 = new StudentUse(101,"ARNAB");
            StudentUse s2 = new StudentUse(102,"GOURAV");
            StudentUse s3 = new StudentUse(103,"AARAV");
            s1.display();
            s2.display();
            s3.display();
        }
    }


