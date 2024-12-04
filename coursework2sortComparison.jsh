
        char[] suitPriority = {'H', 'C', 'D', 'S'};
// 定义牌值优先级，Ace为1，2通过10，Jack为11，Queen为12，King为13
        int[] cardValue = new int[256]; // ASCII表大小
        for (int i = 0; i < cardValue.length; i++) {
            cardValue[i] = -1; // 初始化为-1以表示无效的牌值
        }
        cardValue['A'] = 1; cardValue['2'] = 2; cardValue['3'] = 3; cardValue['4'] = 4;
        cardValue['5'] = 5; cardValue['6'] = 6; cardValue['7'] = 7; cardValue['8'] = 8;
        cardValue['9'] = 9; cardValue['T'] = 10; cardValue['J'] = 11; cardValue['Q'] = 12;
        cardValue['K'] = 13;

// 比较两张牌的函数
ArrayList<Integer> cardCompare(String card1, String card2) {
    // 提取牌的花色和数值
    char suit1 = card1.charAt(1);
    char suit2 = card2.charAt(1);
    int value1 = cardValue[card1.charAt(0)];
    int value2 = cardValue[card2.charAt(0)];

    // 比较花色
    int suitComparison = Integer.compare(Arrays.binarySearch(suitPriority, suit1), Arrays.binarySearch(suitPriority, suit2));
    ArrayList<Integer> result = new ArrayList<>();
    if (suitComparison != 0) {
        result.add(suitComparison);
    } else {
        // 如果花色相同，比较数值
        result.add(Integer.compare(value1, value2));
    }
    return result;
}
//// 测试用例
        System.out.println(cardCompare("4H", "4H")); // 0
        System.out.println(cardCompare("4H", "3S")); // -1
        System.out.println(cardCompare("4H", "7S")); // -1
        System.out.println(cardCompare("4H", "8C")); // -1
        System.out.println(cardCompare("4H", "2D")); // -1
        System.out.println(cardCompare("4H", "3H")); // 1


            // 冒泡排序
            public ArrayList<String> bubbleSort(ArrayList<String> array) {
                boolean swapped;
                for (int i = 0; i < array.size() - 1; i++) {
                    swapped = false;
                    for (int j = 0; j < array.size() - i - 1; j++) {
                        ArrayList<Integer> compareResult = cardCompare(array.get(j), array.get(j + 1));
                        if (!compareResult.isEmpty() && compareResult.get(0) > 0) {
                            // 交换元素
                            String temp = array.get(j);
                            array.set(j, array.get(j + 1));
                            array.set(j + 1, temp);
                            swapped = true;
                        }
                    }
                    if (!swapped) {
                        break;
                    }
                }
                return array;
            }

            // 归并排序
            ArrayList<String> mergeSort(ArrayList<String> array) {
                if (array.size() < 2) {
                    return array;
                }
                // 分割列表
                int mid = array.size() / 2;
                ArrayList<String> left = new ArrayList<>(array.subList(0, mid));
                ArrayList<String> right = new ArrayList<>(array.subList(mid, array.size()));
                // 递归排序
                left = mergeSort(left);
                right = mergeSort(right);
                // 合并
                return new ArrayList<>(merge(left, right));
            }

            // 合并两个排序好的列表
            ArrayList<String> merge(ArrayList<String> left, ArrayList<String> right) {
                ArrayList<String> result = new ArrayList<>();
                int i = 0, j = 0;
                while (i < left.size() && j < right.size()) {
                    ArrayList<Integer> compareResult = cardCompare(left.get(i), right.get(j));
                    if (!compareResult.isEmpty() && compareResult.get(0) < 0) {
                        result.add(left.get(i++));
                    } else {
                        result.add(right.get(j++));
                    }
                }
                while (i < left.size()) {
                    result.add(left.get(i++));
                }
                while (j < right.size()) {
                    result.add(right.get(j++));
                }
                return result;
            }
        // 测试冒泡排序
        var list = new ArrayList<String>(List.of("4H", "3S", "7S", "8C", "2D", "3H"));
        System.out.println("Bubble Sort:");
        System.out.println(bubbleSort(list)); // 应该输出排序后的列表

        // 测试归并排序
        ArrayList<String> mergeList = new ArrayList<>(list);
            mergeSort(mergeList);
            System.out.println(mergeList);




            long measureBubbleSort(String filename) throws IOException {
                try {
                    checkFile(filename);
                    long startTime = System.currentTimeMillis();
                    ArrayList<String> list = new ArrayList<>(readFile(filename));
                    bubbleSort(list);
                    long endTime = System.currentTimeMillis();
                    return endTime - startTime;
                } catch (Exception e) {
                    System.out.println("冒泡排序出错: " + e.getMessage());
                    e.printStackTrace();
                    throw e;  // 向上传递异常
                }
            }



            // 测试冒泡排序时间测量
            private void checkFile(String filename) {
                File file = new File(filename);
                if (!file.exists()) {
                    throw new IllegalArgumentException("文件不存在: " + filename);
                }
                if (!file.canRead()) {
                    throw new IllegalArgumentException("文件无法读取: " + filename);
                }
            }

            // 读取文件内容
            private ArrayList<String> readFile(String filename) throws IOException {
                ArrayList<String> list = new ArrayList<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        list.add(line.trim());
                    }
                }
                return list;
            }
// 测试冒泡排序时间测量
    System.out.println(measureBubbleSort("E:\\untitled\\src\\sort10.txt"));
    System.out.println(measureBubbleSort("E:\\untitled\\src\\sort100.txt"));
    System.out.println(measureBubbleSort("E:\\untitled\\src\\sort10000.txt"));
            
        
// 测试归并排序时间
        long measureMergeSort(String filename) throws IOException {
            try {
                checkFile(filename);
                long startTime = System.nanoTime();
                ArrayList<String> list = new ArrayList<>(readFile(filename));
                mergeSort(list);
                long endTime = System.nanoTime();
                return (endTime - startTime) / 1000000; // 将纳秒转换为毫秒
            } catch (Exception e) {
                System.out.println("归并排序出错: " + e.getMessage());
                e.printStackTrace();
                throw e;
            }
        }

        // 测试归并排序时间测量
        System.out.println(measureMergeSort("E:\\untitled\\src\\sort10.txt"));
        System.out.println(measureMergeSort("E:\\untitled\\src\\sort100.txt"));
        System.out.println(measureMergeSort("E:\\untitled\\src\\sort10000.txt"));

//sortcomparison
String sortComparison(String[] filenames) throws IOException {
    StringBuilder sb = new StringBuilder();
    
    // 写入表头
    String[] headers = {"", "sort10", "sort100", "sort10000"};  // 直接使用固定的表头
    sb.append(String.join(",", headers)).append("\n");

    // 冒泡排序
    sb.append("bubbleSort");
    for (String filename : filenames) {
        try {
            long time = measureBubbleSort(filename);
            sb.append(", ").append(time);
        } catch (Exception e) {
            System.out.println("处理文件时出错: " + filename);
            e.printStackTrace();
            sb.append(", 错误");
        }
    }
    sb.append("\n");

    // 归并排序
    sb.append("mergeSort");
    for (String filename : filenames) {
        try {
            long time = measureMergeSort(filename);
            sb.append(", ").append(time);
        } catch (Exception e) {
            System.out.println("处理文件时出错: " + filename);
            e.printStackTrace();
            sb.append(", 错误");
        }
    }
    sb.append("\n");

    // 保存结果到CSV文件
    String result = sb.toString();
    try (FileWriter writer = new FileWriter("E:\\untitled\\src\\sortComparison.csv")) {
        writer.write(result);
        System.out.println("结果已保存到 sortComparison.csv");
    } catch (IOException e) {
        System.out.println("保存文件时出错: " + e.getMessage());
        e.printStackTrace();
    }

    return result;  // 返回结果字符串
}

// 测试比较和记录结果
    System.out.println(sortComparison(new String[]{"E:\\untitled\\src\\sort10.txt", "E:\\untitled\\src\\sort100.txt", "E:\\untitled\\src\\sort10000.txt"}));

// 添加文件检查方法，文件是否可读
private static void checkFile(String filename) {
    File file = new File(filename);
    if (!file.exists()) {
        System.out.println("文件不存在: " + file.getAbsolutePath());
        throw new IllegalArgumentException("文件不存在: " + filename);
    }
    if (!file.canRead()) {
        System.out.println("文件无法读取: " + file.getAbsolutePath());
        throw new IllegalArgumentException("文件无法读取: " + filename);
    }
}

// 在文件开头添加常量定义
private static final String BASE_PATH = "E:\\untitled\\src";
private static final String[] FILE_NAMES = {
    "sort10.txt",
    "sort100.txt",
    "sort10000.txt"
};

// 修改测试代码
String[] fullPaths = new String[FILE_NAMES.length];
for (int i = 0; i < FILE_NAMES.length; i++) {
    fullPaths[i] = BASE_PATH + File.separator + FILE_NAMES[i];
}

// 检查所有文件
for (String path : fullPaths) {
    File file = new File(path);
    System.out.println("检查文件: " + file.getAbsolutePath());
    System.out.println("文件是否存在: " + file.exists());
    System.out.println("是否可读: " + file.canRead());
    System.out.println("-------------------");
}

// 执行测试
System.out.println(sortComparison(fullPaths));