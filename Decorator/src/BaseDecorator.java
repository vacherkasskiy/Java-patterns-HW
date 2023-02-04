public class BaseDecorator implements DataSource {
    private final DataSource wrapper;
    public BaseDecorator() {
        wrapper = null;
    }
    public BaseDecorator(DataSource wrapper) {
        this.wrapper = wrapper;
    }
    public String getText() {
       return (wrapper != null ? wrapper.getText() : "The info is:");
    }
}
