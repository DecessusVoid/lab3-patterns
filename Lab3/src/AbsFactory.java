
interface Button {
    void paint();
}


class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a Windows button.");
    }
}


class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created a Mac button.");
    }
}


interface Checkbox {
    void paint();
}


class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created a Windows checkbox.");
    }
}


class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("You have created a Mac checkbox.");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}


class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}


class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}


class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}

public class AbsFactory {
    public static void main(String[] args) {
        Application app1 = new Application(new WindowsFactory());
        app1.paint();

        Application app2 = new Application(new MacFactory());
        app2.paint();
    }
}