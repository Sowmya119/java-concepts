class Arrays_2
{
    public static void main(String a[])
    {
        int nums[][] = new int[3][];        //jagged array where the number of elements in each internal array is different
        
        nums[0] = new int[3];
        nums[1] = new int[5];
        nums[2] = new int[9];

        for(int i=0; i<nums.length; i++)
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int) (Math.random() * 100); 
                System.out.print(nums[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();

        for(int n[] : nums)
        {
            for(int m : n)
            {
                System.out.print(m + "  ");
            }
            System.out.println();
        }
        System.out.println();

        int num3[][][] = new int[5][4][3];
        
        for(int i=0; i<num3.length; i++)
        {
            for(int j=0; j < num3[i].length; j++)
            {
                for(int k=0; k < num3[i][j].length; k++)
                {
                    num3[i][j][k] = (int) (Math.random() * 100); 
                    System.out.print(num3[i][j][k] + "  ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}