package abstractclss;   
class Honda4 extends Bike{
    void run(){
        System.out.print("Chay xe can than ");
    }
    public static void main(String args[]){
        Bike ojb = new Honda4();
        ojb.run();
    }
}