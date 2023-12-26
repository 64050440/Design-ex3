public class PaymentController {

	// private Object paymentMethod;
	private IPayment paymentMethod;

	public void setPaymentMethod(IPayment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public void pay() {
		paymentMethod.pay();

	}
}
