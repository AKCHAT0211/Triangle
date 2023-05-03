import java.util.Scanner;
class triangle {
    public static void main(String[] args) {
        int i,j=0;
        Scanner sc = new Scanner (System.in);
        System.out.println(":-) Welcome To Pattern World :-)");
        System.out.println(" ");
        System.out.println("Choose 1 :- for ascendiong order triangle  2 :- for decending triangle");
        System.out.println(" 3 :- for upside-down triangle 4 :- for downside-up triangle");
        System.out.print("Enter your choice:");
        int ch=sc.nextInt();
        switch(ch) {
        case 1:
            System.out.print("Enter the no of lines:");
            int l=sc.nextInt();
            for(i=1; i<=l; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            break;
        case 2:
            System.out.print("Enter the no of lines:");
            int r=sc.nextInt();
            for(i=r; i>=1; i--) {
                for(j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            break;
        case 3:
            System.out.print("Enter the no of lines:");
            int k=sc.nextInt();
            for(i=1; i<=k; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for(i=k; i>=1; i--) {
                for(j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            break;
        case 4:
            System.out.print("Enter the no of lines:");
            int s=sc.nextInt();
            for(i=s; i>=1; i--) {
                for(j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for(i=2; i<=s; i++) {
                for(j=1; j<=i; j++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            break;
        default:
            System.out.print("wrong output");
        }
    }

}
