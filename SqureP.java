public class SqureP
{
    public static void main(String[] args) {
        int n=4;

        for(int row=1 ;row<=n ;row++)
        {
            for(int col= 1;col<=7;col++)
            {
                if(row==1||row==n)
                {
                    System.out.print("* ");
                }
                else
                    {
                    if(col==1 || col==7)
                    {
                        System.out.print("* ");
                    }

                    else
                    {
                        System.out.print("  ");
                    }
                }
                
            }
            System.out.println();
        }
    }
}