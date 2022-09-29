class calculator1
{

    public static void main(String args[])
    {
        store calci =new store();
     
        System.out.println(calci.c);

    }
}
class store
{int length=5;int birth=10;
    int add(int length,int birth)
{
    int c=length*birth;
    return c;

}
}