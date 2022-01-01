class Copyarray
{
    public static void main(String args[])
    {
        int i;
        int a1[]=new int[]{2,5,7,8,6,76,45};
        int a2[]=new int[a1.length];

        for(i=0;i<a1.length;i++)
        {
            a2[i]=a1[i];
        }

        System.out.println("Elements of Original Array :- ");
        for(i=0;i<a1.length;i++)
        {
            System.out.print(a1[i]+ " ");
        }
        System.out.println();
        System.out.println("Elements of New Array :- ");
        for(i=0;i<a2.length;i++)
        {
            System.out.print(a2[i]+ " ");
        }

    }
}