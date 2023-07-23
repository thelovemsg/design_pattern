package com.example.design_pattern.section_09_iterator_visitor.visitor;

public class MenuTestDrive {
    public static void main(String[] args) {
        MenuComponent pancakeHouseMenu = new Menu("pancake house menu", "breakfast menu");
        MenuComponent dinerMenu = new Menu("oop restaurant menu", "dinner menu");
        MenuComponent cafeMenu = new Menu("cafe menu", "dinner menu");
        MenuComponent dessertMenu = new Menu("dessert menu", "enjoy desert menu!");

        MenuComponent allMenus = new Menu("전체 메뉴", "전체 메뉴");

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("파스타",
                                "마리나라 소스 스파게티, 효모빵도 줌",
                                true,
                                    3.88));

        dinerMenu.add(dessertMenu);

        dessertMenu.add(new MenuItem("애플 파이",
                                    "바삭바삭한 크로스트에 바닐라아이스크림이 얹혀있는 애플파이",
                                    true,
                                        1.59));

        Waitress waitress = new Waitress(allMenus);

        waitress.printMenu();
    }
}
