package entities.P05BillsPaymentSystem;

import jakarta.persistence.*;

@Entity
@Table(name = "credit_cards")
public class CreditCard extends BillingDetails {

    @Column
    @Enumerated(value = EnumType.STRING)
    private CardType cardType;

    @Column(name = "expiration_month")
    private int expirationMonth;

    @Column(name = "expiration_year")
    private int expirationYear;

    private
}
