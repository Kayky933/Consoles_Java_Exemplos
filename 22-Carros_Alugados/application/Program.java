import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalServices;

public class Program {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");
        System.out.println("Enter rental data:");
        System.out.println("Car model:");
        String carModel = scan.nextLine();
        System.out.println("Pickup (dd/MM/yyyy hh:mm):");
        Date start = sdf.parse(scan.nextLine());
        System.out.println("Return (dd/MM/yyyy hh:mm):");
        Date finish = sdf.parse(scan.nextLine());

        CarRental carRental = new CarRental(start, finish, new Vehicle(carModel));
        System.out.println("Enter price per hour:");
        double pricePerHour = scan.nextDouble();
        System.out.println("Enter price per day:");
        double pricePerDay = scan.nextDouble();

        RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxService());
        rentalService.processInvoice(carRental);
        System.out.println("Invoice: ");
        System.out.println("Basic Payment " + String.format("%.2f", carRental.getIvoide().getBasicPayment()));
        System.out.println("Tax " + String.format("%.2f", carRental.getIvoide().getTax()));
        System.out.println("Total Payment " + String.format("%.2f", carRental.getIvoide().totalPayment()));

        scan.close();
    }
}
