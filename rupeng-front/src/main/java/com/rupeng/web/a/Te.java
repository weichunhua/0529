package com.rupeng.web.a;

/**
 * @author shkstart
 * @create 2021-05-26 15:03
 */
public class Te {
    private static long gcd(int a,int b) {
        if(a%b==0)
        return b ;

            return gcd(b,a%b);
     }

    public static void main(String[] args) {
 //            File dir1 = new File("F:/IOTest/dir1");
 //            if (!dir1.exists()) {     // 如果D:/IOTest/dir1不存在，就创建为目录
 //                dir1.mkdir(); }
 //            System.out.println("加油！");
 //            // 创建以dir1为父目录,名为"dir2"的File对象
 //            File dir2 = new File(dir1, "dir2");
 //            if (!dir2.exists()) { // 如果还不存在，就创建为目录
 //                dir2.mkdirs(); }
 //            File dir4 = new File(dir1, "dir3/dir4");
 //
 //                dir4.mkdirs();

 //            Thread thread = new Thread() {
 //                @Override
 //                public void run() {
 //                    while (true) {
 //                        try {
 //                            Thread.sleep(40);
 //                        } catch (Exception e) {
 //                            // TODO: handle exception
 //                        }
 //                        System.out.println("我是子线程...");
 //                    }
 //                }
 //            };
 //            thread.setDaemon(true);
 //            thread.start();
 //            for (int i = 0; i < 3; i++) {
 //                try {
 //                    Thread.sleep(100);
 //                } catch (Exception e) {
 //
 //                }
 //                System.out.println("我是主线程-"+i);
 //            }
 //            System.out.println("主线程执行完毕!");
 //        }

 //            File file = new File(dir2, "test.txt");
 //            if (!file.exists()) { // 如果还不存在，就创建为文件
 //                Boolean bl = file.createNewFile();
 //                System.out.println(b1);

 //        String s ="abbccddde2w3dcqeee";
 //        int count = 1;
 //        int max_start = 0;
 //        int max_end = 1;
 //        int a = 0;
 //        int b = 0;
 //
 //        t:  for(int i=0;i<s.length()-1;i++){
 //           if(s.charAt(i) != s.charAt(i+1)) {
 //                b = i + 1;
 //                //count = max_end-max_start;
 //            }
 //                else {
 //                    a = i + 1;
 //                }
 //                if ((b - a) > count) {
 //                count = b - a;
 //                max_start = a ;
 //                max_end = b +1;
 //              //  break t;
 //                //System.out.println("记录 ="+max);
 //            }
 //
 //        }
 //        System.out.println(max_start+"到"+max_end);
 //        System.out.println("最大字符串为"+s.substring(max_start,max_end));


         System.out.println("最大余数为"+(66%99));
         System.out.println("最大公约数为"+gcd(66,99));
        System.out.println("第一次add并且提交");






     }
}
