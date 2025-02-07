import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    // Underline
    public static final String BLACK_UNDERLINED = "\033[4;30m";  // BLACK
    public static final String RED_UNDERLINED = "\033[4;31m";    // RED
    public static final String GREEN_UNDERLINED = "\033[4;32m";  // GREEN
    public static final String YELLOW_UNDERLINED = "\033[4;33m"; // YELLOW
    public static final String BLUE_UNDERLINED = "\033[4;34m";   // BLUE
    public static final String PURPLE_UNDERLINED = "\033[4;35m"; // PURPLE
    public static final String CYAN_UNDERLINED = "\033[4;36m";   // CYAN
    public static final String WHITE_UNDERLINED = "\033[4;37m";  // WHITE

    // Background
    public static final String BLACK_BACKGROUND = "\033[40m";  // BLACK
    public static final String RED_BACKGROUND = "\033[41m";    // RED
    public static final String GREEN_BACKGROUND = "\033[42m";  // GREEN
    public static final String YELLOW_BACKGROUND = "\033[43m"; // YELLOW
    public static final String BLUE_BACKGROUND = "\033[44m";   // BLUE
    public static final String PURPLE_BACKGROUND = "\033[45m"; // PURPLE
    public static final String CYAN_BACKGROUND = "\033[46m";   // CYAN
    public static final String WHITE_BACKGROUND = "\033[47m";  // WHITE

    // High Intensity
    public static final String BLACK_BRIGHT = "\033[0;90m";  // BLACK
    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String YELLOW_BRIGHT = "\033[0;93m"; // YELLOW
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN_BRIGHT = "\033[0;96m";   // CYAN
    public static final String WHITE_BRIGHT = "\033[0;97m";  // WHITE

    // Bold High Intensity
    public static final String BLACK_BOLD_BRIGHT = "\033[1;90m"; // BLACK
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";   // RED
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m"; // GREEN
    public static final String YELLOW_BOLD_BRIGHT = "\033[1;93m";// YELLOW
    public static final String BLUE_BOLD_BRIGHT = "\033[1;94m";  // BLUE
    public static final String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE
    public static final String CYAN_BOLD_BRIGHT = "\033[1;96m";  // CYAN
    public static final String WHITE_BOLD_BRIGHT = "\033[1;97m"; // WHITE

    // High Intensity backgrounds
    public static final String BLACK_BACKGROUND_BRIGHT = "\033[0;100m";// BLACK
    public static final String RED_BACKGROUND_BRIGHT = "\033[0;101m";// RED
    public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
    public static final String YELLOW_BACKGROUND_BRIGHT = "\033[0;103m";// YELLOW
    public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
    public static final String PURPLE_BACKGROUND_BRIGHT = "\033[0;105m"; // PURPLE
    public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
    public static final String WHITE_BACKGROUND_BRIGHT = "\033[0;107m";   // WHITE
    public static void main(String[] args) {
        //  hàm main  là hàm chính để bắt đầu chuowng trình java
        // biến và kểu dữ liệu
        int a = 10; // %d
        double d = 3.14; // %f
        char c = 'A';  // %c
        boolean check = true;
        short s = 100; // %d
        byte b = 15; // %d
        // lưu ý kiểu float và long
        float f = 9.5f; // %f
        long l = 10000000000L; // %d / %ld
        // Chuoi
        String name = "Hung hx"; //%s
        // in ra màn hình cac giá trị
        System.out.println(a); // tương tự console.log (line new)
        System.out.println(d);
        System.out.println(c);
        System.out.println(name);

        // toán tử:
        // toán sô hoc : +,- , * ,/,%
        int sum = a + s;
        System.out.println(sum);
        // toán tư hang : ++, -- (tiền tô và hậu tố)
        int reg = ++a + a-- ; // a = 10
        System.out.println(reg); // 21 , 22, 23
        // toán tử so sánh : >, <, >=, <=, ==,!=
        // toán tử logic : || , && , !

        // các hàm toán học thuộc lớp Math
        double pow = Math.pow(2,4);
        System.out.println(pow);
        System.out.println("gia tri cua a = "+a);

        // các thao tác nhập xuất
        // thao tác nhập dữ liệu qua màn hình console
        Scanner scanner = new Scanner(System.in); // khởi tạo máy nhập
        Scanner sc = new Scanner(System.in);
        // lăng nghe người dùng nhập vào
//        System.out.println("Nhập số");
//        check = Boolean.parseBoolean(scanner.nextLine()); // kí tự cuôi cung nhập vào \n (enter)
//        System.out.println("Nhập chuỗi");
//        scanner.nextLine(); // loại bỏ xuong dòng
//        name = scanner.nextLine(); // hiện tượng nuốt dòng nhập
//        System.out.println("gia tri cua name = "+name);

        // chú ý khi nhập dữ liệu (nuốt dòng)
        // có 3 cách xử lý
        // C1 : khởi tạo các Scanner khác nhau
        // C2 : dùng ép kiểu dữ liệu
        // C3 : dung thêm 1 hàm nextline để loại bỏ kí tự xuốnh dòng

        // đóng máy naap
        scanner.close(); // đóng máy nhập

        // Xuât dữ liệu : System.out
//        System.out.print("Helloo world");
//        System.out.print("rikkei"); // in ra 2 dòng chữ
         System.out.printf("\t\tGia tri cua 💲💲💲✔✔💱💱🔱🔱🔱💘💘💘💨💨💨 bien name = %-10s 123456\n", name) ; // in định dạng
         System.out.printf("Gia tri cua bien a =%10d , d = %.2f , c = %20c\n",a,d,c);

        System.out.println("\u001B[33mChữ màu vàng");
        System.out.println("\u001B[31mChữ màu đỏ");
        System.out.println("\u001B[32mChữ màu xanh lục");
        System.out.println("\u001B[35mChữ màu tím");
        System.out.println(CYAN_BACKGROUND_BRIGHT+"Chữ màu nền màu trắng");
    }
}