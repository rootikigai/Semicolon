public class TestDrillerCBT{
  public static int getCBTPrice(int copies){
    int price = 0;
    if(copies >= 1 && copies <= 4){
      price = copies * 2000;
      return price;
    }
    else if(copies >= 5 && copies <= 9){
      price = copies * 1800;
      return price;
    }
    else if(copies >= 10 && copies <= 29){
      price = copies * 1600;
      return price;
    }
    else if(copies >= 30 && copies <= 49){
      price = copies * 1500;
      return price;
    }
    else if(copies >= 50 && copies <= 99){
      price = copies * 1300;
      return price;
    }
    else if(copies >= 100 && copies <= 199){
      price = copies * 1200;
      return price;
    }
    else if(copies >= 200 && copies <= 499){
      price = copies * 1100;
      return price;
    }
    else if(copies >= 500){
      price = copies * 1000;
      return price;
    }
    else{
      return 0;
    }
	}
}
