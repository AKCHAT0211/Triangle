import java.util.Scanner;
class triangle {
    public static void main(String[] args) {
        int i,k,j=1;
        System.out.println(" ");
        System.out.println(":-) Welcome To Pattern World :-)");
        Scanner sc = new Scanner (System.in);

            System.out.println(" ");
            System.out.println("Choose any  patter which you want to draw\n1 :-Right Triangle Star Pattern\n" + "2 :- Right Triangle Star Pattern(Downward)\n" +"3:-Right Pascal's Triangle\n"+
                  "4:-Reverse Right Pascal's Triangle\n"+"5:-Mirrored Right Triangle\n"+"6:-Pyramid Star Pattern\n"+"7:-Diamond Shape Pattern\n"+"8:-Pyramid Star Pattern\n"+
                    "9:- Reverse Pyramid Star Pattern\n"+"10:-Sandglass Star Pattern\n"+"11:-Hollow Triangle Star Pattern\n"+"12:-Hollow Reverse Triangle Star Pattern\n"+"13:-"+"ENTER 'S' KEY TO STOP");
        while(true)
        {
            System.out.print("Enter your choice:");
        int ch=sc.nextInt();
        System.out.print("Enter the no of lines:");
        int l=sc.nextInt();

        switch(ch) {
            case 1:
                for(i=1; i<=l; i++) {
                    for(j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 2:
                for(i=l; i>=1; i--) {
                    for(j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 3:
                for(i=1; i<=l; i++) {
                    for(j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                for(i=l; i>=1; i--) {
                    for(j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 4:
                for(i=l; i>=1; i--) {
                    for(j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                for(i=2; i<=l; i++) {
                    for(j=1; j<=i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println(" ");
                }
                break;
            case 5:
                for (i=0; i<l; i++) {
                    for (j = 2 * (l - i); j >= 0; j--) {
                        System.out.print(" ");
                    }
                    for (j = 0; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();}
                break;
            case 6:
                for (i=0; i<l; i++)
                {
                    for (j=l-i; j>1; j--)
                    {
                        System.out.print(" ");
                    }
                    for (j=0; j<=i; j++ )
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                } break;
            case 7:
                int space = 1;
                space = l - 1;
                for (j = 1; j<= l; j++)
                {
                    for (i = 1; i<= space; i++)
                    {
                        System.out.print(" ");
                    }
                    space--;
                    for (i = 1; i <= 2 * j - 1; i++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
                space = 1;
                for (j = 1; j<=l- 1; j++)
                {
                    for (i = 1; i<= space; i++)
                    {
                        System.out.print(" ");
                    }
                    space++;
                    for (i = 1; i<= 2 * (l - j) - 1; i++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("");}
                    break;
            case 8:
                    for (i=0; i<l; i++)
                 {
                    for (j=l-i; j>1; j--)
                    {
                        System.out.print(" ");
                    }
                    for (j=0; j<=i; j++ )
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
                case 9:
                for (i= 0; i<= l-1; i++)
                {
                    for (j=0; j<=i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (k=0; k<=l-1-i; k++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 10:

                for (i= 0; i<= l-1 ; i++)
                {
                    for (j=0; j<i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (k=i; k<=l-1; k++)
                    {
                        System.out.print("* " );
                    }
                    System.out.println("");
                }
                for (i= l-1; i>= 0; i--)
                {
                    for (j=0; j<i; j++)
                    {
                        System.out.print(" ");
                    }
                    for (k=i; k<=l-1; k++)
                    {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }break;
            case 11:
                for (i=1; i<= l; i++)
                {
                    for (j = i; j < l ; j++)
                    {
                        System.out.print(" ");
                    }
                    for (k = 1; k <= (2*i -1) ;k++)
                    {
                        if(k==1 || i == l || k==(2*i-1))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println(" ");
                }break;
            case 12:
                for (i=l; i>= 1 ; i--)
                {
                    for (j=i; j<l ; j++)
                    {
                        System.out.print(" ");
                    }
                    for (k = 1; k <= (2*i -1) ;k++)
                    {
                        if( k==1 || i == l || k==(2*i-1))
                        {
                            System.out.print("*");
                        }
                        else
                        {
                            System.out.print(" ");
                        }
                    }
                    System.out.println("");
                }
                break;
            case 13:
                int rows =l;
                for (i=1; i<= rows ; i++)
                {
                    for ( j = rows; j > i ; j--)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (k = 1; k < 2*(i -1) ;k++)
                    {
                        System.out.print(" ");
                    }
                    if( i==1)
                    {
                        System.out.println(" ");
                    }
                    else
                    {
                        System.out.println("*");
                    }
                }
                for (i=rows-1; i>= 1 ; i--)
                {
                    for (j = rows; j > i ; j--)
                    {
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    for (k = 1; k < 2*(i -1) ;k++)
                    {
                        System.out.print(" ");
                    }
                    if(i==1) {
                        System.out.println("");
                    }
                    else
                        System.out.println("* ");
                }break;
            default:
                System.out.print("WRONG INPUT TRY AGAIN");


        }
        }
        }
    }

