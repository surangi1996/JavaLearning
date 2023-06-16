package designPatterns;

// Abstract Button interface
interface Button {
    void render();
}

// Concrete Button implementations
class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-styled button");
    }
}

class LinuxButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Linux-styled button");
    }
}

// Dialog class using the Factory Method pattern
class Dialog {
    public Button createButton() {
        String osType = System.getProperty("os.name").toLowerCase();
        if (osType.contains("windows")) {
            return new WindowsButton();
        } else {
            return new LinuxButton();
        }
    }

    public Button createLabel() {
        String osType = System.getProperty("os.name").toLowerCase();
        if (osType.contains("windows")) {
            return new WindowsButton();
        } else {
            return new LinuxButton();
        }
    }

    public void renderWindow() {
        Button button = createButton();
        button.render();
    }
}

// Usage example
public class FactoryMethod {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.renderWindow();
    }
}

