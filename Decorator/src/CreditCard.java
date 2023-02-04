public class CreditCard extends BaseDecorator{
    public CreditCard(DataSource wrapper) {
        super(wrapper);
    }
    public CreditCard() {
       super();
    }
    @Override
    public String getText() {
        return super.getText() + "\nCredit card info";
    }
}
