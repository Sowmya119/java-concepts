/*class Arrays_1
{
    public static void main(String a[])
    {
        int nums[] = {2, 3, 4};
        System.out.println(nums[0]);
    }
}

class Arrays_1
{
    public static void main(String a[])
    {
        int nums[] = new int[5];
        nums[0] = 5;
        nums[1] = 2;
        nums[2] = 6;
        nums[3] = 7;
        nums[4] = 9;
        for(int i=0; i<5; i++)
        {
            System.out.println(nums[i]);
        }
    }
}

class Arrays_1
{
    public static void main(String a[])
    {
        int nums[][] = new int[3][4];
        nums[0][0] = 5;
        nums[1][1] = 2;
        nums[2][2] = 6;
        nums[0][3] = 7;
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }
    }
} */

class Arrays_1
{
    public static void main(String a[])
    {
        int nums[][] = new int[3][4];

        for(int i=0; i<3; i++)
        {
            for(int j=0; j<4; j++)
            {
                nums[i][j] = (int) (Math.random() * 100);       //Inbuilt random() function from Math class gives double values less than 1
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[] : nums)     //Enhanced for loop
        {
            for(int m : n)
            {
                System.out.print(m + "  ");
            }
            System.out.println();
        }
        int num1[] = new int[10];
        
        for(int i=1; i<10; i++)
        {
            num1[i] = (int) (Math.random() * 100);
            System.out.print(num1[i] + "  ");
        }
    }
}