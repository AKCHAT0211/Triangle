
import java.util.Scanner;
class triangle {
    public static void main(String[] args) {
        int i,j=0;
        Scanner sc = new Scanner (System.in);
       System.out.print("Enter ur name:");
        String n= sc.nextLine();
        System.out.print("ur age is :");
       int age=sc.nextInt();
         System.out.println("choose 1 for ascendiong order triangle  2 for decending triangle 3 for upside-down triangle 4 for downside-up triangle");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                System.out.print("Enter the no of lines:");
               int l=sc.nextInt();
              for(i=0;i<=l;i++){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println(" ");
        } break;
        case 2:
             System.out.print("Enter the no of lines:");
               int r=sc.nextInt();
              for(i=r;i>=0;i--){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println(" ");}
                        break;
            case 3:
             System.out.print("Enter the no of lines:");
               int k=sc.nextInt();
              for(i=0;i<=k;i++){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println(" ");}
                          for(i=k;i>=0;i--){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println(" "); }
                        break;
                        case 4:
                             System.out.print("Enter the no of lines:");
               int s=sc.nextInt();
              for(i=0;i<=s;i++){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println(" ");}
                              for(i=s;i>=0;i--){
                    for(j=0;j<=i;j++){
                        System.out.print("*");
                        }
                        System.out.println(" "); 
                              }break;
    default:System.out.print("wrong output");
}
    }

}
