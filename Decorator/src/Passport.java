public class Passport extends BaseDecorator {
    public Passport(DataSource wrapper) {
        super(wrapper);
    }
    public Passport() {
        super();
    }

    @Override
    public String getText() {
        return super.getText() + "\nPassport info";
    }
}
