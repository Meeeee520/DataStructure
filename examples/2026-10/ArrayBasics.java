public class ArrayBasics {
    public static void main(String[] args) {
        int[] scores = {80, 90, 100};
        scores[1] = 95;
        System.out.println("长度：" + scores.length);
        System.out.println("第一项：" + scores[0]);
        System.out.println("第二项：" + scores[1]);
        System.out.println("末项：" + scores[scores.length - 1]);
        int[] empty = new int[0];
        System.out.println("空数组长度：" + empty.length);
    }
}
