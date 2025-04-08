package com.xworkz.hotelapplication.menu;

public class Menu {


        public int menuId;
        public String menuName;
        public String ingredients[];
        public  Menu menus[];

        public void menuDisplay(){
            System.out.println("");
            System.out.println("hotel menu id is "+this.menuId);
            System.out.println("hotel menu is "+this.menuName);
            System.out.println(menuName+" ingredients are "+this.ingredients);
            for(String hotelIngredients:ingredients) {
                System.out.println(menuName+" ingredients are "+hotelIngredients);
            }
        }


}
