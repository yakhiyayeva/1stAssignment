interface Button {
    void render();
}

class DarkButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a dark-themed button.");
    }
}

interface UIFactory {
    Button createButton();
}

class DarkThemeFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new DarkButton();
    }
}
