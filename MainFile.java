package  ATM;

import java.util.Scanner;

public class MainFile {
    public static void main(String[] args) {
        AtmOperationInterface op=new AtmOperation();
        int atmnumber=56789;
        int atmpin=123;
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the XYZ Bank ATM Machine !!!");
        System.out.print("Enter User Id : ");
        int atmNumber=in.nextInt();
        System.out.print("Enter User Pin: ");
        int pin=in.nextInt();
        if((atmnumber==atmNumber)&&(atmpin==pin)){
            while(true){
                System.out.println("1.View Available Balance\n 2.Withdraw Amount\n 3.Deposit Amount\n 4.View Ministatement\n 5.Exit");
                System.out.println("Enter Your Choice : ");
                int ch=in.nextInt();
                if(ch==1){
                    op.viewBalance();

                }
                else if(ch==2){
                    System.out.println("Enter amount to withdraw ");
                    double withdrawAmount=in.nextDouble();
                    op.withdrawAmount(withdrawAmount);

                }
                else if(ch==3){
                    System.out.println("Enter Amount to Deposit :");
                    double depositAmount=in.nextDouble();
                    op.depositAmount(depositAmount);


                }
                else if(ch==4){
                    op.viewMiniStatement();

                }
                else if(ch==5){
                    System.out.println("Collect your ATM Card\n Thank you for using XYZ ATM Machine!!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("Please enter correct choice");
                }
            }
        }
        else{
            System.out.println("Incorrect User Name and Password");
            System.exit(0);
        }


    }
}
