import java.util.*;
public class Currencyconverter {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("***Welcome to currency calculator***");

        System.out.println("Select your currency form INR , USD , pounds , Euro , AUD");
        String currency=sc.nextLine().toUpperCase();
        System.out.print("Enter your Currency in " + currency + " only :");
        double amount=sc.nextDouble();
        System.out.println("Enter the currency that you wnat to convert into  USD , INR , pounds ,Euro , AUD: ");
        String currency_convert=sc.next().toUpperCase();
        double Finalamount=0;

        if(currency.equals(currency_convert)){
            System.out.println("Cant be converted..!");
        }else{

            switch(currency){
            case "INR":
            if(currency_convert.equals("USD")){
                double mul_usd=0.01139;
                Finalamount = Math.round(mul_usd*amount* 100.0) / 100.0;
            }
            else if(currency_convert.equals("POUNDS")){
                double mul_pounds=0.00856;
                Finalamount =  Math.round(mul_pounds*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("EURO")){
                double mul_Euro=0.0098;
                Finalamount =  Math.round(mul_Euro*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("AUD")){
                double mul_aud=0.018;
                Finalamount =  Math.round(mul_aud*amount* 100.0) / 100.0;
            }
            
            break;

            case "USD":
            if(currency_convert.equals("INR")){
                double mul_inr=87.81;
                Finalamount = Math.round(mul_inr*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("POUNDS")){
                double mul_Pounds=0.75;
                Finalamount =  Math.round(mul_Pounds*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("EURO")){
                double mul_Euro=0.86;
                Finalamount =  Math.round(mul_Euro*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("AUD")){
                double mul_aud=1.55;
                Finalamount =  Math.round(mul_aud*amount* 100.0) / 100.0;
            }
            
            break;

            case "POUNDS":
            double mul_pounds=0.00856;
            Finalamount =  Math.round(mul_pounds*amount* 100.0) / 100.0;

            if(currency_convert.equals("INR")){
                double mul_Inr=116.90;
                Finalamount = Math.round(mul_Inr*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("USD")){
                double mul_usd=1.33;
                Finalamount =  Math.round(mul_usd*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("EURO")){
                double mul_Euro=1.15;
                Finalamount =  Math.round(mul_Euro*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("AUD")){
                double mul_aud=2.06;
                Finalamount =  Math.round(mul_aud*amount* 100.0) / 100.0;
            }
            
            break;

            case "EURO":
            if(currency_convert.equals("INR")){
                double mul_Inr=101.69;
                Finalamount = Math.round(mul_Inr*amount* 100.0) / 100.0;
            }
            else if(currency_convert.equals("USD")){
                double mul_usd=1.16;
                Finalamount =  Math.round(mul_usd*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("POUNDS")){
                double mul_Pounds=0.87;
                Finalamount =  Math.round(mul_Pounds*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("AUD")){
                double mul_aud=1.79;
                Finalamount =  Math.round(mul_aud*amount* 100.0) / 100.0;
            }
            
            break;


            case "AUD":
            if(currency_convert.equals("INR")){
                double mul_inr=56.79;
                Finalamount = Math.round(mul_inr*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("USD")){
                double mul_usd=0.65;
                Finalamount =  Math.round(mul_usd*amount* 100.0) / 100.0;
            }
            else if(currency_convert.equals("POUNDS")){
                double mul_Pounds=0.49;
                Finalamount =  Math.round(mul_Pounds*amount* 100.0) / 100.0;
            }else if(currency_convert.equals("EURO")){
                double mul_Euro=0.56;
                Finalamount =  Math.round(mul_Euro*amount* 100.0) / 100.0;
            }
            
            break;
            
            }

            System.out.println("Final amount in your currency is "+Finalamount +" "+currency_convert);
        
        }

        

        




        
    }
}
