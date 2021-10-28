import java.util.Arrays;
import java.util.Scanner;

/**
 * Project name(项目名称)：作业_方法的使用
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/28
 * Time(创建时间)： 22:06
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class test
{
    public static void m1()
    {
        System.out.println("hello teacher!");
    }

    public static double calcAvg()
    {
        double java = 92.5;
        double php = 83.0;
        double avg = (java + php) / 2; // 计算平均值

        // 使用return返回值
        return avg;
    }

    public static int calcAvg(int a, int b)
    {
        /*
         * 功能：计算两门课程考试成绩的平均分并输出平均分
         * 定义一个包含两个参数的方法，用来传入两门课程的成绩
         */
        System.out.println("平均分：" + (a + b) / 2);
        // 使用return返回值
        return (a + b) / 2;
    }

    /*在这里创建getMax方法，以两个整数作为参数，返回两个整数中较大的值*/

    /********** Begin **********/
    public static int getMax(int a, int b)
    {
        if ((a > b))
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    /*
     * 功能：将考试成绩排序并输出，返回成绩的个数
     *
     */

    /********** Begin **********/
    public static int sort(int[] s)
    {
        // 数组从小到大排序处理
        Arrays.sort(s);
        // 打印出数组
        System.out.println(Arrays.toString(s));
        //返回数组中元素的个数
        return s.length;
    }

    /********** Begin **********/
    // 无参print方法的定义
    public static void m2()
    {
        System.out.println("无参的print方法");
    }

    // 字符串print方法的定义
    public static void m2(String s)
    {
        System.out.println("带有一个字符串参数的print方法，参数值为：" + s);
    }


    // 整型print方法的定义
    public static void m2(int s)
    {
        System.out.println("带有一个整型参数的print方法，参数值为：" + s);
    }

    /********** End **********/

    /********** End **********/


    /********** Begin **********/
    /**
     * 第一题：定义一个方法 接收两个整数类型的参数 a和b，返回两个数的和  返回值类型为int 方法名为：getSum
     */
    public static int getSum(int a, int b)
    {
        return a + b;
    }

    /**
     * 第二题： 定义一个方法 接收三个double类型参数a，b，c， 返回这三个数的平均值 返回值类型为double 方法名为：getAvg
     */
    public static double getAvg(double a, double b, double c)
    {
        return (a + b + c) / 3;
    }

    /**
     * 第三题： 定义一个方法 接收两个参数 a 和b 打印a行 b列的一个矩形  不需要返回值   方法名为：printRect
     */
    public static void printRect(int b, int a)
    {
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < a; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 第四题：定以一个方法，接收整形数组 为参数  对这个数组进行升序排序  最后输出该数组 不需要返回值 方法名为 sortArr
     */
    public static void sortArr(int[] a)
    {
        Arrays.sort(a);
        for (int s : a)
        {
            System.out.println(s);
        }
    }

    /**
     * 第五题
     * 你只需要实现for 循环括号的内容就可 ，打印语句系统已经给你完成
     */
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

    /********** End **********/


    public static void main(String[] args)
    {
        //welcome to educoder
        m1();

        {
            /********** Begin **********/

            // 调用calcAvg()方法，并将返回值保存在变量avg中
            double avg = calcAvg();

            /********** End **********/
            System.out.println("平均成绩为：" + avg);
        }
        {
            Scanner sc = new Scanner(System.in);
            int score1 = sc.nextInt(); //第一门成绩
            int score2 = sc.nextInt(); //第二门成绩
            /********** Begin **********/
            // 调用方法，传入两门课程的成绩
            calcAvg(score1, score2);
            /********** End **********/

        }
        {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();   //获取第一个输入的整数
            int j = sc.nextInt();    //获取第二个输入的整数
            /********** Begin **********/
            //在这里调用方法获取返回值

            System.out.println(i + "和" + j + "比较，最大值是：" + getMax(i, j));
            /********** End **********/
        }
        {
            int[] scores = {79, 52, 98, 81};
            /********** Begin **********/
            //调用方法，传入成绩数组，并获取成绩的个数
            int count = sort(scores);
            /********** End **********/
            System.out.println("共有" + count + "个成绩信息！");
        }
        {
            /********** Begin **********/
            // 调用无参的方法
            m2();
            // 调用带有一个字符串参数的方法
            m2("educoder");
            // 调用带有一个整型参数的方法
            m2(666);
            /********** End **********/
        }
        {
            /*
             * 第一题：求和
             *
             * 测试输入：1,2
             *
             * 预期输出：
             * 3
             *
             * 第二题：求平均值
             *
             * 测试输入：1,2,3
             * 预期输出：
             * 2.0
             *
             * 第三题：输出矩形
             *
             * 测试输入：2,3
             *
             * 预期输出：
             * ***
             * ***
             *
             * 第四题：数组升序排序
             *
             * 测试输入：5,7,12,9,32
             *
             * 预期输出：
             * 5
             * 7
             * 9
             * 12
             * 32
             */
            Scanner input = new Scanner(System.in);
            System.out.println(getSum(input.nextInt(), input.nextInt()));
            System.out.println(getAvg(input.nextDouble(), input.nextDouble(), input.nextDouble()));
            printRect(input.nextInt(), input.nextInt());
            int[] a = new int[5];
            for (int s : a)
            {
                s = input.nextInt();
            }
            sortArr(a);
            Print99();
        }
    }
}
