/**
 * Project name(项目名称)：作业_方法的使用
 * Package(包名): PACKAGE_NAME
 * Class(类名): t
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/28
 * Time(创建时间)： 22:43
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class t
{
    public static void Print99()
    {
        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j < 10; j++)
            {
                if (i >= j)
                {
                    System.out.print(j + " * " + i + " = " + i * j + "\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Print99();
    }
}
