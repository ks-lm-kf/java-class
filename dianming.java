import java.io.*;
import java.util.*;

public class dianming {
    private static final String FILENAME = "students.txt";
    private static List<String> backupList;
    private static List<String> currentList;

    public static void main(String[] args) {
        initializeFromFile();
        startSession();
    }

    private static void initializeFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            backupList = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    backupList.add(line.trim());
                }
            }
            currentList = new ArrayList<>(backupList);
            System.out.println("成功加载 " + backupList.size() + " 个学生");
        } catch (IOException e) {
            System.out.println("错误：找不到淘气鬼名单文件 (" + FILENAME + ")");
            System.exit(1);
        }
    }

    private static void startSession() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n【操作指南】");
        System.out.println("回车：随机点名   R：重置列表  Q：退出");

        while (true) {
            System.out.print("\n输入指令：");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("q")) {
                System.out.println("程序已退出");
                break;
            } else if (input.equals("r")) {
                resetList();
            } else if (input.isEmpty()) {
                callStudent();
            } else {
                System.out.println("无效指令，请重新输入");
            }
        }
        scanner.close();
    }

    private static void callStudent() {
        if (currentList.isEmpty()) {
            System.out.println("所有学生已完成点名！");
            return;
        }

    
        int index = new Random().nextInt(currentList.size());
        String student = currentList.remove(index);
        
        System.out.println("════════════════");
        System.out.println("├─被点幸运儿：" + student);
        System.out.println("├─当前进度：" + (backupList.size() - currentList.size()) + "/" + backupList.size());
        System.out.println("├─剩余幸运儿：" + String.join("、", currentList));
        System.out.println("════════════════");
    }

    private static void resetList() {
        currentList = new ArrayList<>(backupList);
        System.out.println("提示：学生名单已重置");
    }
}
