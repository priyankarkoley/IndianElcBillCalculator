import java.util.Scanner;
class BILL_CALCULATOR
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the unit to calculate :");
        float n=sc.nextFloat();
        double i=0;
        double re=0;
        double tot=0;
        
        if (n<102){tot=n*5.30;}
        else if(n<180){tot=(n-102)*5.97+102*5.30;}
        else if(n<300){tot=(n-180)*6.97+78*5.97+102*5.30;}
        else if(n<600){tot=(n-300)*7.31+120*6.97+78*5.97+102*5.30;}
        else if(n<900){tot=(n-600)*7.58+300*7.31+120*6.97+78*5.97+102*5.30;}
        else {tot=(n-900)*8.99+300*7.58+300*7.31+120*6.97+78*5.97+102*5.30;}
        
        System.out.println("\nEnergy Charge:\n" + tot);
        System.out.println("\nGRAND TOTAL\n ("+tot+"+158+228+30+746)");
        System.out.println("=("+tot+"+"+(158.40+228.62+30+746.63));
        System.out.println("="+(tot+158.40+228.62+30+746.63));
                
        re=(tot+158.40+228.62+30+746.63);
        double all=(re*0.99)-99;
        
        System.out.println("After Rebate:"+all);
        System.out.println("\nPer Month: "+(all/3));
        System.out.println("Units used per day: "+(n/90));
        System.out.println("Expenses Per Day: "+(all/90));
    }
}