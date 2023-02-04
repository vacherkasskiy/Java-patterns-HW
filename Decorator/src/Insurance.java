public class Insurance extends BaseDecorator{
    public Insurance(DataSource wrapper) {
        super(wrapper);
    }
    public Insurance() {
        super();
    }
    @Override
    public String getText() {
        return super.getText() + "\nInsurance info";
    }
}
