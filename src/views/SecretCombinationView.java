package views;

import controllers.StartController;

class SecretCombinationView {

    private StartController startController;

    SecretCombinationView(StartController startController) {
        this.startController = startController;
    }

    void interact() {
        System.out.print(Message.SECRET);
        for (int i = 0; i < this.startController.getLength(); i++) {
            System.out.print(Message.SECRET_COMBINATION);
        }
        System.out.println();
    }

}
