package dinner;


import dinner.controller.MenuController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        MenuController menuController = new MenuController();
        menuController.run();
    }
}