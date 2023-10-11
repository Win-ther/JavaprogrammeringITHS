package se.iths.Uppgifter.OOP.OvningsUppgift;

public class VehicleBuyer extends Person{
    public VehicleBuyer(String name, int age, String job, float money) {
        super(name, age, job, money);
    }
    public void transferCar(Seller seller, Buyer buyer){
        if (seller.getOwnedVehicle() != null && buyer.getOwnedVehicle() == null) {
            transferMoney(seller, buyer);
            this.setMoney(this.getMoney() + (seller.getOwnedVehicle().getPrice() * 0.1f));
            buyer.setOwnedVehicle(seller.getOwnedVehicle());
            seller.setOwnedVehicle(null);
        }
        else if(seller.getOwnedVehicle() == null)
            System.out.println("You have no vehicle");
        else
            System.out.println("You already have a vehicle");
    }
    private void transferMoney(Seller seller, Buyer buyer){
        seller.setMoney(seller.getMoney()+(seller.getOwnedVehicle().getPrice()*0.9f));
        buyer.setMoney(buyer.getMoney()-seller.getOwnedVehicle().getPrice());
    }
}
