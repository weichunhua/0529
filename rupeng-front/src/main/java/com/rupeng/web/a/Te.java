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
 //            if (!dir1.exists()) {     // ���D:/IOTest/dir1�����ڣ��ʹ���ΪĿ¼
 //                dir1.mkdir(); }
 //            System.out.println("���ͣ�");
 //            // ������dir1Ϊ��Ŀ¼,��Ϊ"dir2"��File����
 //            File dir2 = new File(dir1, "dir2");
 //            if (!dir2.exists()) { // ����������ڣ��ʹ���ΪĿ¼
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
 //                        System.out.println("�������߳�...");
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
 //                System.out.println("�������߳�-"+i);
 //            }
 //            System.out.println("���߳�ִ�����!");
 //        }

 //            File file = new File(dir2, "test.txt");
 //            if (!file.exists()) { // ����������ڣ��ʹ���Ϊ�ļ�
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
 //                //System.out.println("��¼ ="+max);
 //            }
 //
 //        }
 //        System.out.println(max_start+"��"+max_end);
 //        System.out.println("����ַ���Ϊ"+s.substring(max_start,max_end));


         System.out.println("�������Ϊ"+(66%99));
         System.out.println("���Լ��Ϊ"+gcd(66,99));
        System.out.println("��һ��add�����ύ");






     }
}
