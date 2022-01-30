package srez;

public class Main
{
    public static int sum(int x, int... y)
    {
        int s = 0;
        for(int i=0;i<y.length;++i)
        {
            s+=y[i];
        }
        return s+x;
    }
    public static void main(String args[])
    {
        System.out.println(sum(1, 2, 3, 4, 5));
    }
}