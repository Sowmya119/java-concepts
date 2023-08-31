class Students
{
    String name;
    int grade;
    int marks;
}

class Students_array
{
    public static void main(String args[])
    {
        Students s1 = new Students();
        s1.name = "Kousi";
        s1.grade = 6;
        s1.marks = 500;

        Students s2 = new Students();
        s2.name = "Sriram";
        s2.grade = 7;
        s2.marks = 300;

        Students s3 = new Students();
        s3.name = "Pavi";
        s3.grade = 8;
        s3.marks = 200;

        Students stud[] = new Students[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;
        
        for(int i = 0; i<stud.length; i++)
        {
            System.out.println(stud[i].name + " : " + stud[i].marks);
        }

        for(Students n : stud)
        {
            System.out.println(n.name + " : " + n.marks);
        }
    }
}