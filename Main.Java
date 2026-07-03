import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Task>taskList = new ArrayList<>();

        while(true){
            
            System.out.println("=== Todoリスト ===");
            System.out.println("1.タスク追加");
            System.out.println("2.タスク一覧");
            System.out.println("3.タスク消去");
            System.out.println("4.終了");
            System.out.print("選択してください");

            int menu = scanner.nextInt();

            if (menu == 1){
                scanner.nextLine();
                System.out.print("タスク名を入力してください:");
                String taskName = scanner.nextLine();
                Task task = new Task(taskName);
                taskList.add(task);
                System.out.println("追加しました!");
            }

            if (menu == 2){
                System.out.println("===タスク一覧===");
                for (int i = 0;i < taskList.size();i++){
                    System.out.println((i+1)+"."+taskList.get(i).getTaskName());
                }
            }

            if (menu == 3){

                if(taskList.isEmpty()){
                    System.out.println("削除するタスクがありません。");
                }else{
                    System.out.println("===タスク一覧===");

                    for(int i = 0;i < taskList.size();i++){
                        System.out.println((i + 1)+"."+taskList.get(i).getTaskName());
                    }

                    System.out.print("削除する番号を入力してください:");
                    int number = scanner.nextInt();

                    if(number >= 1 && number <= taskList.size()){
                        taskList.remove(number - 1);
                        System.out.println("削除しました!");
                    }else{
                        System.out.println("その番号は存在しません。");
                    }
                }
            }

            if (menu == 4) {
                System.out.println("終了します。");
                break;
            }
        }
        scanner.close();
    }
}