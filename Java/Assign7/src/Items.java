package shopping;

class Item {
    private int id;
    private double cost;
    private int qty;

    public Items(int id, double cost, int qty) {
        this.id = id;
        this.cost = cost;
        this.qty = qty ;
    }

    public final int getID() { return id;}
    
    public final double getCost() { return cost;}
    
    public final int getQty() { return qty;}
    
    public final int setQty(int value) {  qty = value;}

    

}