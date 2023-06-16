package designPatterns;

// Abstract UI Element interface
interface UIElement {
    void render();
}

// Concrete UI Element implementations
class WindowsButtons implements UIElement {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-styled button");
    }
}

class LinuxButtons implements UIElement {
    @Override
    public void render() {
        System.out.println("Rendering a Linux-styled button");
    }
}

class WindowsLabel implements UIElement {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-styled label");
    }
}

class LinuxLabel implements UIElement {
    @Override
    public void render() {
        System.out.println("Rendering a Linux-styled label");
    }
}

class WindowsTextBox implements UIElement {
    @Override
    public void render() {
        System.out.println("Rendering a Windows-styled text box");
    }
}

class LinuxTextBox implements UIElement {
    @Override
    public void render() {
        System.out.println("Rendering a Linux-styled text box");
    }
}

// Abstract UI Element Factory
interface UIElementFactory {
    UIElement createButton();
    UIElement createLabel();
    UIElement createTextBox();
}

// Concrete UI Element Factory implementations
class WindowsUIElementFactory implements UIElementFactory {
    @Override
    public UIElement createButton() {
        return new WindowsButtons();
    }

    @Override
    public UIElement createLabel() {
        return new WindowsLabel();
    }

    @Override
    public UIElement createTextBox() {
        return new WindowsTextBox();
    }
}

class LinuxUIElementFactory implements UIElementFactory {
    @Override
    public UIElement createButton() {
        return new LinuxButtons();
    }

    @Override
    public UIElement createLabel() {
        return new LinuxLabel();
    }

    @Override
    public UIElement createTextBox() {
        return new LinuxTextBox();
    }
}

// Usage example
public class AbstractFactory {
    public static void main(String[] args) {
        UIElementFactory factory;
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            factory = new WindowsUIElementFactory();
        } else {
            factory = new LinuxUIElementFactory();
        }

        UIElement button = factory.createButton();
        button.render();  // Output: Rendering a Windows-styled button or Rendering a Linux-styled button

        UIElement label = factory.createLabel();
        label.render();  // Output: Rendering a Windows-styled label or Rendering a Linux-styled label

        UIElement textBox = factory.createTextBox();
        textBox.render();  // Output: Rendering a Windows-styled text box or Rendering a Linux-styled text box
    }
}

