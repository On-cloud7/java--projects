public class pizza {
    private int price;
    private Boolean veg;
    private int ExtracheesePrice=100;
    private int ExtraToppingAdded=150;
    private int backpack= 20;
    private int basepizzaprice;
    private boolean isExtracheeseadded = false;
    private boolean isExtratoppingsadded = false;
    private boolean  isOptedfortakeaway = false;

    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg){
            this.price = 300;
        }else{
            this.price=400;
        }
        basepizzaprice =this.price;
    }

    public void addExtracheese(){
        isExtracheeseadded = true;
        this.price+=ExtracheesePrice;
    }
    public void addExtraToppings(){
        isExtratoppingsadded = true;
        this.price+= ExtraToppingAdded;
    }
    public void takeAway(){
        isOptedfortakeaway = true;
        this.price+=backpack;

    }
    public void getBill(){
        String bill= "";
        System.out.println("pizza : "+basepizzaprice);
        if(isExtracheeseadded){
            bill +="Extra cheese added : "+ExtracheesePrice+"\n";
        }
        if(isExtratoppingsadded){
            bill+= "Extra Topping added: "+ ExtraToppingAdded+"\n";
        }
        if (isOptedfortakeaway){
            bill+= "Opted for takeaway"+ backpack +"\n";
        }
        bill+= "Bill"+this.price+ "\n";
        System.out.println(bill);
    }
}