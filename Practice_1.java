/**
  *任务：
  *1.创建dev_1分支，在此分支上Practice_1.java文件中的编写以下程序，完成后提交，commit信息为"Finish Practice_1"
  * https://www.nowcoder.com/practice/c245af6cfdce49ceb5435f649ee14f89?tpId=90&tqId=30946&tPage=2&rp=2&ru=/ta/2018test&qru=/ta/2018test/question-ranking
  *2.完成后合入master分支；
  *3.将master分支推动到远程仓。
  *验收标准：
  *1.看远程仓的master分支下有没有对应的commit信息。
  *
  */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int k=Integer.parseInt(scanner.nextLine());
        System.out.println(cal(k));
        
    }
    public static int cal(int k){
        if(k==1) return 1;
        else if(k==2) return 1;
        else
            return cal(k-1)+cal(k-2);
    }
}